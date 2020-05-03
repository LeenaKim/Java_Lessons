package kr.ac.kopo.day03.homework.ForIf2;
/**
 * 다음 설명을 보고 코드를 작성하세요.
 * 달팽이가 100M 깊이의 우물에 빠졌습니다.
 * 달팽이는 1시간에 5M 속도로 움직입니다.
 * 올라온 높이가 50M 미만일땐 1시간에 1M씩 미끄러지고
 * 50M 이상일땐 1시간에 2M씩 미끄러집니다.
 * 달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요. 
 * 
 * @author Lina
 *
 */
public class Q5 {
	public static void q5() {
		int height = 0;
		int cnt = 0;
		
		while(height < 100) {
			height += 5;
			cnt++;
			if(height < 50) height -= 1;
			else height -= 2;
			System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이 : %dM\n", cnt, height);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q5();
	}
}
/*
 * < 풀이 >
 * 달팽이의 높이 height와 시간을 세는 변수 cnt를 선언한다.
 * 달팽이의 높이가 100미터 미만이라면 달팽이의 높이를 5만큼 증가시켜주고, 시간 cnt도 1만큼 증가시켜준다.
 * 이 때, 달팽이의 높이가 50 미만이라면 높이에서 1을 뺴주고, 그 외의 경우 2를 빼준다.
 * 반복문이 돌면서 매 시간마다 달팽이의 높이를 출력한다.
 * 반복 횟수를 모르기때문에 while문을 쓰는 것이 효율적이다. 
*/