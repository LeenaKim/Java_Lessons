package kr.ac.kopo.day09.homework.abs;

import java.util.Random;
// 부모클래스 
public abstract class Figure {
	// 모든 도형이 구하고자 하는 값 area를 멤버변수로 
	private double area;
	static Random r = new Random(); // Random 클래스의 r 객체를 static으로 설정함으로서 자식클래스에서 일일히 새로 선언해줄 필요 없이 돌려쓴다. 
	
	public Figure() {
		
	}
	// getter 
	public double getArea() {
		return area;
	}
	// setter 
	public void setArea(double area) {
		this.area = area;
	}
	// 면적을 계산하는 추상클래스 -> 자식클래스 도형마다 공식이 다르니 추상클래스로 선언해준다.
	public abstract void calculateArea();
	// 계산 변수를 설정하는 추상클래스 -> 도형마다 width만 필요한 아이, width와 height이 필요한 아이, radius가 필요한 아이가 있으니 얘도 추상클래스로 선언해준다.  
	public abstract void getWHR();

}
