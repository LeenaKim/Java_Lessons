package kr.ac.kopo.day18;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class RecieverMain {

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(10003); // 소켓을 열어놓고 대기 (serverSocket과 같은 개념)
			System.out.println("[수신 시작]");// 수신만 하는거라 inetAddress가 필요 없다. 
			
			byte[] buf = new byte[100];
			
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			
			while(true) {
				
				socket.receive(packet);
//			System.out.println("[수신된 내용] : "+ packet);// packet을 toString에서 오버라이딩하지않았기떄문에 주소값이 찍힘. 
//			System.out.println("[수신된 내용] : "+ Arrays.toString(buf));// 그래서 toString으로 변환해도 바이트가 변환된거기때문에 정수형으로 나오고, 3개만 보냈어도 배열 사이즈가 100이어서 100개가 디폴트 0으로 다 출력됨 
				// < 방법 1 > String의 생성자 이용 
				String msg = new String(buf);
				// < 방법 2 > packet의 getData() 메소드 이용 
				String msg2 = new String(packet.getData());
				System.out.println("[수신된 내용] : " + msg);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
