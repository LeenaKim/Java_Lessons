package kr.ac.kopo.day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
		// SimpleDateFormat 클래스 - 내가 원하는 포맷형태로 연월일시분초 출력 가능. 
		String pattern = "오늘은 yyyy년 MM월 dd일(E요일)입니다. ";
		pattern = "yyyy-MM-dd hh:mm:ss(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); // pattern 스트링의 yyyy, MM 등 해당하는 문자에 날짜 입력 
		System.out.println(sdf.format(new Date())); // Date 객체를 넣어줘서 오늘날짜로 포맷한다. 
		
		// 오늘은 2020년 4월 27일(월요일) 입니다.
		Calendar c = Calendar.getInstance();
		System.out.println("c : " + c.toString()); // GregorianCalendar 형태고 밀리세컨드로 보여준다. Date처럼 Calendar도 toString을 오버라이드했다. 
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;// 얘도 0부터 11까지라서. 
		int date = c.get(Calendar.DATE);
		date = c.get(Calendar.DAY_OF_MONTH); // DATE와 같은 값을 가지는 변수.
		int day = c.get(Calendar.DAY_OF_WEEK); // 요일은 숫자로 나온다. 1 일요일부터 7 토요일까지. 
		String[] dayArr = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 (" + dayArr[day] + ")");
		
		// 2023년 10월 9일이 무슨요일인지 알고싶다. 
		c.set(2023, 11, 9); // 달이 0부터 11이니까 +1해줘서 11을 입력 
		
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2023년 10월 9일은 " + dayArr[day] + "요일입니다. ");
		
		Date d = c.getTime();
		System.out.println(d);
		
		d = new Date();
		c.setTime(d); 
		System.out.println(c); //Date 객체 d를 활용해서 2023년을 현재 시간으로 맞춰주기 
		
		// 요번달(4월)의 마지막 날짜가 알고싶다.
		c.set(Calendar.MONTH, 2-1); // 2월의 마지막 날짜를 알고싶으면 set으로 달을 바꿔주면 됨. 
		month = c.get(Calendar.MONTH) + 1;
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(month + "월의 마지막 날은 " + lastDay + "일입니다. ");
		
		/* < Date 클래스 >
		// 오늘은 2020년 4월 27일입니다. 
		Date d = new Date(); // java.util 밑에있는 Date 클래스 임포트 

		System.out.println("d : " + d); // 매번 객체만 출력하면 주소값만 나오는데, 이는 사실 d자체를 찍는게 아니라 d.toString() 메소드를 호출하는것이라서. 
		// toString() 메소드는 object 클래스에 들어있어서 따로 선언하지 않아도 호출된다. 
		// DateAPI의 경우는 부모클래스의 toString 메소드를 오버라이드하여 연 월 일 시 분 초가 나오도록 만든것. 
		
		int year = d.getYear() + 1900; // 1900년부터 셋기때문에 1900을 더해줘야함. 가운데 줄이 그어진건 해당 메소드가 deprecated, 사용하지 않는걸 권고하기 때문. 
		int month = d.getMonth() + 1; // 0부터 11월까지라서 1을 더해줘야함.
		int date = d.getDate();
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일입니다. ");
		*/
	}

}
