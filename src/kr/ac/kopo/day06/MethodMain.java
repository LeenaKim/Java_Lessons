package kr.ac.kopo.day06;

public class MethodMain {

	static int factorial(int n) {
		int result = 1;
		for(int i = n; i >= 1; i--) {
			result = result * i;
		}
		
		return 6;
	}
	// return, 매개변수를 사용하기위해 가장 중요한건 내가 어떤 기능의 메소드를 만들려 한다- 가 머리속에 정립이 되어있어야 한다. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int result = factorial(3);
				
	}

}
