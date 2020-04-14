package kr.ac.kopo.day01;

public class ConstantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상수 : 변하지 않는 값 
		final double PI = 3.14;
		int radius = 10;
		/*
		 *  반지름 radius를 가지고 원의 넓이를 구하고 싶다.
		 *  이 때, pi를 3.14로 할수도, 3.1492로 입력할수도 있다.
		 *  사람마다 다 다르게 pi를 계산할 수 있고, final을 안붙여 pi를 선언한 경우
		 *  변수 값을 변경할수도 있다.
		 *  때문에 final을 쓰고 변수명을 대문자로 해야 상수다! 라는 것을 알려주는 것이다.
		 *  근데 사실 Math 클래스 내에 PI 상수가 있긴 하다.
		 */ 
		double area = radius * radius * PI;
		System.out.println("반지름 : " + radius + "====>" + area);
		
		
	}

}