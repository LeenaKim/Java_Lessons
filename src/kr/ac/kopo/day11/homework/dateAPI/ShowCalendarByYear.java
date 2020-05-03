package kr.ac.kopo.day11.homework.dateAPI;

import java.util.Calendar;

public class ShowCalendarByYear extends ShowCalendar {

	public ShowCalendarByYear() {
	}
	
	@Override
	public void getUsersYearMonth() {
		System.out.println("연도를 입력하세요 : ");
		ShowCalendar.setUserYear(Integer.parseInt(sc.nextLine()));
	}
	
	@Override
	public void printCalendar() {
		ShowCalendarByMonth scbm = new ShowCalendarByMonth();
		
		for(int i = 1; i <= 12; i++) {
			
			scbm.printCalendar(); // 년도의 모든 달력을 출력할경우, 특정 달의 달력을 출력하는 메소드를 12번 시행. 
			System.out.println();
			setUserMonth(getUserMonth()+1);
			
		}
	}



}
