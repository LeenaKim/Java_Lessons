package kr.ac.kopo.day02;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("좋아하는 계절을 입력하세요 : ");
		String season = sc.nextLine();
// switch로 동등비교할경우 - 문자열을 받을 수 있게되면서 편해졌다. 
		switch(season) {
		case "봄" : case "spring" : case "SPRING" : 
			// case를 모두 나눠줄필요 없이 해당되는 모든 케이스를 한번에 써줄 수 있다. 
			System.out.println(season + "은 3월 ~ 5월까지입니다. ");
			break;
		case "여름" :
			System.out.println(season + "은 6월 ~ 8월까지입니다. ");
			break;
		case "가을" :
			System.out.println(season + "은 9월 ~ 11월까지입니다. ");
			break;
		case "겨울" :
			System.out.println(season + "은 12월 ~ 2월까지입니다. ");
			break;
		}
// 다중 if문으로 동등비교할경우 - 코드가 복잡해지기때문에 switch가 더 나을수도 있다.
		/*
		if (season.equals("봄")) {
			System.out.println(season + "은 3월 ~ 5월까지입니다. ");
		} else if (season.equals("여름")) {
			System.out.println(season + "은 6월 ~ 8월까지입니다. ");
		}
		*/
	}

}