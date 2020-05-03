package kr.ac.kopo.day03.homework.ForIf2;

import java.util.Scanner;

/**
 * 정수를 입력받아 1에서부터 입력받은 정수사이의 숫자를 출력하는 코드를 작성하시오. 
 * @author Lina
 *
 */
public class Q3 {
	public static void q3(int a) {
		for(int i = 1; i <= a; i++) {
			System.out.printf("%d ", i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1-100 사이의 정수를 입력 : ");
		int a = sc.nextInt();
		q3(a);
	}

}
/*
 * < 풀이 >
 * 반복문을 통해 i가 1일때부터 입력받은 정수까지 출력한다. 
*/