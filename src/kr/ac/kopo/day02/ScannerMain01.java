package kr.ac.kopo.day02;

import java.util.Scanner;

public class ScannerMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Scanner의 입력 버퍼 버그 //
		/*
		 * 문자열을 입력 : hello world
		 * 정수를 입력 : 123
		 * 문자열 : hello world 정수 : 123
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력 : ");
		
		/*
		int num = sc.nextInt();
		sc.nextLine();
		*/
		
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println("문자열을 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("문자열 : "+str+", 정수 : "+num);
	// => 정수를 먼저 입력하고 문자열 입력할 경우 정수만 입력받고 문자열은 입력받지 않고 바로 출력시킴. 
	}

}