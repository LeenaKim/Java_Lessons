package kr.ac.kopo.day03.homework.ForIf2;

import java.util.Scanner;

/**
 * 정수 3개를 입력받아 큰 수에서 작은 수 순으로 출력하는 코드를 작성하시오. 
 * @author Lina
 *
 */
public class Q1 {

	public static void q1 (int one, int two, int three) {
		if(one < two) {
			if(two < three) System.out.printf("%d %d %d", three, two, one);
			else { // two > three
				if (one < three) System.out.printf("%d %d %d", two, three, one);
				else System.out.printf("%d %d %d", two, one, three);
			}
		} else { // one > two
			if(one < three) System.out.printf("%d %d %d", three, one, two);
			else { // one > three
				if(two < three) System.out.printf("%d %d %d", one, three, two);
				else System.out.printf("%d %d %d", one, two, three);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요. ");
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		q1(one, two, three);
	}

}
/*
 * < 풀이 > 
 * 모든 경우의수를 고려하였다.
 * 첫 번째 수가 두 번째 수보다 크거나, 그 반대일 경우를 기준으로 가장 큰 수부터 차례대로 출력한다.
*/