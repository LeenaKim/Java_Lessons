package kr.ac.kopo.homework.ForIf2;
/**
 * 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
 * *********
 * -*******
 * --*****
 * ---***
 * ----*
 * 
 * @author Lina
 *
 */
public class Q11 {
	public static void q11() {
		for(int i = 0; i < 5; i++) {
			for(int k = 0; k < i; k++) {
				System.out.printf("%c", '-');
			}
			for(int j = 0; j < 9 - i*2; j++) {
				System.out.printf("%c", '*');
			} 
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q11();
	}

}
/*
 * < 풀이 > 
 * 5개의 행이므로 가장 바깥 반복문의 범위를 5로 지정한다.
 * i개만큼의 '-'를 출력하고, 도형의 오른쪽 부분에는 '-'이 없지만 '*'을 출력할때는 오른쪽도 왼쪽에 있는 '-'의 개수만큼 비워놔야 하므로
 * 총 열의 개수 9에서 왼쪽에 '-'가 출력됬던 개수의 2배를 빼준 수만큼 출력한다.
 */