package kr.ac.kopo.day17;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * java EchoSErverMain 10001 - EchoServer는 10001번 서버를 이용해 동작하게하고싶다. 
 * 자바 파일과 함꼐 포트번호가 있어야만 서버를 열 수 있다. 
 */
public class EchoServerMain {

	public static void main(String[] args) {
		
//		System.out.println(args.length);
		// run configuration에서 arguments에 10001을 입력한 후 실행하면 args.length는 1이된다. 
		
		if(args.length != 1) {
			System.out.println("-------------------------------------------");
			System.out.println("    사용법 : java EchoServerMain  port번호  ");
			System.out.println("-------------------------------------------");
		}
		
		int portNo = Integer.parseInt(args[0]); // 클라이언트에서 접속한 포트번호를 가져온다.
		try {
			ServerSocket server = new ServerSocket(portNo);		
			while (true) {
				System.out.println("클라이언트의 접속을 기다립니다....");
                Socket client = server.accept();
                EchoThread echoThread = new EchoThread (client);
                echoThread.start();
            }
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		/*
		try {
			ServerSocket server = new ServerSocket(portNo);
			System.out.println("클라이언트의 접속을 기다립니다....");
			
			Socket client = server.accept();
			
			
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
		*/
	}
}
