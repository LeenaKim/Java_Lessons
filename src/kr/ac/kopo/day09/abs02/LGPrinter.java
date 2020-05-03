package kr.ac.kopo.day09.abs02;

public class LGPrinter extends Printer {

	private String modelName;
	
	public LGPrinter() {
		modelName = "LG프린터";
	}
	/*
	public void lgPrint() {
		System.out.println(modelName + "에서 출력중... ");
	} => 이렇게 각 하위클래스마다 같은 기능의 메소드명을 다르게해주면 너무 헷갈린다. 
	*/
	
	@Override // 그래서 부모클래스의 메소드를 끌어다 오버라이드 해준다. 
	public void print() {
		System.out.println("LG프린터에서 출력중...");
	}
}
