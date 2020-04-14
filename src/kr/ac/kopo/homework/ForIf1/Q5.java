package kr.ac.kopo.homework.ForIf1;

public class Q5 {
	public void q5 (int dollars) {
		// %.2f를 이용해 소수점 둘째자리까지 출력한다.  
		System.out.printf("원화 : %.2f\n", dollars*1092.50);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 
		Q5 test = new Q5();
		int dollars = 10;
		// 메소드 호출 
		test.q5(dollars);
	}

}