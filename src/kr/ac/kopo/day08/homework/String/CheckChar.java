package kr.ac.kopo.day08.homework.String;

import java.util.Scanner;

/*
 * 다음은 주어진 문자열에서 문자를 찾는 문제입니다. 
 * 입력값에 따라 다음과 같은 출력이 나오도록 해당 char의 개수를 리턴하는 checkChar 메소드를 작성하시오. 
 * - 문자열의 각 내용들을 비교하여 입력받는 char c의 값과 동일한 char의 개수를 리턴한다.
 * - 대소문자 구별하여 비교한다. 
 */
public class CheckChar {
	// 멤버변수는 보안 이유로 private으로 접근을 제한해준다. 
	private String strData;
	private char ch;
	
	Scanner sc;
	// 디폴트 생성자는 계속 입력값을 받을거니 Scanner 객체를 생성해준다. 
	public CheckChar() {
		sc = new Scanner(System.in);
	}
	
	// 탐색할 문자열 입력받기 
	public String getStr() {
		System.out.println("입력 스트링 : ");
		return sc.nextLine();
	}
	
	// 탐색도구 문자 입력받기 
	public char getChr() {
		System.out.println("확인할 문자 : ");
		return sc.nextLine().charAt(0);
	}
	
	// 탐색하기 
	public static int checkChar(String strData, char ch) {
		int cnt = 0;
		for(int i = 0; i < strData.length(); i++) {
			if(strData.charAt(i) == ch) cnt++; 
			// To. 교수님 : 오늘 수업시간에 알려주신 문자열 메소드들을 활용하고싶었으나 갯수를 세어야하기때문에 charAt()을 사용했습니다. 혹시 오늘 배운 메소드를 활용하는 방법이 있다면 알고싶습니다...! 
		}
		return cnt;
	}
	
	public void print() { // print() 메소드에서 다른 모든 메소드를 호출하여 main 클래스가 간단해지도록 하였다. 
		int i = 0;
		System.out.println("<<처리 결과>>");
		strData = getStr();
		System.out.println("입력 스트링 : String strData = " + "\"" + strData + "\"");
		while(i < 6) { // 임의로 5번까지 ch값을 입력받아 탐색해보게 하였고, 알파벳 소문자로 구분했다. 
			ch = getChr();
			System.out.println((char)(i+97) + ". ch = " + "\'" + ch + "\'" + "인 경우 => " + checkChar(strData, ch) + " 리턴");
			i++;
		}
	}
	
}
