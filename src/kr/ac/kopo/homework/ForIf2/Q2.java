package kr.ac.kopo.homework.ForIf2;

import java.util.Scanner;

/**
 * 4개의 정수를 입력받아 가장 큰 수를 구하는 코드를 작성하시오. 
 * @author Lina
 *
 */
 /*
	리나씨 우리는 가장 큰수만이 필요하지 굳이 다른 세수의 크기는 필요하지 않아요
	그러므로 조건을 조금만 줄여도 결과가 나올 거 같습니다.
	한번 생각해볼까요??? ^^
 */
public class Q2 {
	public static void q2 (int one, int two, int three, int four) {
		if(one < two) {
			if(two < three) {
				if(three < four) {
					System.out.printf("%d", four);
				} else System.out.printf("%d", three);
			} else { // two > three
				if(two > four) {
					System.out.printf("%d", two);
				} else System.out.printf("%d", four);
			}
		} else {// one > two
			if(one < three) {
				if(three < four) {
					System.out.printf("%d", four);
				} else System.out.printf("%d", three);
			} else { // one > three
				if(one < four) {
					System.out.printf("%d", four);
				} else System.out.printf("%d", one);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 4개를 입력하세요. ");
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int four = sc.nextInt();
		q2(one, two, three, four);
	}
}
/*
 * < 풀이 >
 * 1번 문제와 같은 로직이지만 가장 큰 수만 출력하도록 하였다. 
 * 첫 번째 수가 두 번째 수보다 크면, 첫 번째 수를 세 번째 수와 비교하고, 그 중 큰 수를 나머지 네 번째 수와 비교하였다.
 */