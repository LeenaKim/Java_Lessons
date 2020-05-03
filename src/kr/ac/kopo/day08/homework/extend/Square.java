package kr.ac.kopo.day08.homework.extend;

import java.util.Random;

public class Square extends Figure {
	Random r = new Random();
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square (int width, int height, int radius, double area) {
		super(width, height, radius, area);
		// TODO Auto-generated constructor stub
	}
	// 정사각형의 너비를 받는다. 
	public void setWidth() {
		super.setWidth(r.nextInt(10)+2); // +2를 한 이유는 0과 1을 배제하기 위해서. 랜덤 인트를 받고 바로 부모클래스의 너비로 set해준다. 
	}
	
	public void setArea() {
		super.setArea(Math.pow(super.getWidth(), 2)); // 부모클래스에서 set해준 width를 갖고와 정사각형의 넓이를 계산해주고 부모클래스의 area 변수에 저장. 
		System.out.println("정사각형의 면적은 " + super.getArea() + "입니다. "); // area변수를 갖고와 출력해준다. 
	}
}
