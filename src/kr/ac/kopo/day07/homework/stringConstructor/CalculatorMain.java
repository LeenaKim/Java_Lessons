package kr.ac.kopo.day07.homework.stringConstructor;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요. ");
		int i = sc.nextInt();
		sc.nextLine();
		int j = sc.nextInt();
		sc.nextLine();
		
		System.out.println("정수 : " + i);
		System.out.println("정수 : " + j);
		System.out.println(i + " + " + j + " = " + cal.add(i, j));
		System.out.println(i + " - " + j + " = " + cal.subtract(i, j));
		System.out.println(i + " * " + j + " = " + cal.multiple(i, j));
		System.out.println(i + " / " + j + " = " + cal.divide(i, j));
		System.out.println(i + " 소수체크 : " + cal.prime(i));
		System.out.println(j + " 소수체크 : " + cal.prime(j));
		
	}

}
