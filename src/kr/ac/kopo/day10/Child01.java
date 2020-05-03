package kr.ac.kopo.day10;

public class Child01 extends Parent {

	private String name = "자식1";
	
	// 자식은 부모의 접근제한자의 범위보다 절대 좁으면 안된다. 
	// 부모 메소드의 접근제한자가 public이면 자식도 오버라이드할때 public이어야 하고, 부모메소드의 접근제한자가 protected면 자식은 public이나 protected여야 한다.  
	@Override 
	public void print() {
		System.out.println("나는 자식 1 객체입니다. ");
	}
	
	public void study() {
		System.out.println("나는 공부합니다. ");
	}
	
	public void sleep() {
		System.out.println("나는 잠을 잡니다. ");
	}
}
