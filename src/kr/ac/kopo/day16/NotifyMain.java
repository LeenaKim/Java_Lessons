package kr.ac.kopo.day16;

class Data {
	// wait, notify는 동기화블럭에서만 사용가능 
	public synchronized void a() {
		
		// < wait, notify로 번갈아 나오게 하기 >
		try {
			notify(); // wait으로 인해 블럭에 걸려있는 스레드 하나를 빠져나오게 함 
			wait(); // 현재 run되고있는 스레드가 runnable로 넘어가는것이 아니라 block으로 넘어가기때문에 notifyThread02만이 남게된다.
			System.out.println("a() 메소드 호출 ");
		} catch (Exception e) {
			
		}
		
		/* < yield 로 번갈아 나오게 하기 > 
		try {
			Thread.sleep(100);// 이런식으로 시간텀을 주면 a와 b가 번갈아 나올 확률이 더 높아진다. 하지만 완벽하게 번갈아 수행되진 않는다. 
		} catch (Exception e) {
			
		}
		Thread.yield(); // yield : run 상태였던 스레드를 runnable로 집어오는것. 
		// yield는 block상태로 빠지지않고, run에 있던 스레드가 runnable로 넘어오는것이기때문에 데드락상태로 빠지지 않는다. 
		*/
	}
	
	public synchronized void b() {
		
		// < wait, notify로 번갈아 나오게 하기 >
		try {
			notify(); // 내가 얼음되기전에 먼저 땡을 해야 내가 얼음이 된 후 나를 땡해줄 사람이 있기때문에. 
			wait();
			System.out.println("b() 메소드 호출 ");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		/*
		Thread.yield(); // 하지만 워낙 찰나이기때문에 내가 a, b, a, b 번갈아 수행되게하고싶어도 할수가 없음. 
		*/
	}
}

class NotifyThread01 extends Thread {
	
	private Data data;
	
	public NotifyThread01(Data data) {
		this.data = data;
		
	}
	
	@Override
	public void run( ) {
		
		for(int i = 0; i < 10; i++) {
			data.a();
		}
	}
}

class NotifyThread02 extends Thread {
	
	private Data data;
	
	public NotifyThread02(Data data) {
		this.data = data;
	}
	
	@Override
	public void run( ) {
		
		for(int i = 0; i < 10; i++) {
			data.b();
		}
	}
}
public class NotifyMain {

	public static void main(String[] args) {
		
		Data data = new Data();
		
		NotifyThread01 nt01 = new NotifyThread01(data);
		NotifyThread02 nt02 = new NotifyThread02(data);
		
		nt01.start();
		nt02.start();
	}
}
