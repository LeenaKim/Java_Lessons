package kr.ac.kopo.day11.homework.dateAPI;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 과제2>
선택하세요(1. 특정년도   2. 특정월   3. 종료) => 1
년도를 입력하세요 : 2020
<< 2020년 1월 >>
일  월  화  수  목  금  토
                1   2   3   4
5   6

<< 2020년 2월 >>

<< 2020년 12월 >>

선택하세요(1. 특정년도   2. 특정월   3. 종료) => 2
년도를 입력하세요 : 2020
월을 입력하세요 : 1
<< 2020년 1월 >>
일  월  화  수  목  금  토
                1   2   3   4
5   6

선택하세요(1. 특정년도   2. 특정월   3. 종료) => 3
 * @author Lina
 *
 */
public abstract class ShowCalendar {

	// "달력을 보여주는 기능"을 부모클래스로 선언. 자식클래스로는 "년도를 기준으로 보여주는 기능"과 "달을 기준으로 보여주는 기능"이 있다고 보았다. 
	// 달력을 보여주기 위해 필요한 변수들 선언. 
	private static int userYear;
	private static int userMonth;
	private String[] days = {"일", "월", "화", "수", "목", "금", "토"};
	protected Scanner sc = new Scanner(System.in); // Scanner와 Calendar은 굳이 private으로 써줄필요가 없는것같아 protected로 선언하였다. sc와 c라는 변수 이름이 어떠한 의미도 내포하지 않아서.. 
	protected Calendar c = Calendar.getInstance();
	
	ShowCalendar() {
		userMonth = 1;
	}
	
	public static int getUserYear() {
		return userYear;
	}
	public static void setUserYear(int userYear) {
		ShowCalendar.userYear = userYear;
	}
	public static int getUserMonth() {
		return userMonth;
	}
	public static void setUserMonth(int userMonth) {
		ShowCalendar.userMonth = userMonth;
	}
	public String[] getDays() {
		return days;
	}
	public void setDays(String[] days) {
		this.days = days;
	}
	// 추상클래스 
	public abstract void printCalendar();
	
	public abstract void getUsersYearMonth();
}
