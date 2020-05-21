package kr.ac.kopo.day14.homework;

import java.util.Scanner;

public interface Inputable {

	Scanner sc = new Scanner(System.in);
	
	String input(String msg);
}
