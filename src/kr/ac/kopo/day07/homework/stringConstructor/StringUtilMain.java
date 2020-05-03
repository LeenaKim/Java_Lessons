package kr.ac.kopo.day07.homework.stringConstructor;

import java.util.Scanner;

public class StringUtilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringUtil strU = new StringUtil(); // StringUtil 클래스 객체 생성. 
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 하나 입력하시오. ");
		String c = sc.next();
		System.out.println("< 1번 > 대문자입니까? : " + strU.isUpperChar(c.charAt(0))); // 입력받은 한 문자를 가지고 두 메소드를 호출한다. 
		System.out.println("< 2번 > 소문자입니까? : " + strU.isLowerChar(c.charAt(0)));
		
		System.out.println("두 정수를 입력하시오. ");
		int i = sc.nextInt(); 
		sc.nextLine();
		int j = sc.nextInt();
		sc.nextLine();
		System.out.println("< 3번 > 둘 중 큰수는? : " + strU.max(i, j));
		System.out.println("< 4번 > 둘 중 작은수는? : " + strU.min(i, j));
		
		System.out.println("문자열을 입력하시오. ");
		String str = sc.nextLine();
		System.out.println("< 5번 > 문자열을 거꾸로 출력하면? " + strU.reverseString(str));
		System.out.println("< 6번 > 소문자를 대문자로 바꾸면? " + strU.toUpperString(str));
		System.out.println("< 7번 > 대문자를 소문자로 바꾸면? " + strU.toLowerString(str));
	}

}
