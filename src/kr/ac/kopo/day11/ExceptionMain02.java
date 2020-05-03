package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main start...");
		
		
		Random r = new Random();
		int num = r.nextInt(3);
		// 예외처리를 해보자. 
		try {
			System.out.println("추출된 난수: " + num);
			System.out.println(10 / num); // num이 0일때 Arithmetic Exception 발생. 예외가 생기는순간 소프트웨어가 종료되어 밑의 mainend는 실행이 안된다.  
		} catch(ArithmeticException ae) {
			System.out.println("예외발생 !!!"); // catch를 해줬기때문에 예외발생했더라도 프로그램 계속 진행. main end 구문까지 실행된다. 
			System.out.println("발생 이유" + ae.getMessage()); // getMessage() : 예외의 내용을 알려주는 ArithmeticException의 private 멤버변수 호출 메소드 
			ae.printStackTrace(); // printStackTrace() : 에러난 이유를 찾아가며 프린트해라 
		}
		System.out.println("main end...");
	}
	// 근데, 지금 num이 0일때 예외가 생기는건데 그냥 if(num != 0) 이라는 조건을 걸면 되지 않냐? num이 0이 아닐때도 예외가 날 수 있다. 예외 발생 이유가 뭔지 모를경우를 위해 예외처리가 존재한다. 

}
