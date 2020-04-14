package kr.ac.kopo.homework.ForIf1;

public class Q6 {
	public void q6 () {
		// 알파벳 a부터 z까지의 개수는 둘의 ascii 코드의 차 + 1이다. 대문자를 고려하여 *2를 해주면 총 알파벳 개수가 나온다.  
		System.out.println(('z'-'a'+1)*2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 
		Q6 test = new Q6();
		// 메소드 호출 
		test.q6();
	}

}