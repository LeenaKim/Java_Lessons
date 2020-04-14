package kr.ac.kopo.homework.ForIf2;
/**
 * 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
 * 반복문 5개, 조건문 1개 이용 가능
 * 반복문 3개, 조건문 3개
 * 반복문 3개, 조건문 1개
 * 반복문 2개, 조건문 2개 
 * 
 * *****
 * -****
 * --***
 * ---**
 * ----*
 * ---**
 * --***
 * -****
 * *****
 * 
 * @author Lina
 *
 */
public class Q10 {
	
	public static void q10() {
		
		for(int i = 1; i <= 9; i++) {
			int cnt = 0;
			if(i <= 5) {
				for(int j = 1; j < i; j++) {
					System.out.printf("%c", '-');
					cnt = j;
				} for(int k = 1; k <= 5 - cnt; k++) {
					System.out.printf("%c", '*');
				}
				System.out.println();
			}
			else {
				for(int j = 1; j <= 9 - i; j++) {
					System.out.printf("%c", '-');
					cnt = j;
				} for(int k = 1; k <= 5 - cnt; k++) {
					System.out.printf("%c", '*');
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q10();
	}

}
/*
 * < 풀이 >
 * 총 9행이기 때문에 가장 바깥쪽 반복문에서 행 구분을 해준다.
 * 1번행부터 5번행까지는 i의 수만큼 '-'를 출력하고, 총 열의 수가 5이므로 5에서 '-'를 출력한 개수를 뺀만큼 '*'을 출력한다.
 * 이 때, '-'를 출력한 개수인 마지막 j를 cnt에 저장하여 '*'를 출력할 때 5에서 빼주도록 한다.
 * 
 * 6번행부터 9번행까지는 총 9개의 행에서 i를 뺀만큼 '-'를 출력해준다.
 * i가 1씩 증가하면서 '-'가 출력되는 개수도 줄어든다.
 * '*'은 위의 1번행부터 5번행에서 '*'을 출력한 방법과 동일하다. 
 */ 