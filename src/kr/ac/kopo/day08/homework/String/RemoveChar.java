package kr.ac.kopo.day08.homework.String;

import java.util.Scanner;

/*
 * 주어진 문자열에서 특정 문자를 제거하는 메소드를 만들어보라.
 * - 문자열 (oriStr)의 내용중 주어진 문자(delChar)를 삭제한다.
 * - 삭제된 내용으로 문자열의 내용을 변경한다. 
 */
public class RemoveChar {
	private String oriStr;
	private char delChar;
	
	Scanner sc;
	
	public RemoveChar() {
		sc = new Scanner(System.in);
	}
	// 문자열 입력받기 
	public String getStr() {
		System.out.println("입력 스트링 : ");
		return sc.nextLine();
	}
		
	// 문자 입력받기 
	public char getChr() {
		System.out.println("제거할 문자 : ");
		return sc.nextLine().charAt(0);
	}
	
	public static String removeChar(String oriStr, char delChar) {
		StringBuffer finalStr = new StringBuffer();
		for(int i = 0; i < oriStr.length(); i++) {
			if(oriStr.charAt(i) != delChar) {
				finalStr.append(oriStr.charAt(i));
			}
		}
		return finalStr.toString();
	}
	
	public void print() { // print() 메소드에서 다른 모든 메소드를 호출하여 main 클래스가 간단해지도록 하였다. 
		int i = 0;
		System.out.println("<<처리 결과>>");
		oriStr = getStr();
		System.out.println("입력 스트링 : String strData = " + "\"" + oriStr + "\"");
		while(i < 6) { // 임의로 5번까지 ch값을 입력받아 탐색해보게 하였고, 알파벳 소문자로 구분했다. 
			delChar = getChr();
			System.out.println((char)(i+97) + ". ch = " + "\'" + delChar + "\'" + "인 경우 => " + removeChar(oriStr, delChar) + " 리턴");
			i++;
		}
	}
}
