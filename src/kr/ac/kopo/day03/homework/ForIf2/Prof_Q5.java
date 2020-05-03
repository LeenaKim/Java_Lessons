package kr.ac.kopo.day03.homework.ForIf2;

import java.util.Random;

public class Prof_Q5 {

	public static void main(String[] args) {
		int star = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j <= star || j >= 10-star) {
					System.out.print('*');
				} else {
					System.out.print('-');
				}
			}
			System.out.println();
			
			star += (i < 5 ? 1 : -1);
		}
	}
}
