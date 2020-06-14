package kr.ac.kopo.day16;

/*
 * thread를 생성하는 2가지 방식
 * 1. Thread 클래스 상속
 * 2. Runnable 인터페이스 상속 - 더 일반적으로 사용된다. 왜? 클래스와 클래스간의 상속은 단일상속만 지원해서. 
 */
class ExtendThread extends Thread {

	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 눈붙이기...");
		}
	}
}

class ImplementThread implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 입 만들기...");
		}
	}

}
public class ThreadMain02 {

	public static void main(String[] args) {
		System.out.println("현재 실행중인 스레드 개수 : " + Thread.activeCount());// jvm은 메인 메소드가 돌아가는것자체가 하나의 쓰레드라서. 결국 메인과 내가 만든 thread들과 같이 경쟁하게된다. 
		ExtendThread et = new ExtendThread();
		ImplementThread it = new ImplementThread();
		Thread t = new Thread(it);// Thread 클래스의 세번째 생성자가 Runnable 인터페이스를 구현한 객체를 매개로 받는다. 인터페이스만 상속받은 객체는 start() 메소드가 없다. Thread클래스에만 start() 메소드가 있기때문. 
		
		et.start();
//		it.start(); // start 메소드는 Thread 클래스에만 있고, 인터페이스엔 없다. 
		t.start();
		
		try {
			et.join();
			t.join();			// 두 작업이 모두 끝나야만 감독을 종료할 수 있다.
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("인형만들기 감독 종료...");
		
//		System.out.println("현재 실행중인 스레드 개수 : " + Thread.activeCount());
//		System.out.println("인형작업종료....");
	}
	
}
