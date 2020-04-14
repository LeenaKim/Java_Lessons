package kr.ac.kopo.homework.ForIf1;

public class Q3 {
	public void q3 (int r) {
		// 주어진 상수 PI를 활용하여 넓이 계산 
		final double PI = 3.14592;
		double width = r*r*PI;
		System.out.println("원의 면적은 " + width + "입니다. ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 
		Q3 test = new Q3();
		int r = 10;
		// 메소드 호출 
		test.q3(r);
	}

}