package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main start...");
		
		Random r = new Random();
		int num = r.nextInt(3);
		
		System.out.println("추출된 난수: " + num);
		System.out.println(10 / num); // num이 0일때 예외발생. 예외가 생기는순간 소프트웨어가 종료되어 밑의 mainend는 실행이 안된다.  
		
		System.out.println("main end...");
	}

}
