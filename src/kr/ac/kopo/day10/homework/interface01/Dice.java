package kr.ac.kopo.day10.homework.interface01;

public class Dice implements Game, GetYours {

	/**
	 * GetYours 인터페이스의 추상클래스를 오버라이드하는 함수.
	 * 주사위의 범위에서 벗어나면 재귀함수 호출.
	 * @return 사용자 입력값 
	 */
	@Override
	public int getYours() {
		int you = sc.nextInt();
		sc.nextLine();
		if(you < 1 || you > 6) {
			System.out.println("다시입력하세요. ");
			getYours();
		}
		return you;
	}
	/**
	 * Game 인터페이스의 추상클래스를 오버라이드하는 함수.
	 * @return 추측한 수가 컴퓨터와 같을경우 1, 다를경우 0 반환 
	 */
	@Override
	public int startGame(int you) {
		
		int me = (int)(Math.random()*6)+1;
		System.out.println((me == you ? "You win" : "You lose"));
		return (me == you ? 1 : 0);
	}


}
