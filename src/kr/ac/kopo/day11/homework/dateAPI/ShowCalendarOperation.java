package kr.ac.kopo.day11.homework.dateAPI;

import java.util.Scanner;

public class ShowCalendarOperation {
	
	public ShowCalendarOperation() {
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void mainOperator() {
		ShowCalendar showCal = null;
		
		System.out.println("선택하세요(1. 특정년도 2. 특정월 3. 종료) => ");
		
		int choice = Integer.parseInt(sc.nextLine());
		// 묵시적 형변환 
		if(choice == 1) {
			showCal = new ShowCalendarByYear();
		} else if(choice == 2) {
			showCal = new ShowCalendarByMonth();
		} else {
			System.out.println("종료합니다. ");
		}
		// 두 클래스의 메소드 이름이 같고 경우에 따라 다른 클래스의 값을 갖기때문에 간결하게 표현이 가능하다. 
		if(showCal != null) {
			showCal.getUsersYearMonth();
			showCal.printCalendar();
		}
	}

}
