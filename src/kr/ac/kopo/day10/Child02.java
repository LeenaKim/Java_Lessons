package kr.ac.kopo.day10;

public class Child02 extends Parent {

	private String name = "자식2";
	
	@Override 
	public void print() {
		System.out.println("나는 자식2 객체입니다. ");
	}
	
	public void play() {
		System.out.println("나는 놉니다. ");
	}
	
	public void sing() {
		System.out.println("나는 노래를 부릅니다. ");
	}
}
