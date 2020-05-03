package kr.ac.kopo.day11;

import java.util.Random;

public class Super {

	public final int MAX = 100;
	
	public final void print( ) {
		System.out.println("Super print() 호출... ");
	}
	
}

class Sub extends Super {
	/*
	@Override
	public void print( ) {
		MAX = 40; // 부모클래스의 MAX가 final이 붙어 상수항이기때문에 오버라이드 불가능 
		System.out.println("Sub print() 호출... ");
	}
	*/
}

class MyRandom extends Random {
	
	/**
	 * nextInt(10) : 
	 * 	상위클래스 Random의 0 ~ 9사이의 난수 추출이 아닌
	 * 1 ~ 10사이의 난수를 추출 
	 */
	@Override // source -> override methods/interface에서 추상클래스나 인터페이스가 아니더라도 선택해서 오버라이드할수있다. 
	public int nextInt(int bound) {
		int r = super.nextInt(bound) + 1;
		return r;
	}

	
}

class FinalMain {
	
	public static void main(String[] args) {
		
//		 Random r = new Random();
//		int random = r.nextInt(100)+1; // 매번 이렇게 치는게 귀찮으니 MyRandom클래스를 만들자. 
		
		MyRandom r = new MyRandom();
		int random = r.nextInt(100); // 내 입맛에 맞게 바꾸기위해 상속받는다. 
		// but, String 클래스의 경우 자바 소스코드로 들어가보면 final로 만들어져있어 재정의가 불가능하다. 
		
		System.out.println("추출된 정수 : " + random);
	}
}
