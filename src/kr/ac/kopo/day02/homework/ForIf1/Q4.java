package kr.ac.kopo.day02.homework.ForIf1;

import java.util.Scanner;

public class Q4 {
	public void q4 (int numer, int denom) {
		System.out.printf("몫 : %d\n", numer / denom);
		System.out.printf("나머지 : %d\n", numer % denom);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 
		Q4 test = new Q4();
		// Scanner 객체 생성 
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요. ");
		// 입력 버퍼에 남아있는 개행문자를 sc.nextLine()에서 받아준다.  
		int numer = sc.nextInt();
		sc.nextLine();
		
		System.out.println("나눌 수를 입력하세요.");
		// 입력 버퍼에 남아있는 개행문자를 sc.nextLine()에서 받아준다.  
		int denom = sc.nextInt();
		sc.nextLine();
		
		// 메소드 호출 
		test.q4(numer, denom);
	}

}