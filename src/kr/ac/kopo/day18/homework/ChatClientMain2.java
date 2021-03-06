package kr.ac.kopo.day18.homework;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import kr.ac.kopo.util.FileClose;

/*
 * java EchoClientMain 172.16.88.130 10001로 접속해야함. 
 */
public class ChatClientMain2 {

	public static void main(String[] args) {
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		ClientReceiver cr = null;
		
		if(args.length != 3) {//ip도 있어야하고 port번호도 있어야해서 args의 길이는 2이다. 
			System.out.println("-------------------------------------------------------");
			System.out.println("    사용법이 잘못되었습니다. ");
			System.out.println("    사용법 : java EchoClientMain  서버IP  접속PORT번호");
			System.out.println("-------------------------------------------------------");
			System.exit(0);
		}
		
		String serverIp = args[0];
		int port = Integer.parseInt(args[1]);
		String id = args[2];// args의 세번째 매개변수를 id로 주었으므로 아이디를 args로 받아온다. 
		
		System.out.println("$ java ChatClient " + id + serverIp);
		try {
			Socket socket = new Socket(serverIp, port);		
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));// system.in이 inputstream을 반환하니까 inputstreamreader로 읽어주고 bufferereader로 변환 
			
			// 키보드로 입력받은 메세지를 서버에 전송할 객체 필요 
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			cr = new ClientReceiver(socket);
			
			pw.println(id);// 유저 아이디를 서버로 보내기 
			pw.flush();
			
			System.out.println("전송할 메세지를 입력하세요(quit 입력시 종료) : ");
			cr.start();
			
			while(true) {
				
				String msg = keyboard.readLine();
				
				
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("서버와의 접속 종료...");
					socket.close();
				}
				
				pw.println(msg);
				pw.flush();
				
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
