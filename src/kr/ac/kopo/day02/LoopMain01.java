package kr.ac.kopo.day02;
/*
 *< 반복문 수행 4가지 요소 >
 *1. 반복문
 *2. 시작값
 *3. 시작값 변경 코드
 *4. 종료 조
 *
 *	init;
 *	while(expr) {
 *		statement;
 *		incre/decre;
 *	}
 *
 *	for( init; expr; incre/decre) {
 *		statement;
 *	}
 *
 *	한바퀴 뛸 차례다
 *	while(!운동장 다섯바퀴 다 뛰었냐?) {
 *		운동장 한바퀴 뛴다
 *		바퀴수 증가
 *	}
 */
public class LoopMain01 {

	public static void main(String[] args) {
		
		for(int cnt = 1; cnt <= 5; cnt++) {
			System.out.println("Hello");
		}
		
// while 문 //
		/*
		final int MAX = 10;
		int cnt = 1;
		
		while(cnt <= MAX)
		//cnt <= 10 아니면 cnt != 11도 가능하나 10번이라고 명시하는게 더 편함  
		 {
			System.out.println("Hello");
			cnt++;
		}
		*/
	
	}

}