package kr.ac.kopo.day05.homework.Array;

import java.util.Scanner;

/**
 * 다음의 결과를 보이는 프로그램을 작성하시오. 
 * 1 - 100 사이의 정수를 입력하시오 : 64
 * 64의 약수의 개수 : 7개
 * < 64의 7개 약수 출력 >
 * 1 2 4 8 16 32 64
 * 
 * 
 * @author Lina
 *
 */
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[30];
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - 100 사이의 정수를 입력하시오 : ");
		int n = sc.nextInt();
		int cnt = 0; // 약수의 개수를 세어줄 변수 
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				nums[cnt] = i; // 나누어 떨어지면 배열에 추가하고 cnt를 증가시켜준다. 
				cnt++;
			}
		}
		System.out.println(n + "의 약수의 개수 : " + cnt + "개");
		System.out.println("< " + n + "의 " + cnt + "개 약수 출력 >");
		for(int num : nums) {
			if(num != 0) System.out.printf("%3d", num); // 배열 크기가 30개였으므로 나머지는 0으로 되있을 것이다. 0이 아닐경우만 출력해준다. 
		}
	}

}
