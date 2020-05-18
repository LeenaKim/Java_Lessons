package kr.ac.kopo.day13.lotto3;

import java.util.ArrayList;
import java.util.List;

public class MC {

	private Machine machine;
	private List<Integer> lottoNum = new ArrayList<>();
	
	public MC() {
		machine = new Machine(); // MC가 등장하는순간 1-45까지 번호를 가진 MACHINE이 생긴다.
	}
	
	public void ment() throws Exception { // main으로 예외를 던진다. 
		System.out.println("안녕하세요, MC 김리나 입니다.");
		System.out.println("제 01회 로또 방송을 시작하겠습니다. ");
		// 머신 가동 (공 섞기)
		machine.start();
		// 뽑은 숫자를 보여주기 
		for(int i = 1; i <= 6; i++) {
			
			Thread.sleep(1000);//컴파일시점에 반드시 예외처리를 해야함. os를 건드리는 아이이기때문. 1000밀리세컨드동안 멈춘다.
			
			Ball ball = machine.getBall();
			System.out.println(i + "번쨰 로또 번호는 " + ball.getNumber() + "입니다. ");
			lottoNum.add(ball.getNumber());
		}
		
		
	
	}
}