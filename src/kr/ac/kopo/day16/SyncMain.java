package kr.ac.kopo.day16;

class Sync {
	
	
	public synchronized void a() {
		
		System.out.println("hello");
		
		// 동기화 블럭을 걸어줄수도 있음. 
		synchronized(this) { // 이때의 this는 현재 사용하고있는 공유자원인 sync. syncronized의 매개변수로는 object형만 올 수 있다. 
			for(int i = 0; i < 10; i++) {
				System.out.print('a');
			}
		}// 이 문장은 lock에 의해서 한 스레드에 의해서만 수행되게 된다. a가 10번이 먼저 찍혀야 goodbye가 찍힌다.
		
		// cf) println 함수도 synchronized 블럭을 사용한다. 프린트 한 후 개행문자를 같이 동시에 찍어줘야하기때문에. 
		// 그래서 sync랑 println을 같이 찍으면 안된다. 
		
		System.out.println("goodbye");
		
		for(int i = 0; i < 10; i++) {
			System.out.print('a');
		}
	}
	
	public synchronized void b() {
		for(int i = 0; i < 10; i++) {
			System.out.print('b');
		}
	}
	
	public synchronized void c() {
		for(int i = 0; i < 10; i++) {
			System.out.print('c');
		}
	}
}

class SyncThread extends Thread {
	
	private Sync sync;
	private int type;
	
	public SyncThread(Sync sync, int type) {
		super();// thread 클래스의 생성자 호출 
		this.sync = sync;
		this.type = type;
	}
	
	@Override
	public void run() {
		
		switch(type) {
		case 1 :
			sync.a();
			break;
		case 2 :
			sync.b();
			break;
		case 3 :
			sync.c();
			break;
		}
		// 결과를 보면 a 열개, b 열개, c 열개 이렇게 나오지 않고 이거 찍혔다 저거 찍혔다 한다. 왜? st, st2, st3가 서로 무한 경쟁에 빠지기때문. 
	}
}

public class SyncMain {

	public static void main(String[] args) {

		Sync sync = new Sync();
		
		// st, st2, st3 모두가 같은 자원인 sync를 공유하려함. 
		SyncThread st = new SyncThread(sync, 1);
		SyncThread st2 = new SyncThread(sync, 2);
		SyncThread st3 = new SyncThread(sync, 3);
		
		st.start();
		st2.start();
		st3.start();
	}
}
