package kr.ac.kopo.day09.abs01;

public class SamsungPrinter extends Printer {

	private String name = "삼성프린터";
	
	public void samPrint() {
		System.out.println("삼성프린터에서 출력중... ");
	}
	
	/*
	 * 그런데, 만약 삼성프린터가 부모클래스의 print() 메소드를 쓰기 싫고 자기들만의 메소드를 쓰고싶다고 고집부리게되면,
	 * Menu메소드에서 개발자는 이 사실을 모르고 그냥 print()를 쓰게되고, 그럼 맞지 않는 결과가 나게 된다.
	 * 이걸 방지하기 위해 오버라이드를 강제하는데, 그것이 바로 추상클래스!!!!
	 */
}
