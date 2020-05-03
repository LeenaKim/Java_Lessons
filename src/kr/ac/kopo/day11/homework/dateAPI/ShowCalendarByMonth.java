package kr.ac.kopo.day11.homework.dateAPI;
import java.util.Calendar;
public class ShowCalendarByMonth extends ShowCalendar {

	public ShowCalendarByMonth() {
	}

	@Override
	public void getUsersYearMonth() {
		System.out.println("연도를 입력하세요 : ");
		ShowCalendar.setUserYear(Integer.parseInt(sc.nextLine()));
		System.out.println("월을 입력하세요 : ");
		ShowCalendar.setUserMonth(Integer.parseInt(sc.nextLine()));
		
	}
	
	@Override
	public void printCalendar() {
		
		int cnt = 0;
		c.set(ShowCalendar.getUserYear(), ShowCalendar.getUserMonth()-1, 1); // 사용자가 입력한 년도와 1씩 증가하는 달로 초기화 
		System.out.println("<< " + getUserYear() + " 년 " + ShowCalendar.getUserMonth() + " 월 >>");
		// 요일 배열 출력 
		for(String day : getDays()) {
			System.out.printf(day + "\t");
		}
		System.out.println();
		// 일요일부터 달의 첫날까지 공백출력 
		for(int l = 1; l < c.get(Calendar.DAY_OF_WEEK); l++) {
			System.out.printf("\t");
			cnt++;
		}
		// 1부터 해당달의 마지막날까지 출력 
		for(int j = 1; j <= c.getActualMaximum(Calendar.DAY_OF_MONTH); j++) {
			System.out.printf("%d\t", j);
			cnt++;
			if(cnt % 7 == 0) System.out.println(); // 공백 포함 7번 찍어줄때마다 줄바꿈 
		}

	}

	

}
