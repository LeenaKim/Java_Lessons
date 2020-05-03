package kr.ac.kopo.day08.homework.extend;

import java.util.Random;

/**
 * 도형을 선택하세요 (1. 직사각형, 2. 정사각형, 3. 삼각형, 4. 원, 9. 프로그램 나가기 ) => 1
 * 직사각형 선택시
 * 		Random하게 2~10사이의 정수 2개를 추출
 * 		가로 3, 세로 2의 직사각형 면적은 6입니다.
 * 
 * 도형을 선택하세요 (1. 직사각형, 2. 정사각형, 3. 삼각형, 4. 원, 9. 프로그램 나가기 ) => 1
 * 정사각형 선택시
 * 		Random하게 2~10사이의 정수 1개를 추출
 * 		가로 5의 정사각형 면적은 25입니다. 
 * @author Lina
 *
 * 다소 조잡하게 짰지만, 오늘 배운 super, getter, setter을 최대한 활용해보고자 하였습니다... 
 */
public class Figure {
	// Figure이라는 큰 개념 하에 원, 삼각형, 사각형 등의 다양한 도형들이 존재하므로 '도형'을 부모클래스로 잡는다. 
	private int width;
	private int height;
	private int radius;
	private double area; // 원의 면적은 소숫점까지 나오니 double 형으로. 
	
	public Figure() {};
	
	public Figure(int width, int height, int radius, double area) {
		super(); // 최상위클래스 object 
		this.width = width;
		this.height = height;
		this.radius = radius;
		this.area = area;
	}
	// 멤버변수가 private이니 getter과 setter들을 만들어준다. 
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
}
