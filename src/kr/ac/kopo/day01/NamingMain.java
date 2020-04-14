package kr.ac.kopo.day01;

import java.util.Random;
/*
 * Naming Rule에 의거하여 
 * 클래스, 변수, 메소드의 개수를 구하시오. 
 * 
 * 클래스 : 4개 (NamingMain, String, Random, System)
 * 변 수 : 3개 (args, r, out)
 * 메소드 : 3개 (main(), println(), nextInt())
 */
public class NamingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		System.out.println(r.nextInt());
	}

}