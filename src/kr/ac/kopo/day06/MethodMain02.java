package kr.ac.kopo.day06;

class Method {
	/*
	 * 메소드는 오버로딩(Overloading)을 지원 
	 * 오버로딩 : 클래스내에 동일한 메소드명을 가지면서 매개변수의 타입이나 개수가 다른 것. 
	 * 자바는 메소드명으로만 구분하는게 아니라 메소드명 + 매개변수로 구분한다. 
	 */
	void call() {
		System.out.println("call() 메소드 호출... ");
	}
	// 매개변수 없이 call()로 하면 duplicate 에러가 나오지만, 매개변수를 붙여주면 자바는 다른 메소드로 인식한다. -> 오버로딩. 
	void call(int i) {
		System.out.println("call(int) 메소드 호출... ");
	}
	
	void call(String str) {
		System.out.println("call(String) 메소드 호출... ");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출... ");
	}
	
	void call(String str, int i) {
		System.out.println("call(String, int) 메소드 호출... ");
	}
	/*
	 * void call(int i, String str) {} => 매개변수의 순서가 바뀌면 다른 메소드다. 
	 */
	
	// 문자를 받는 메소드를 주석처리해도 메인메소드의 호출자에서 에러가 나지 않음. 왜? 묵시적 형변환이 일어나서 call(int)가 호출됨.  
	/*
	 * void call(char c) {
		System.out.println("call(char) 메소드 호출... ");
	}
	 */
}
public class MethodMain02 {
	
	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.call(10); // call(int)를 주석처리하면 int를 넘겼지만 묵시적 형변환이 일어나 call(double d)가 호출됨. 
		m.call("Hello");
		m.call(12.34);
		m.call("goodbye", 100);
		m.call('A');
	}
}
