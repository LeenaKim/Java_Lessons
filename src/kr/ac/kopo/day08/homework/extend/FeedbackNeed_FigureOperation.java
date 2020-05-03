package kr.ac.kopo.day08.homework.extend;

import java.util.Scanner;

public class FeedbackNeed_FigureOperation {
	// 개념을 놓고 보면 operation 클래스는 도형의 일부분이 아니라 제어하는 클래스여서 kind-of 관계가 성립이 안된다보고 상속받지 않았다. 
	private int type;
	private String[] types = {"직사각형", "정사각형", "삼각형", "원"};
	// 도형마다 클래스 객체 생성 
	Figure fig = new Figure();
	Rectangle rec = new Rectangle();
	Square sqr = new Square();
	Triangle trg = new Triangle();
	Circle cir = new Circle();
	
	Scanner sc = new Scanner(System.in);
	
	public void setAndOperate() {
		System.out.println("도형을 선택하세요 (1. 직사각형, 2. 정사각형, 3. 삼각형, 4. 원, 9. 프로그램 나가기 ) => ");
		type = sc.nextInt();
		// 입력받은 도형에 따라 너비와 높이 등을 입력받는 메소드와, 그 수들을 가지고 계산하는 메소드를 호출한다. 
		if(type == 1) { 
			rec.setWidthHeight(); rec.setArea(); 
		}
		else if (type == 2) { 
			sqr.setWidth(); sqr.setArea(); 
		}
		else if (type == 3) { 
			trg.setWidthHeight(); trg.setArea();
		}
		else if (type == 4) {
			cir.setRadius();cir.setArea(); 
		} 
		else {
			System.out.println("프로그램을 종료합니다. "); 
		}
	}
	
	public void print() {
		System.out.println(types[type-1] + "의 면적은 " + fig.getArea() + "입니다. ");
	}
}
/*
 * To. 교수님, 원래는 print 메소드를 밑에 따로 만들고 if문대신 switch-case 구문으로 1부터 9까지 경우를 받았었는데요, 
 * 이럴경우 디버깅해봤을때 각 개별 도형 클래스에서 계산된 area 변수가 FigureOperation 클래스에 와서는 다시 0으로 초기화되더라구요... 
 * 왜 그런지 알려주실수 있나요...? 
 * 
 * /* From 교수님, 
	음.... 결과 나올거 같은데요.....
	아마 0으로 초기화된건.... 객체연결이 잘못된거 같은데요..
	코드를 봐야지 알수 있을 거 같아요~~~
	혹시 print() 메소드 남아있어요????
	
	Reply to. 교수님,
	네, 맨 마지막 함수 print()가 원래 하려고 했던 메소드입니다! 
 */
 
