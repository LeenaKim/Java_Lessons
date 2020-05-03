package kr.ac.kopo.day05.homework.Array;

import java.util.Scanner;

public class Prof_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		// 홀수, 짝수의 배열을 선언하고 인덱스를 활용할수도 있지만(내 방법) 이렇게 바로 출력해주는것도 가능하다. 
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(i+1 + "'s 정수 : ");
			nums[i] = sc.nextInt();
			sc.nextLine(); // 버퍼의 엔터 받아주기 
		}
		// 방법 2
		String[] title = {"짝수", "홀수"};
		for(int mod = 0; mod <= 1; mod++) {
			// 방법 2 - 1 // System.out.println("<< " + (mod == 0 ? "짝수" : "홀수") + " >>");
			// 방법 2 - 2 // System.out.println("<< " + title[mod] + " >>");
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] % 2 == mod) { 
				// 밑의 짝수, 홀수인 경우는 같은 코드를 두번도는데, 나머지가 0일때와 1일때를 반복문을 통해 바뀌게 하면 반복문을 한번만 쓰고도 가능하다. 
					System.out.print(nums[i] + " ");
				}
			}
			System.out.println();
		}
		
		
		/* 방법 1
		System.out.println("< 짝수 >");
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				System.out.print(nums[i] + " ");
				sum = sum + nums[i];
			}
		}
		System.out.println();
		System.out.println("짝수의 총합 : "+ sum);
		
		System.out.println("< 홀수 >");
		sum = 0;
		for(int num : nums) {
			if(num % 2 == 1) {
				System.out.print(num + " ");
				sum = sum + num;
			}
		}
		System.out.println();
		System.out.println("홀수의 총합 : "+ sum);*/
	}

}
