package kr.ac.kopo.day03.homework.ForIf2;
/**
 * 구구단을 출력하세요. 
 * @author Lina
 *
 */
public class Q7 {
	public static void q7() {
		for(int i = 2; i <= 9; i++) {
			System.out.printf("*** %d단 ***\n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q7();
	}

}
/*
 * < 풀이 >
 * 2단부터 9단까지는 바깥 반복문으로, 곱하는 수인 1부터 9까지는 안쪽 반복문으로 출력해준다.  
 */