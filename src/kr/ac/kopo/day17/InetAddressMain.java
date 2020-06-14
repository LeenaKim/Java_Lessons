package kr.ac.kopo.day17;

import java.net.InetAddress;

public class InetAddressMain {

	public static void main(String[] args) {
		
		try {
			InetAddress localhost = InetAddress.getLocalHost();		
			
			System.out.println("내 컴퓨터의 네트워크 이름 : "+ localhost.getHostName());
			System.out.println("내 컴퓨터의 IP 정보 : "+ localhost.getHostAddress());
			
			InetAddress addr = InetAddress.getByName("www.kopo.ac.kr");// 해당 도메인을 가지고있는 애의 ip정보를 돌려줌 (inetaddress형 리턴)
			System.out.println("폴리텍 ip 정보 : " + addr);
			
			InetAddress[] addrs = InetAddress.getAllByName("www.naver.com"); // naver.com으로 접근하는 모든 아이피 리턴. InetAddress[] 형으로 리턴. 
			System.out.println("----------------------------");
			System.out.println("\t 네이버 IP 정보 ");
			System.out.println("----------------------------");
			for(InetAddress a : addrs) {
				System.out.println(a);
			}
			System.out.println("----------------------------");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
