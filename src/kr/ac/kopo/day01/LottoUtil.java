package kr.ac.kopo.day01;

import java.util.Random;

//도큐먼트 주석 달기 
/**
 * 로또와 관련된 여러가지 기능을 가지고 있는 클래스. 
 * @author Lina => 문서를 만든 주체자가 anotation이 나온다.
 * @since (언제부터)
 * @version (jdk 몇 버전부터 쓸 수 있다 명시)
 */
public class LottoUtil {
	/**
	 * 오늘의 로또 확률을 알려주는 기능입니다. 
	 * @return 오늘의 로또 확률 (0 ~ 100)
	 */
	public static int todayProbability() {
		Random r = new Random();
		return r.nextInt(101);
		
	}
}