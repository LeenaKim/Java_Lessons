package kr.ac.kopo.day10.homework.interface01;

import java.util.Scanner;

public class ScissorsRockPaper implements GetYours, Game {

	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	// 무승부를 셀 변수 
	private int drawCnt;
	
	
	public int getDrawCnt() {
		return drawCnt;
	}
	public void setDrawCnt(int drawCnt) {
		this.drawCnt = drawCnt;
	}

	Scanner sc = new Scanner(System.in);
	
	/**
	 * GetYours 인터페이스의 추상클래스를 오버라이드한 함수. 
	 * 입력값이 1, 2, 3이 아니라면 재귀함수를 호출.
	 */
	@Override
	public int getYours() {
		int you = sc.nextInt();
		sc.nextLine();
		if(you != 1 && you != 2 && you != 3) { 
			System.out.println("다시입력하세요. ");
			getYours();
		}
		return you;
		
	}
	
	/**
	 * Game 인터페이스의 추상클래스를 오버라이드한 함수.
	 * static함수로 두 게임의 상위클래스를 만들어 win, draw, lose의 경우를 셀까도 고민했지만, 문제에 정해진 return값을 활용하는편이 낫다고 판단했다.
	 * 무승부도 0으로 리턴하니 후에 점수 계산시 0을 반환한 횟수에서 draw의 횟수를 빼면 진 횟수가 된다. 
	 * 가위, 바위, 보가 1 2 3으로 순차적으로 정해져있고, 사용자 값에서 컴퓨터의 값을 뺀 경우가 -1이거나 2면 사용자가 지게된다. 가위, 바위, 보 세개가 세 숫자로 반복되기 때문. 
	 * @param getYours에서 반환한 값을 매개변수로 받는다. 즉, 사용자의 입력값을 매개로 받는다. 
	 * @return 이겼을경우만 1을, 나머지 경우 0을 리턴한다. 
	 */
	@Override
	public int startGame(int you) {
		int me = (int)(Math.random()*3)+1;
		
		if(you == me) {
			System.out.println("비겼습니다. ");
			drawCnt++;
			return 0;
		}
		else if(you - me == -1 || you - me == 2) {
			System.out.println("you lose");
			return 0;
		}
		else {
			System.out.println("you win");
			return 1;
		}
		
	}

	

}
