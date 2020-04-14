package kr.ac.kopo.day01;

import java.util.Scanner;

/*
 * Scanner 클래스
 * 키보드를 통해 정수, 실수, 논리값, 문자열을 입력받는 기능을 제공하는 클래
 */

public class ScannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner는 java.util 밑에 있는 클래스이기 때문에 참조형이다. 객체 생성.
		Scanner sc = new Scanner(System.in);
		
		// 논리 자료형 입력받기 
		System.out.println("참/거짓 중 선택하세요(true, false만 입력 가능) : ");
		boolean bool = sc.nextBoolean();
		System.out.println("bool : "+ bool);
		
		// 정수 자료형 입력받기 
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("num = " + num);
		
		// Scanner 도큐먼트에는 next 뒤에 String이라는 문자열 입력받는 메소드가 없음.
		// 대신, next() 메소드로 문자열 입력받기 가능.
		System.out.println("문자열을 입력하세요 : ");
		//String str = sc.next(); 
			// but, next()의 경우 많은 문자열을 받지 못하고 공백이 나오면 입력받는걸 끝내버림.
		String str = sc.nextLine();
			// 그래서 나온게 nextLine(). 엔터를 누르면 입력이 끝나도록. 
		System.out.println("str : [" + str + "]");
			
	}

}