package kr.ac.kopo.day03.homework.ForIf2;

import java.util.Scanner;

/**
 * 시작단과 종료단을 입력받아 구구단을 출력하시오. 
 * 시작단과 종료단이 뒤바뀌어도 같은 결과가 나타나야 한다. 
 * @author Lina
 *
 */
public class Q8 {
	public static void q8(int start, int end) {
		if(start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		for(int i = start; i <= end; i++) {
			System.out.printf("*** %d단 ***\n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("시작단을 입력 : ");
		int start = sc.nextInt();
		System.out.println("종료단을 입력 : ");
		int end = sc.nextInt();
		q8(start, end);
	}

}
/*
 * < 풀이 >
 * 시작점 start와 종료점 end를 입력받아 구구단을 출력하는데, start와 end를 비교해 더 작은 수가 start로 할당되도록 한다.
 * 만약 start가 end보다 큰 수라면 둘의 자리를 바꿔야 하므로 start를 임시 변수인 temp에 저장하고, start에는 end의 수를 할당한다.
 * end에는 임시 변수 temp에 저장되있던 원래 start 값을 저장한다.
 * 
 * 그 밑의 구구단을 출력하는 과정은 7번문제와 같다. 
 */ 