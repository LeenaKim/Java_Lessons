package kr.ac.kopo.day13.lotto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
		
		
		Random r = new Random();
		final int LOTTO_MAX = 6;
		
		// 방법 5
		List<Integer> lottoNums = new ArrayList<>();
		List<Integer> nums = new ArrayList<>();
		for(int i = 1; i <= 45; i++) {
			nums.add(i);
		}
		
		Collections.shuffle(nums); // Collections.shuffle() : 지가 알아서 섞인다.
		
		for(int i = 0; i < LOTTO_MAX; i++) {
			lottoNums.add(nums.get(i));
		}
		
		/* 
		// 방법 4 
		Set<Integer> lottoNums = new HashSet<>(); // hashset말고 treeset을 쓰면 알아서 sort해서 나온다. 
		while(lottoNums.size() < LOTTO_MAX) {
			lottoNums.add(r.nextInt(45) + 1);
		}
		*/
		
		/*
		// 방법 3
		List<Integer> lottoNums = new ArrayList<>();
		
		while(lottoNums.size() < LOTTO_MAX) {
			int num = r.nextInt(45) + 1;
			if(!lottoNums.contains(num)) {
				lottoNums.add(num);
			}
		}
		*/
		return Arrays.toString(lottoNums.toArray());
		
		
	}
}
