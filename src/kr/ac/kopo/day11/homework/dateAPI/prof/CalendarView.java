package kr.ac.kopo.day11.homework.dateAPI.prof;

import kr.ac.kopo.util.CalendarUtil; // 내가 배포한 jar파일 임포트 

import java.util.Scanner;

public class CalendarView { // 화면에 달력을 보여주는 기능클래스 View 

	private Scanner sc;
	private CalendarUtil util;
	
	public CalendarView() { // 굳이 밑에서 반복문으로 돌 필요 없이 생성자에서 변수를 세워준다. 
		sc = new Scanner(System.in);
		util = new CalendarUtil();
	}
	
	public int scanInt(String msg) { // 입력값을 받는 메소드를 메세지를 매개변수로 하여 간결하게 표현한다. 
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}

	public void execute() {
		
		loop : while (true) {
			int no = scanInt("항목을 선택하세요(1.특정년도  2.특정월  3.현재시간 0. 종료) : ");

			int year = 0, month = 0;
			switch (no) {
			case 1:
				year = scanInt("년도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2:
				year = scanInt("년도를 입력하세요 : ");
				month = scanInt("월을 입력하세요 : ");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("현재시간 : " + util.today());// jar 파일을 만들면서 SimpleDateFormat을 활용해 현재시간 출력해주는 메소드를 호출 
				break;
			case 0 : // 프로그램이 복잡해지다보면 제대로 종료가 안되고 서브클래스가 다시 돌고 하는데, 이때는 빠져나올 loop를 지정해주거나 exit(0)을 통해 프로그램 종료시키면 된다. 
				System.exit(0);		// 프로그램을 종료하는 메소드
				//break loop; 
			}
		}
	}
}
