package kr.ac.kopo.homework.ForIf1;

public class Q1 {
	
	public void q1 (char[] ch) {
		System.out.println("-------------------");
		System.out.println("영문자 모음의 아스키 코드 ");
		System.out.println("-------------------");
		// 영문자 모음 배열을 하나씩 순회하며 ascii 코드 값을 출력한다. 
		for(int i = 0; i < ch.length; i++) {
			int num = ch[i];
			System.out.printf("%c = %d\n", ch[i], num);
		}
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 영문자 모음 배열 생성 
		char[] ch = {'A', 'E', 'I', 'O', 'U'};
		// 객체 생성 
		Q1 test = new Q1();
		// 메소드 호출 
		test.q1(ch);
	}

}