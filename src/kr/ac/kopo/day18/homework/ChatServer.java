package kr.ac.kopo.day18.homework;


import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;

public class ChatServer {
	// main에서 static 없이 멤버변수를 바로 만들수 없으므로, chatServer 클래스에서 만들고 thread로 넘겨준다. 
	private HashMap<String, Socket> hm;

	public void start(int portNo) {
		
		try {
			// main함수에만 args가 있으므로 portNo(args[2])를 받아와 서버소켓을 생성 
			ServerSocket server = new ServerSocket(portNo);	
			hm = new HashMap<String, Socket>();
			
			while (true) {
				Socket client = server.accept();// 클라이언트가 접속할때까지 기다리다가 접속후 클라이언트 정보가 담긴 소켓을 만든다. 
				ChatServerThread chatThread = new ChatServerThread (client, hm);// 파일 입출력은 스레드가 하게 넘겨준다. 
				chatThread.start();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
