package kr.ac.kopo.day08.homework.extend;

import java.util.Random;

public class Rectangle extends Figure {
	Random r = new Random();
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height, int radius, double area) {
		super(width, height, radius, area);
		// TODO Auto-generated constructor stub
	}
	
	public void setWidthHeight() {
		super.setWidth(r.nextInt(10)+2);
		super.setHeight(r.nextInt(10)+2);
	}
	
	public void setArea() {
		super.setArea(super.getWidth() * super.getHeight()); // 직사각형 공식대로 곱해준다. 세부 설명은 square 클래스와 같다. 
		System.out.println("직사각형의 면적은 " + super.getArea() + "입니다. ");
	}

}
