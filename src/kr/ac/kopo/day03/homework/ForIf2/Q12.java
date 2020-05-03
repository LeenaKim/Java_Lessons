package kr.ac.kopo.day03.homework.ForIf2;
/**
 * 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
 * *-------*
 * **-----**
 * ***---***
 * ****-****
 * *********
 * ****-****
 * ***---***
 * **-----**
 * *-------*
 * 
 * @author Lina
 *
 */
public class Q12 {

	public static void q12() {
		for(int i = 1; i <= 9; i++) {
			if(i < 5) {
				for(int j = 1; j <= i; j++) {
					System.out.printf("%c", '*');
				} for(int j = 1; j <= 9 - i*2; j++) {
					System.out.printf("%c", '-');
				} for(int j = 1; j <= i; j++) {
					System.out.printf("%c", '*');
				}
			}
			else if (i == 5) {
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%c", '*');
				}
			}
			else {
				for(int j = 0; j <= 9 - i; j++) {
					System.out.printf("%c", '*');
				} for(int j = 0; j < 9 - (10 - i)*2; j++) {
					System.out.printf("%c", '-');
				} for(int j = 0; j <= 9 - i; j++) {
					System.out.printf("%c", '*');					
				}
			} 
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q12();
	}

}
/*
 * < 풀이 >
 * 총 9개의 행이고, 앞의 4행과 뒤의 4행, 그리고 가장 가운데 5번째 행 이렇게 세 조건으로 나누었다.
 * 첫번째 4개의 행은 위 아래에 i개만큼 '*'을 출력하는 반복문을 써주고, 그 사이에 '-'를 출력하는 반복문을 넣었다.
 * '-'의 개수는 전체 9열에서 '*'을 출력한 개수인 i*2만큼을 뺀 개수만큼 출력한다.
 * 
 * 가장 가운데의 5번째 행은 9열 모두 '*'을 출력한다.
 * 
 * 마지막 4행은 전체 열 9개에서 i를 뺀만큼 '*'을 양 옆으로 출력한다.
 * 가운데 '-'은 총 9열에서 '*'를 출력한 개수를 빼준만큼 출력해준다.
 * 
 * 어찌저찌 완성은 되었으나, 더 효율적인 코드가 있을것 같고, 더 고민해야 할 부분이다. 
 */ 