package kr.ac.kopo.day09.abs02;

public class SamsungPrinter extends Printer {

	private String name = "삼성프린터";
	
	public void samPrint() {
		System.out.println("삼성프린터에서 출력중... ");
	}
	/*
	 * 그런데, 만약 삼성프린터가 부모클래스의 print() 메소드를 쓰기 싫고 자기들만의 메소드를 쓰고싶다고 고집부리게되면,
	 * Menu메소드에서 개발자는 이 사실을 모르고 그냥 print() 하게되면 옳은 결과가 나타나지 못함. 
	 * 그리고 부모클래스의 추상메소드를 오버라이드 해주지 않으면 에러나게 됨. 
	 */

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("삼성프린터에서 출력중... ");
		
	}
	
	
	
}
