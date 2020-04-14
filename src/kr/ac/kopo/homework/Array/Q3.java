package kr.ac.kopo.homework.Array;

import java.util.Scanner;

/**
 * 다음의 결과를 보이는 코드를 작성하시오.
 * 1번째 정수 : 10
 * 2번쨰 정수 : 5
 * 	10보다 큰수가 와야합니다.
 * 2번째 정수 : 12
 * 3번쨰 정수 : 36
 * 4번째 정수 : 6
 *  10, 12, 36보다 큰수가 와야합니다.
 * 4번쨰 정수 : 22
 *  10, 12, 36보다 큰수가 와야합니다.
 *  4번째 정수 : 30
 *  5번째 정수 : 67
 *  
 *  < PRINT >
 *  10 12 36 40 67
 *  < REVERSE >
 *  76 4 63 21 1
 *  
 * @author Lina
 *
 */
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("1번째 정수 : ");
		num[0] = sc.nextInt(); // 첫번째 정수는 배열의 0번째 인덱스에 저장 
		
		int cnt = 1; // 올바른 정수를 몇 번 입력했는지 세준다. 
		while(cnt < 5) {
			System.out.println(cnt+1 + "번째 정수 : ");
			int n = sc.nextInt();
			if(num[cnt-1] < n) { // 전 수보다만 크면 조건을 만족하므로 배열에 추가해준다.
				num[cnt] = n;
				cnt++;
			}
			else {
				for(int i = 0; i < cnt; i++) {
					System.out.printf("%d ", num[i]);
				} System.out.println("보다 큰 수가 와야합니다. "); // 전 수보다 크지 않을 경우 다시 입력하라 한다. 
			}
		}
		String[] numString = new String[num.length]; // reverse 출력을 위한 문자열 배열을 만든다. 
		
		System.out.println("< PRINT >");
		for(int i = 0; i < num.length; i++) {
			System.out.printf("%3d", num[i]); 
			numString[i] = Integer.toString(num[i]); // 정수형 배열을 출력하며 동시에 문자열 배열에 할당한다. 
		}
		
		System.out.printf("\n< REVERSE >\n");
		for(int i = numString.length-1; i >= 0; i--) { // 순서도 거꾸로이고,  
			String str = "";
			for(int j = numString[i].length()-1; j >= 0; j--) { // 숫자 내의 자리수도 거꾸로이다. 마지막 인덱스부터 첫번째 인덱스까지 반복문을 돌아준다. 
				if(numString[i].charAt(j) != '0') str += numString[i].charAt(j); // 문자의 뒷자리부터 str에 추가. 
			}
			System.out.printf("%3s", str);
		}
	}

}
