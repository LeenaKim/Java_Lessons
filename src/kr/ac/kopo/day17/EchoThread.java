package kr.ac.kopo.day17;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoThread extends Thread {

	Socket client;
	
	public EchoThread(Socket client) {
		this.client = client;
	}
	
	@Override
	public void run() {
		try {
			
			System.out.println("접속된 클라이언트 정보 : [" + client.getInetAddress() + "]");
			
			// 클라이언트가 전송해준 메세지를 수신할 객체 필요 
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			// 수신한 메세지를 클라이언트에게 재전송할 객체 필요 
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					// 클라이언트와의 접속이 끊겼음을 서버에서 어떻게 알것인가? 더이상 넘어오는 문자가 없으면 null이 되고, 아니면 quit까지 날라오게 해서 날라온 문자가 quit일때 서버에서 종료되게 할 수 있다. 
					System.out.println("클라이언트 [" + client.getInetAddress() + "] 과의 접속 해제 ");
					client.close();
					break;
				}
				
				System.out.println("[" + client.getInetAddress()+ "] 보낸메세지 : " + msg);
				
				pw.println(msg);
				pw.flush();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
