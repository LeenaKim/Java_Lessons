package kr.ac.kopo.day17.homework.flood;
/*
 * 교수님께...
 * 이렇게 하는게 맞는건지 모르겠습니다... 
 */
public class FloodThread extends Thread {

	private Donation don = null;
	
	FloodThread() {};
	
	// Main에서 두 매개변수를 받아 부모클래스인 Thread의 생성자를 통해 스레드 이름을 정해주고, 각 네개의 Donation 객체를 하나씩 받을때마다 멤버변수에 저장한다. 
	FloodThread(Donation don, String name) {
		super(name);
		this.don = don;
	}
	
	@Override
	public void run() {
		int howMuchByCenter = 0;
		// 각 스레드마다 열번씩 반복한다. 
		for(int i = 0; i < 10; i++) {
			howMuchByCenter += don.setEachDonation(getName());// 스레드 이름을 넘겨줘 Donation에서 출력할 수 있게한다. 
		}
		System.out.println(getName() + "번 콜센터에서의 총 모금액 : " + howMuchByCenter);// 각 스레드가 열번 반복이 끝났으면 센터별 금액을 출력한다. 
	}
}
