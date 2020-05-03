package kr.ac.kopo.day05.homework.Array;

import java.util.Scanner;

public class Prof_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length;) {
			System.out.println("num" + (i+1) + " : ");
			nums[i] = Integer.parseInt(sc.nextLine());
			if(i > 0 && nums[i-1] >= nums[i]) { // 0번째 인덱스는 num[-1]이 없으므로 0보다 클때의 조건도 추가 
				for(int j = 0; j < i; j++) {
					if(j != 0) System.out.println(", ");
					System.out.print(nums[j]);
				}
				System.out.println("보다 큰 수를 입력하세요...");
			} else {
				i++; // 올바르게 입력했을때만 증가하도록 
			}
		}
		
		System.out.println("< PRINT >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i = nums.length-1; i >= 0; i--) {
			/*
			 * 정수가 최대 2자리라는 가정하에 코드 작성 
			 * 정수의 자리수에 상관없이 출력되는 코드 생각해볼것!!!! => 내가 사용한 문자열이 아닐까...?
			 */
			int n10 = nums[i] / 10;
			int n1 = nums[i] % 10;
			System.out.print(n1 * 10 + n10 + "\t");
		}
		System.out.println();
	}

}
