package kr.ac.kopo.homework.Array;

import java.util.Scanner;

/**
 * 5개의 짝수만 입력받아 출력하는 코드를 작성 
 * 짝수가 나올때까지 다시 입력받아 총 5개가 되어야 한다. 
 * @author Lina
 *
 */
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] even = new int[5]; // 짝수를 저장할 배열 생성 
		int cnt = 0; // 짝수의 개수를 셀 변수 생성 
		while(cnt < 5) { 
			System.out.println("정수를 입력하세요. ");
			int num = sc.nextInt();
			if(num %2 == 0) {
				even[cnt] = num; // 짝수일경우 짝수배열에 cnt 인덱스로 저장한다.
				cnt++; // 짝수인 경우를 하나 늘려준다. 
			} else System.out.println("짝수가 아닙니다. "); // 짝수가 아닌경우 아니라고 출력하고 위로 올라가 다시 정수를 입력하라 한다. 
			
		}
		
		System.out.println("< 5개의 정수 출력 >");
		for(int n : even) {
			System.out.printf("%3d", n);
		}
	}

}
