package kr.ac.kopo.day02.homework.ForIf1;

import java.util.Scanner;

public class Q7 {
	public void q7 (char alphabet) {
		// ascii 코드가 91보다 작을 경우 소문자다. 
		if(alphabet < 91) {
			// 소문자일 경우 ascii코드에 32를 더하면 대문자가 된다. 소문자-대문자의 차이가 32기 때문. 
			System.out.printf("입력(알파벳) : %c\n 변경된 값 : %c\n", alphabet, alphabet+32);
		} 
		else {
			// 대문자일 경우 반대로 32를 빼주면 된다. 
			System.out.printf("입력(알파벳) : %c\n 변경된 값 : %c\n", alphabet, alphabet-32);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳을 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		// 입력값으로 문자열을 받는다. 
		String inputStr = sc.nextLine();
		// 문자열의 0번째 인덱스 알파벳 값을 따로 저장한다. 
		char alphabet = inputStr.charAt(0);
		
		// 객체 생성 
		Q7 test = new Q7();
		// 메소드 호출 
		test.q7(alphabet);
	}

}