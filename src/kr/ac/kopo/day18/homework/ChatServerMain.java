package kr.ac.kopo.day18.homework;

public class ChatServerMain {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("-------------------------------------------");
			System.out.println("    사용법 : java EchoServerMain  port번호  ");
			System.out.println("-------------------------------------------");
		}
		
		System.out.println("$ java ChatServer ");
		int portNo = Integer.parseInt(args[0]); // 클라이언트에서 접속한 포트번호를 가져온다.
		
		ChatServer cs = new ChatServer();
		cs.start(portNo);
	}
}
