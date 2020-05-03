package kr.ac.kopo.day09.abs01;

import java.util.Scanner;

public class Menu {

	private Scanner sc;
	
	public Menu() {
		sc = new Scanner(System.in);
	}
	
	public void execute() {
		System.out.println("프린터를 선택하세요(1. LG 2. 삼성) => ");
		int type = sc.nextInt();
		sc.hasNextLine();
		
		if(type == 1) {
			LGPrinter lg = new LGPrinter();
			// lg.lgPrint();  이렇게 해도되지만, 엘쥐와 삼성의 프린트 메소드가 다 다른게 너무 헷갈림. 
			lg.print();
		} else if(type == 2) {
			SamsungPrinter sam = new SamsungPrinter();
			sam.samPrint();
		} 
	}
}
