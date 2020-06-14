package kr.ac.kopo.day16;

class Calculator{

	private int count = 0;
	
	public synchronized void sum() {
		for(int i = 0; i < 10000; i++) {
			/* < 아니면 이렇게 동기화블럭을 만들어줘도 된다. > 
			synchronized(this) {
				count++;
			}
			*/
			count++;
		}
	}
	
	public int getCount() {
		return count;
	}
}

class MultiThread extends Thread {
	
	private Calculator cal;
	
	public MultiThread(Calculator cal) {
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.sum();
	}
}
public class MultiThreadMain {

	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		
		MultiThread mt = new MultiThread(cal);// 두 객체가 하나의 공유자원 cal을 공유하게 된다. 
		MultiThread mt2 = new MultiThread(cal);
		
		mt.start();
		mt2.start();
		
		try {
			mt.join();
			mt2.join();			
		} catch(Exception e) {
			e.printStackTrace();
		}// join() : 메인스레드의 마지막 문장은mt와 mt2 스레드가 모두 끝나야 수행한다. 내가 메인에서 찍고싶은 getCount는 카운트가 다 수행한 후에 카운트값을 보려는거니까. 
		// 이 코드는 조인을 통해서 카운트 20000을 찍을수 없음. 왜냐면 조인을 쓰더라도 누가 먼저 수행되는지는 아무도 모르기때문에. 
		
		System.out.println(cal.getCount());// 원래대로라면 20000이 출력되야함. sum이 만번씩 두번 돈거니까. 하지만 20000이 아님. 시행할떄마다 숫자가 변함. 
		// 왜? count 변수를 두 객체가 같이 고치다보니 count + 1이라는 순서를 서로 잡기가 힘듦. 1을 더하기 전에 다른 스레드가 곂치면서 제대로 수행하지 못하는 횟수들이 생기게됨. 
		// 그렇게 부딫히는 회수만큼 숫자가 손실되게된다. 
		// sum 메소드에 synchronized를 붙여 lock을 걸어줘야 서로 +1을 하는 순간에 끼어들지 않는다. 
		
	}
}
