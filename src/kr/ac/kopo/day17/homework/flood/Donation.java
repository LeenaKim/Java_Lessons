package kr.ac.kopo.day17.homework.flood;
// 스레드들이 공유하고자하는 자원 클래스 
public class Donation {

	private static int ttlDonation = 0;// 총 성금액 
	private int howMuch = 0;// 전화 한 통마다 받은 성금액 
	public synchronized int setEachDonation(String name) {
		
		try {
			notify();// 각 콜센터가 번갈아가며 나오게하기위해 먼저 들어온 스레드가 다른 스레드를 block에서 풀어준다. 
			wait();// 그리고 자신은 block상태에 빠진다. 
			howMuch = (int)(Math.random()*10+1)*1000;
			ttlDonation += howMuch;
			System.out.println(name + "번 콜센터 : " + howMuch + "원을 받았습니다. ");		
			notifyAll();// 나가기전 모든 스레드를 runnable로 만든다. 
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			return howMuch;			
		}
		
	}
	
	public int getTotalDonation() {
		return ttlDonation;
	}
	
}
