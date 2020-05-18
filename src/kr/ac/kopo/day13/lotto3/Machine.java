package kr.ac.kopo.day13.lotto3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Machine {

	// has-a 패턴 : ~를 소유하고있다. 이러한 관계들은 일반적으로 다 멤버변수화된다. 
	// machine은 ball들을 가지고있다. 
	private List<Ball> balls = new ArrayList<>();
	
	public Machine() {
		for(int i = 1; i <= 45; i++) {
			balls.add(new Ball(i)); // 기계가 만들어지며 1 - 45까지 번호가 담긴 ball이 생성됨과 동시에 리스트에 추가된다. 
		}
	}
	
	// 기계를 가동한다. -> 숫자를 섞는다. 
	public void start() {
		Collections.shuffle(balls);
	}
	// 뽑은 번호를 내보낸다. 
	public Ball getBall() {
		return balls.remove(0);// remove의 return값은 ball형. balls 자체가 Ball형이었기 때문. 
								// remove로 뽑았기때문에 번지수가 상관없다. 뽑는 즉시 제거되기때문에. 
	}
	
	 
}