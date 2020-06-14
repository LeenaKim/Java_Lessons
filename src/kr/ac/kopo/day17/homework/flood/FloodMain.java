package kr.ac.kopo.day17.homework.flood;

public class FloodMain {

	public static void main(String[] args) {
		
		Donation don = new Donation();
		
		// 네개의 스레드가 공유하는 공유자원인 Donation 객체와 각 스레드의 이름으로 스레드 생성 
		FloodThread ft = new FloodThread(don, "1");
		FloodThread ft2 = new FloodThread(don, "2");
		FloodThread ft3 = new FloodThread(don, "3");
		FloodThread ft4 = new FloodThread(don, "4");
		
		// 스레드를 run 시킨다. 
		ft.start();
		ft2.start();
		ft3.start();
		ft4.start();
		
		try {
			ft.join();
			ft2.join();
			ft3.join();
			ft4.join();		
		} catch(Exception e) {
			e.printStackTrace();
		}
		// 앞의 스레드가 모두 끝났을때 총 성금액을 출력한다. 
		System.out.println("국민들이 보내주신 성금 총액 : " + don.getTotalDonation());
	}
}
