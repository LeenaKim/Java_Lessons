package kr.ac.kopo.day09.abs02;

public class HPPrinter extends Printer {
// 처음에 클래스 생성할때부터 부모클래스를 지정하고 오버라이드 메소드를 포함시킬 수 있다. 
	public HPPrinter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("HP프린터에서 출력중...");
	}

}
