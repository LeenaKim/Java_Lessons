package kr.ac.kopo.day17;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServerMain {

	public static void main(String[] args) {
		// server socket이 서버에서 기다리고있는 포트의 역할을 한다.
		try {
			ServerSocket server = new ServerSocket(10000);// 외부장치를 이용하는건 다 checked exception			
			System.out.println("애플리케이션 서버 구동... ");
			
			Socket client = server.accept();
			System.out.println("접속된 클라이언트 정보 : " + client);
			//접속된 클라이언트 정보 : Socket[addr=/127.0.0.1,port=51156,localport=10000] (접속한 클라이언트의 아이피/ 클라이언트 포트/ 내 포트/ )
//			System.out.println("로컬 socket port : " + client.getLocalPort());
//			System.out.println("클라이언트 socket port : " + client.getPort());
//			System.out.println(("클라이언트 socket ip : " + client.getInetAddress().getHostAddress()));
//			
			String msg = "리나의 서버로 접속을 환영합니다. ";
			
			OutputStream os = client.getOutputStream();
			// outputstream은 바이트단위라 문자를 찍어줄순 없음. 데이터 아웃풋 스트림을 사용해보자. - 기본 자료형 
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(msg);
			dos.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
