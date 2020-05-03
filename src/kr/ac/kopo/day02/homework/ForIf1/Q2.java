package kr.ac.kopo.day02.homework.ForIf1;

public class Q2 {

	public void q2 (int time) {
		int hour, minute, seconds = 0;
		// time을 시, 분, 초로 나누어 계산한다. 
		hour = time / 3600;
		minute = (time - hour * 3600) / 60;
		seconds = time - hour * 3600 - minute * 60;
		// 시, 분, 초가 0이 아닐 경우에만 출력한다. 
		if(hour != 0) System.out.printf("%d시간", hour);
		if(minute != 0) System.out.printf("%d분", minute);
		if(seconds != 0) System.out.printf("%d초", seconds);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 
		Q2 test = new Q2();
		int time = 3661;
		// 메소드 호출 
		test.q2(time);
	}

}