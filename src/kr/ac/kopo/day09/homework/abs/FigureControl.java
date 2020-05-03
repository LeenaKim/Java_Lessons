package kr.ac.kopo.day09.homework.abs;

import java.util.Scanner;
// 제어클래스 
public class FigureControl {
	// 문제를 변형해 배운것을 이것저것 활용해보았습니다....
	private int figureCnt; 
	private String[] types = {"직사각형", "정사각형", "삼각형", "원"}; // 도형의 종류 배열 
	private int type; // 입력값으로 받을 만들 도형 타입 
	
	public FigureControl() {

	}
	Scanner sc = new Scanner(System.in);
	
	
	public void operate() {
		// 프로그램 종료 전까지 반복 
		while(type != 9) {
			
			Figure f = null; // 부모클래스 Figure은 추상클래스라 인스턴스 객체를 만들 수 없는데, 묵시적 형변환을 통해 자식클래스의 값을 가질 경우 객체생성이 가능하다. 
			System.out.println("도형을 선택해주세요. (1. 직사각형 2. 정사각형 3. 삼각형 4. 원 9. 프로그램 종료 ) => ");
			type = sc.nextInt();
			sc.nextLine();
			if(type == 1) {
				f = new Rectangle(); // 각 도형을 선택했을시 객체 f의 값을 자식클래스별로 지정해준다. 
			} else if(type == 2) {
				f = new Square();
			} else if(type == 3) {
				f = new Triangle();
			} else if(type == 4){
				f = new Circle();
			} else if(type == 9) {
				System.out.println("프로그램을 종료합니다. 만드신 총 도형의 개수는"  + figureCnt + "개 입니다. "); 
				System.out.println();
			} else System.out.println("다시 입력해주세요. ");
			
			if(f != null) { // f가 null이 아니라는 조건을 빼주면 9나 다른 숫자를 입력했을시 NullPointException이 생긴다. 
				f.calculateArea();  // 위에서 이미 객체에 자식클래스 값을 주었으므로 메소드만 호출해주면 된다. 
				figureCnt++;
				System.out.printf("%s%s%.2f%s", types[type-1], "의 면적은 ", f.getArea(), "입니다. \n"); // 부모클래스의 메소드를 통해 면적을 리턴받아 출력 
			}
			
		}
	}
	

}
