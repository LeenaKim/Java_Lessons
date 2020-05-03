package kr.ac.kopo.day09.homework.abs;

public class Rectangle extends Figure {
// 자식클래스 - 이하 다른 자식클래스에 대한 주석도 동일하므로 생략 
	private int width;
	private int height;
	
	public Rectangle() {
		
	}

	@Override
	public void getWHR() {
		this.width = Figure.r.nextInt(10)+1; // 부모클래스에서 static으로 줬던 r값을 멤버변수로 할당한다. 
		this.height = Figure.r.nextInt(10)+1;
	}
	
	@Override
	public void calculateArea() {
		getWHR(); 
		setArea(width * height); // 계산한 값을 가지고 부모클래스 메소드로 면적을 저장한다. 
	}


}
