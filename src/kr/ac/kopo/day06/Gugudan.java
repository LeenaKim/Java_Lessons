package kr.ac.kopo.day06;

import java.util.Scanner;

/**
 * 구구단과 관련된 기능들을 가지고 있는 기능 클래스 
 * @author Lina
 *
 */
public class Gugudan {
	/**
	 * 키보드로 하나의 단을 입력받아 호출자메소드에게 넘겨주는 기능
	 * @return 입력받은단(int) 
	 */
	int getDan() {
		
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.nextLine();
		
		return dan;
	}
	
	int getDan(String msg) {
		
		System.out.print(msg);
		
		int dan = getDan();
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		sc.nextLine();
		
		return dan;
	}
	/**
	 * 호출자가 출력할 단을 넘겨주면 그 단의 구구단을 출력 
	 * @param dan (출력할 단) 
	 */
	void print(int dan) {
		
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	/**
	 * 2 ~ 9단까지의 구구단을 출력 
	 */
	void print() {
		
		print(2, 9);
		// < 방법 2 > 같은 클래스 내의 print(dan) 메소드를 2단부터 9단까지 출력 
		/*
		 * for(int i = 2; i <= 9; i++) {
			print(i); // print(dan)과는 같은 클래스 내에 있기때문에 객체가 필요 없다. 
		}
		 */
		
		
		/* < 방법 1 > 직접 다 출력 
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		}
		*/
	}
	/**
	 * 시작단에서부터 종료단까지의 구구단을 출력 
	 * @param start
	 * @param end
	 */
	void print(int start, int end) {
		for(int dan = start; dan <= end; dan++) {
			print(dan);
		}
	}

}
