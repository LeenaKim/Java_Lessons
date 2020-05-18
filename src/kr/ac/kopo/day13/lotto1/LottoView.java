package kr.ac.kopo.day13.lotto1;

 

import java.util.List;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;

 

public class LottoView {

 

	private Scanner sc;

	

	public LottoView() {

		sc = new Scanner(System.in);

	}

	

	public void start() {

		

		System.out.println("게임 수를 입력 : ");

		int gameCount = sc.nextInt();

		sc.nextLine();

		

		for(int i = 1; i <= gameCount; i++) {

			System.out.println("게임" + i + " : " + getLottoNums());

		}

		

	}

	

	private String getLottoNums() {

		

		int[] lottoNums = new int[6];

		Random r = new Random();

		

		

		/*

		// 방법 2

		int[] nums = new int[45];

		for(int i = 0; i < nums.length; i++) {

			nums[i] = i+1;

		}

		

		for(int i = 0; i < lottoNums.length; i++) { // 한번 나온 값들이 맨 뒤에 저장되며 -i를 해주기때문에 알아서 중복된 숫자들을 거르고 뽑는다. 

			int idx = r.nextInt(45); // 0 ~ 44까지의 숫자 

			int lottoNum = nums[idx];

			lottoNums[i] = lottoNum;

			

			int temp = nums[idx];

			nums[idx] = nums[nums.length - 1 - i]; // nums[idx]가 다시 나오면 안되니까 뒤에 있는 아이와 위치를 바꿔준다. i가 0일땐 마지막 숫자와 바꾸고, i가 1일땐 마지막에서 두번째 숫자와 바꾸고...

														// 이런식으로 이미 나온 숫자들은 뒤에 몰려서 다시는 나올수 없게 한다. 

			nums[nums.length - 1 - i] = temp;

			

			System.out.println("idx : " + idx + Arrays.toString(nums));

			

		}

		*/

		

		/* 

		// 방법 1

		for(int i = 0; i < lottoNums.length; i++) {

			lottoNums[i] = r.nextInt(45) + 1;

			for(int j = 0; j < i; j++) {

				if(lottoNums[i] == lottoNums[j]) {

					i--;

					System.out.println("!"); // 중복체크시 알리도록 

					break;

				}

			}

		}

		*/

		

//		Arrays.sort(lottoNums); 만약 정렬하고싶다면 사용 가능 

		return Arrays.toString(lottoNums);

		

	}

}