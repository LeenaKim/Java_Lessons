package kr.ac.kopo.day16;

class PriorityThread extends Thread {
	
	public PriorityThread() {
		super();
	}
	
	public PriorityThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(getName() + "우선순위 : " + getPriority());// 디폴트 우선순위는 5위 
		
		for(int i = 0; i <= 100; i++) {
			System.out.println(getName() + " : " + i + "번째 작업중...");
		}
	}
}


public class PriorityMain {

	public static void main(String[] args) {
		
		PriorityThread pt = new PriorityThread("우선순위 1인 스레드");
		PriorityThread pt2 = new PriorityThread("우선순위 10인 스레드");
		PriorityThread pt3 = new PriorityThread("우선순위 5인 스레드");
		
		pt.setPriority(Thread.MIN_PRIORITY);// 우선순위를 가장 낮은 순위로 바꿔주기 
		pt2.setPriority(Thread.MAX_PRIORITY);// 우선순위를 가장 높은 순위로 바꿔주기 
		pt3.setPriority(Thread.NORM_PRIORITY);// 중간 우선순위로 바꿔주기 
		// but, 우선순위가 높다고해서 먼저 작업이 끝난다는 보장은 없다. 우선순위 높은애가 작업대에 먼저 올라간다 뿐이지, 먼저 끝난다는건 아니다. 
		// 우선순위가 높다는건 그만큼 선택될 확률이 높다는거지, 무조건 먼저 실행된다는것은 아니다. 확률적으로 높다는 것일 뿐. 
		pt.start();
		pt2.start();
		pt3.start();
	}
}
