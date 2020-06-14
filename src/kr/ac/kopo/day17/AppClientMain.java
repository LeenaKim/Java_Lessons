package kr.ac.kopo.day17;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class AppClientMain {
//172.16.88.149
	public static void main(String[] args) {
	
		try {
			System.out.println("서버와의 접속을 시도합니다. ");
			Socket socket = new Socket("172.16.88.129", 10000); // 내가 내 컴퓨터 접속할떈 Localhost, 외부에서 내 컴퓨터 접속할땐 ifconfig에서 알아본다. 			

			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			String msg = dis.readUTF();
			
			System.out.println("서버에서 전송된 메세지 : " + msg);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
