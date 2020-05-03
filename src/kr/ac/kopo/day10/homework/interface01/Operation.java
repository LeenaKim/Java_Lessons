package kr.ac.kopo.day10.homework.interface01;

import java.util.Scanner;

public class Operation {

	private String[] games = {"가위바위보", "주사위 값 맞추기", "종료"};
	private int win; 
	private int loseOrDraw;
	
	Operation () {}
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 게임을 선택하고 종료해주는 함수. 
	 * 종료를 누를경우 점수를 보여주고 게임을 끝낸다. 
	 * c가 아닐경우 gameChoose 메소드로 입력값을 넘겨준다.  
	 */
	public void defaultPrint() {
		System.out.println("게임을 선택하세요. "); 
		for(int i = 0; i < games.length; i++) {
			System.out.printf("\t%c %s\n", ('A'+i), games[i]);
		}
		char gameOption = sc.nextLine().charAt(0);
		if(gameOption == 'c' || gameOption == 'C') printScore();
		else gameChoose(gameOption);
	}
	
	ScissorsRockPaper srp = new ScissorsRockPaper();
	Dice dice = new Dice();
	/**
	 * 입력받은 c를 가지고 어떤 게임인지 판별하고 실행시켜주는 함수. 
	 * 입력값에 따라 각각의 게임의 유저값을 받고, 게임을 돌리고, 점수를 추가한다. 
	 * @param c
	 */
	public void gameChoose(char c) {
		
		switch (c) {
		case 'A' : case 'a' :
			System.out.printf("%s", "가위바위보 게임입니다.\n 가위바위보중 하나를 선택하세요. \n (1:가위, 2:바위, 3:보)");
			scoreCalculate(srp.startGame(srp.getYours())); // 1. 해당 게임의 유저값을 받고 2. 게임을 실행시키고 3. 점수를 받아 업데이트한다. 
			break;
		case 'B' : case 'b' :
			System.out.printf("%s", "주사위 값 맞추기 게임입니다. 주사위를 선택하세요. (1 ~ 6값 중 하나)");
			scoreCalculate(dice.startGame(dice.getYours()));
			break;
		default :
			System.out.println("잘못입력하셨습니다. ");	
		}
		defaultPrint();
		
	}
	/**
	 * 게임 결과를 받아 이긴경우와 지거나 동점인경우를 계산하는 함수. 
	 * @param result
	 */
	public void scoreCalculate(int result) {
		if(result == 1) win++;
		else loseOrDraw++;
	}
	/**
	 * 게임종료시 scoreCalculate에서 마지막으로 계산된 결과를 토대로 점수를 보여주는 함수.
	 * 무승부와 지는경우 모두 게임 리턴값이 0이므로, loseOrDraw에서 무승부인 경우를 빼야 진 경우가 된다. 
	 */
	public void printScore() {
		System.out.println("게임을 종료합니다. ");
		System.out.println("당신의 게임 전적은 " + win + "승 " + (loseOrDraw - srp.getDrawCnt()) + "패 " + srp.getDrawCnt() + "무 입니다. ");		
	}
	
	
	
	
}
