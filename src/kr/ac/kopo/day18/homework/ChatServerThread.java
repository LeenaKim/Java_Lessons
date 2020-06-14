package kr.ac.kopo.day18.homework;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class ChatServerThread extends Thread {

	private Socket client;
	private PrintWriter pw;
	private String id;
	private String userMsg;
	private HashMap<String, Socket> hm;
	private InputStream is;
	private InputStreamReader isr;
	private BufferedReader br;
	
	// 생성자에서 파일 입출력 객체를 생성하고 id를 받아온다. 
	public ChatServerThread(Socket client, HashMap<String, Socket> hm) {
		this.client = client;
		this.hm = hm;
		try {
			// 클라이언트가 전송해준 메세지를 수신할 객체 필요 
			is = client.getInputStream();
			isr = new InputStreamReader(is, "utf-8");
			br = new BufferedReader(isr);
			id = br.readLine();
			System.out.println("접속한 사용자의 아이디는 "+ id + " 입니다. ");
			synchronized(this.hm) {
				this.hm.put(id, client);				
			}
			toAll("[ " + id + " ] 님이 접속하셨습니다.");// 모든 접속 유저에게 전송 
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		try {

			while(true) {
				userMsg = br.readLine(); // 클라이언트 메세지 가져오기 
			
				if(userMsg.equalsIgnoreCase("quit")) {
					System.out.println(id + "님이 접속을 종료했습니다.  ");
					hm.remove(id);// 접속 종료시 해시맵에서 제거 
					client.close();
				} else if(userMsg.contains("/to")) {
					// 귓속말 메소드 // 
					toOne(userMsg, id);
				} else {
					// 전체 대화 메소드 // 
					toAll("[ " + id + " ] : " + userMsg);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 *  id와 소켓이 담긴 해시맵을 set으로 변환해 반복문을 돌며 소켓에 저장된 클라이언트 ip를 받아 output을 보내준다. 
	 * @param msg
	 */
	public void toAll(String msg) {
		Set<Entry<String, Socket>> entry = hm.entrySet();
		
		try {
			for(Entry<String, Socket> e : entry) {
				
				Socket soc = e.getValue();
				//System.out.println(soc);
				// 수신한 메세지를 클라이언트에게 재전송할 객체 필요 
				OutputStream os = soc.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				pw = new PrintWriter(osw);
				
				pw.println(msg);
				pw.flush();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 귓속말을 할땐 매개로 받은 메세지를 아이디, 메세지 내용으로 나누어 수신인 id를 key로 해시맵에서 해당 유저의 socket을 찾아 전송한다. 
	 * @param msg
	 * @param id
	 */
	public void toOne(String msg, String id) {
		
		int begin = msg.indexOf(" ");// 첫번째 스페이스 
		int end = msg.indexOf(" ", begin + 1);// 두번째 스페이스 
		String toId = msg.substring(begin+1, end);// 첫번째 스페이스와 두번째 스페이스 사이의 문자가 귓말을 보내고자하는 아이디 
		Socket toSoc = hm.get(toId);// 아이디를 key로 받아 해당 소켓을 받아옴 
		String toMsg = msg.substring(end+1);
		
		try {
			OutputStream os = toSoc.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			pw.println("[ " + id + " 님이 다음과 같은 메세지를 보냈습니다 ] : " + toMsg);
			pw.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
