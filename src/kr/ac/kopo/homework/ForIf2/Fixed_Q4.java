package kr.ac.kopo.homework.ForIf2;

import java.util.Scanner;

/**
 * 다음의 결과를 보이는 프로그램을 작성하시오.
 * 1 - 100 사이의 정수를 입력 : 40
 * 2 - 10 사이의 정수를 입력 : 5
 * 
 * < 1 ~ 40 사이의 5의 배수를 제외한 정수 출력 >
 * 1 2 3 4 6 7 8 9 11...
 * 
 * < 1~ 40 사이의 5의 배수를 제외한 정수 5개씩 출력 >
 * 1 2 3 4 6
 * 7 8 9 11 12
 *
 * @author Lina
 *
 */
/* < 교수님 코멘트 >
	리나씨 정수 100을 입력하고 한라인에 4개씩 출력하면 중간에 blank line이 나올꺼 같은데....
	확인해보셨나요???? 결과 보시고 조금만 수정해주세요
	
	< 수정 후 결과 >
	교수님, 수업에서 말씀해주신것처럼 cnt를 위의 if문 안에 넣어야 공백줄이 안나오는것 확인했습니다.
	감사합니다!! 
*/
public class Fixed_Q4 {
	public static void q4(int range, int except) {
		
		System.out.printf("< 1 ~ %d 사이의 %d의 배수를 제외한 정수 출력 >\n", range, except);
		
		for(int i = 1; i <= range; i++) {
			if(i % except != 0) System.out.printf("%d ", i);
		}
		
		System.out.println();
		
		System.out.printf("\n< 1 ~ %d 사이의 %d의 배수를 제외한 정수 %d개씩 출력 >\n", range, except, except);
		
		int cnt = 0;
		for(int i = 1; i <= range; i++) {
			if(i % except != 0) {
				System.out.printf("%3d", i);
				cnt++;
				if(cnt % except == 0) System.out.println();
			} 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1-100 사이의 정수를 입력 : ");
		int range = sc.nextInt();
		System.out.println("1-10 사이의 정수를 입력 : ");
		int except = sc.nextInt();
		q4(range, except);
	}

}
/*
 * < 풀이 >
 * 1. 한 줄로 출력 
 * 배제하고자 하는 수 except로 나누었을때 0으로 나누어 떨어지면 except의 배수이다.
 * 나머지가 0이 아닐경우만 반복문을 통해 출력한다.
 * 
 * 2. except개씩 출력 
 * except로 나누었을 때 1부터 range까지 나누어떨어지지 않는 수만 출력하도록 하고, 이 때 출력 횟수를 카운트하는 변수 cnt를 증가시켜준다.
 * cnt가 except의 배수일 경우 줄바꿈을 해준다. 
*/