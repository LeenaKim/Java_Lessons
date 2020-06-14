package kr.ac.kopo.day16;

class AAA extends Thread {
	// thread를 상속받은 AAA thread
	// AAA가 해야할 작업을 run() 메소드에 쓴다.
	@Override
	public void run() {
		while(true) {
			System.out.println("go!!!");// 작업 내용 
		}
	}
	
}

class BBB extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("\t\tstop!!!");
		}
	}
}
public class ThreadMain01 {

	public static void main(String[] args) {
//		Thread t = new Thread(); // run()을 정의해야해서 의미가 없다. 클래스를 구현해야한다.
		
		// thread를 ready 상태로 만들어주기 
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		// ready => runnable 
		aaa.start();
		bbb.start();
		
//		aaa.run();
//		bbb.run();
		// run을 실행할경우 그냥 aaa의 run 메소드를 실행하라 하는것이기때문에 aaa에서 정의된 무한루프만 돌고, bbb의 작업은 수행되지 않는다. 
		// 이것이 우리가 지금까지 수행해왔던 방식. 동시성에 대한 개념이 없었다. 
		// 하지만 다중상속을 받기위해 인터페이스로 스레드 클래스를 구현할수도 있다. 
	}
}
