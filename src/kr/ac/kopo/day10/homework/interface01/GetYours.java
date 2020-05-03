package kr.ac.kopo.day10.homework.interface01;

import java.util.Scanner;

public interface GetYours {

	Scanner sc = new Scanner(System.in); // Scanner형의 객체 sc를 상수항으로 받는다. (인터페이스에선 멤버변수를 상수항을 제외하고 받을 수 없다고 하셨는데, 클래스의 객체를 선언만 하는건 괜찮은지 모르겠습니다...)
/**
 * Game 인터페이스 외에도, 게임 클래스에 사용자의 입력값을 받는 기능을 추가하기위해 인터페이스 생성.
 * 가위바위보게임과 주사위게임이 입력값을 받는 범위가 다르므로 같은 이름의 메소드 하에 오버라이드를 통해 다르게 동작하게 된다. 
 * @return
 */
	public abstract int getYours();
}
