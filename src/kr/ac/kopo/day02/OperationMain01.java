package kr.ac.kopo.day02;

import java.util.Scanner;

public class OperationMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 논리연산자를 활용한 조건식 추가 2 - 약수 여부 //
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a를 입력 : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println("b를 입력 : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		//b가 a의 약수 여부 판
		boolean result = b!=0 && a % b == 0;
		//꼭 조건문을 쓰는게 아니라 이 자체의 논리연산자를 활용해서 b가 0이 아닐때만 계산가능하도록.
		System.out.println("약수 여부 : " + result);
		
// 논리연산자를 활용한 조건식 추가 1 - 짝수 여부 //
		/*
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean result = (num >= 0) && (num % 2 == 0);
		// num이 음수일경우는 false를 리턴하도록, num>=0이라는 조건을 추가한다.
		
		System.out.println(num + "짝수판단여부 : "+ result);
		*/
		
// 논리연산자 교환법칙 //
		/*
		int a = 1, b = -1, c = 0;
		
		//boolean bool = (++a > 0) && (++b > 0);
		// (2 > 0) && (0 > 0) => T && F => F
		
		//boolean bool = (--a > 0) && (--b > 0);
		// (0 > 0) && => 왼쪽 항부터 F라 뒤를 안보고 답은 어쨌든 F.
		// a = 0, b = -1, c = 0
		
		boolean bool = (--b > 0) && (--a > 0);
		// 순서를 바꾸면 b = -2, a = 1, c = 0 으로, 앞의 식과 교환법칙이 성립되지 않음.
		
		System.out.printf("a = %d b = %d c = %d bool = %b\n", a, b, c, bool);
		*/
		
	}

}