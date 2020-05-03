package kr.ac.kopo.day06;

import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Gugudan gu = new Gugudan();
		
		System.out.print("2 - 9 사이의 단을 입력 : ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		gu.print(dan); // 입력받은 단만 출력 
		
		gu.print(); // 전체 단 출력 
		// 메소드는 다른데 동일한 print 기능이기 때문에 매개변수만 다르게 해서 같은 메소드 이름으로 설정해주면 편하다 => 메소드 오버로딩. 
		
		System.out.print("시작단을 입력 : ");
		int startDan = gu.getDan();
		
		System.out.print("종료단을 입력 : ");
		int endDan = gu.getDan();
		
		gu.print(startDan, endDan);
	}
}
