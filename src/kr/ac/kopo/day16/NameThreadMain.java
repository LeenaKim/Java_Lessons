package kr.ac.kopo.day16;

class NameThread extends Thread {

	
	NameThread() {
		super();
	};
	
	NameThread(String name){
		super(name);// 부모클래스에도 name을 매개변수로 하는 생성자가 있으므로 super로 호출해줘도 된다. 
		//setName(name); // 내가 이름 정해주기 
		
	}
	
	@Override
	public void run() {
		System.out.println("스레드 이름 : " + getName()); // Thread 클래스에는 private 멤버변수인 name이 있고, 이를 접근하기 위한 getName, setName 메소드가 있다. 
		// NameThread-1 ==> ChangeThread-1
		// NameThread-2 ==> ChangeThread-2 이름 변경
		
		int idx = getName().lastIndexOf('-');
		String no = getName().substring(idx);
		
		setName("ChangeThread" + no);
		System.out.println("변경된 스레드 이름 : " + getName());
		
		
	}
}


public class NameThreadMain {

	public static void main(String[] args) {
		
		NameThread nt = new NameThread("NameThread-1");
		NameThread nt2 = new NameThread("NameThread-2");
		nt.start(); // 디폴트 : thread-01
		nt2.start();// 디폴트 : thread-02
	}
}
