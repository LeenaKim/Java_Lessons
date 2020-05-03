package kr.ac.kopo.day03.homework.ForIf2;

import java.util.Scanner;

/**
 * 단을 입력받아 구구단을 출력하세요.
 * @author Lina
 *
 */
public class Q6 {
	public static void q6(int num) {
		System.out.printf("*** %d단 ***\n", num);
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("2-9 단을 입력 : ");
		int num = sc.nextInt();
		q6(num);
	}

}
/*
 * < 풀이 >
 * 입력받은 정수 num을 반복문을 돌려 1부터 9까지 곱한 값을 출력해준다. 
*/ 