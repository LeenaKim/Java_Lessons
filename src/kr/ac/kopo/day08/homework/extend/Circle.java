package kr.ac.kopo.day08.homework.extend;

import java.util.Random;

public class Circle extends Figure {
	Random r = new Random();
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int width, int height, int radius, double area) {
		super(width, height, radius, area);
		// TODO Auto-generated constructor stub
	}
	
	public void setRadius() {
		super.setRadius(r.nextInt(10)+2);
	}

	public void setArea() {
		super.setArea(super.getRadius() * super.getRadius() * Math.PI); // 원의 넓이를 구해준다. 세부 설명은 square 클래스와 같다. 
		System.out.printf("%s%.2f%s", "원의 면적은 ", super.getArea(), "입니다. ");
	}
}
