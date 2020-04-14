  
package kr.ac.kopo.day02;

import java.util.Random;

public class SwitchMain {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(5) + 1; // 1~5
		System.out.println("입력된 정수 : "+num);

// 대등한 조건문을 위한 switch 문 //
		switch(num) {
		case 1 : 
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		case 3 : 
			System.out.println("THREE");
			break;
		default :
			System.out.println("ERROR");
		} 
		
// 대등한 조건절을 위한 다중 if 문 //
		/*
		if(num == 1) {
			System.out.println("ONE");
		} else if (num == 2) {
			System.out.println("TWO");
		} else if (num == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		*/
	}

}