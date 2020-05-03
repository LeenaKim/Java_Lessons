package kr.ac.kopo.day09.abs02;

import java.util.Scanner;

public class Menu {

	private Scanner sc;
	
	public Menu() {
		sc = new Scanner(System.in);
	}
	
	public void execute() {
		System.out.println("프린터를 선택하세요(1. LG 2. 삼성 3. HP) => ");
		int type = sc.nextInt();
		sc.nextLine();
		
		/*
		 * < 방법 3 >
		 * 그럼 다 줄여서 이렇게 짧게 표현할 수 있게된다. 다 같은 메소드만 쓰고, 각각의 인스턴스를 부모클래스가 받으니까.
		 * 그렇다면, LGPrinter lg = new LGPRinter()의 lg라는 자식객체와 LGPRinter 클래스의 값을 받은 부모클래스 변수가 
		 * 서로 어떻게 다를까? => "객체 형변환"을 공부하자. 
		 */
		Printer p = null;
		if(type == 1) {
			p = new LGPrinter();
		} else if(type == 2) {
			p = new SamsungPrinter();
		} else if(type == 3) {
			p = new HPPrinter();
		}
		p.print();
		
		/* < 방법 2 >
		 * 각 자식클래스가 같은 print() 메소드를 사용하는데 형이 모두 다른게 거슬림. 
		 * 그래서 자식의 인스턴스값을 부모가 가지게 할 수 있다. 
		if(type == 1) {
			Printer lg = new LGPrinter();
			lg.print();
		} else if(type == 2) {
			Printer sam = new SamsungPrinter();
			sam.print();
		} else if(type == 3) {
			Printer hp = new HPPrinter();
			hp.print();
		}
		 */
		
		
		/* < 방법 1 >
		if(type == 1) {
			LGPrinter lg = new LGPrinter();
			// lg.lgPrint();  이렇게 해도되지만, 엘쥐와 삼성의 프린트 메소드가 다 다른게 너무 헷갈림. 
			lg.print();
		} else if(type == 2) {
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
		} else if(type == 3) {
			HPPrinter hp = new HPPrinter();
			hp.print();
		}
		*/
	}
}
