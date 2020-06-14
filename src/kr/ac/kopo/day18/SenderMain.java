package kr.ac.kopo.day18;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

import oracle.net.aso.e;
/*
 * tcp와 다르게, udp는 receiver을 켜놓지 않고 sender를 먼저 실행시킨다면 receiver가 준비가 되있던말던
 * 무조건 데이터를 보내기때문에 receiver가 준비가 되지 않은 순간동안 sender가 보낸 데이터는 받지 못하고 사라진다.  
 */
public class SenderMain {

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket();
			
			System.out.println("[송신 시작]");
			
			for(int i = 100; i <= 101; i++) {
				String msg = "데이터-";
				byte[] bytes = msg.getBytes();// 무조건 바이트로 주고받으므로 바이트로 변환해줌. 
				
				SocketAddress addr = new InetSocketAddress("localhost", 10003);
				
				DatagramPacket packet = new DatagramPacket(bytes, bytes.length, addr);
				Thread.sleep(1000);
				socket.send(packet);
				System.out.println("전송한 데이터 크기 : " + bytes.length);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		 
	}
}
