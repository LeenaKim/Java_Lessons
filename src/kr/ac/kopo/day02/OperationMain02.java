package kr.ac.kopo.day02;

import java.util.Random;

public class OperationMain02 {

	public static void main(String[] args) {
// 3항 연산자를 이용해 더 큰 수 출력하기 // 
		Random r = new Random();
		
		int num = r.nextInt(10);
		int num2 = r.nextInt(10);
		
		System.out.printf("num = %d num2 = %d\n", num, num2);
		
		/*
		int max = (num > num2 ? num : num2);
		System.out.println("MAX : " + max);
		*/
		// 한 줄로 표현 
		System.out.println("MAX : "+ (num > num2 ? num : num2));
		
		// 세개중 하나 뽑는 3항 연산자 
		String result = (num > num2 ? "num > num2" : (num < num2 ? "num < num2" : "num == num2"));
	}

}