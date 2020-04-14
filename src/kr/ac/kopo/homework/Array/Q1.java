package kr.ac.kopo.homework.Array;
/**
 * 10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오.
 * 
 * 1's num : 12
 * 2's num : 5
 * ...
 * 10's num : 22
 * 
 * < 짝수 >
 * 12 8 30 22 4 22
 * 짝수의 총합 : xxx
 * < 홀수 >
 * 이하 동문 
 */
import java.util.Scanner;

public class Q1 {
	/*public static void q1(int[] num) {
		
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[10]; // Scanner를 통해 받을 10개의 정수가 저장될 배열의 heap 메모리 공간 할당 
		
		int odd = 0, even = 0, oddCnt = 0, evenCnt = 0; // odd : 홀수의 합 / even : 짝수의 합 / oddCnt : 홀수의 개수 / evenCnt : 짝수의 개수 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 정수를 입력하시오. ");
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(num[i] % 2 == 0) { // 짝수일시 짝수의 개수를 늘려주고 짝수의 합에 더해간다. 
				evenCnt++;
				even += num[i];
			} else { // 홀수일시 홀수의 개수를 늘려주고 홀수의 합에 더해간다. 
				oddCnt++;
				odd += num[i];
			}
		}
		
		
		int[] evenArr = new int[evenCnt]; // 1차원 배열은 선언시 배열의 길이또한 명시해줘야하므로 앞서 계산한 짝수, 홀수 개수의 길이만큼 배열 생성 
		int[] oddArr = new int[oddCnt];
		
		oddCnt = -1; evenCnt = -1; // 인덱스값을 ++ 해주며 짝, 홀수값을 저장해줄거기 때문에 -1로 초기화해준다. 
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) evenArr[++evenCnt] = num[i]; // 전위증가로 해야 -1에서 +1이 먼저 수행되고 그 후 배열에 저장된다. (안그럼 인덱스값이 -1이라 오류가 난다.) 
			else oddArr[++oddCnt] = num[i];
		}
		
		
		System.out.println("< 짝수 >");
		for(int e : evenArr) {
			System.out.printf("%3d", e);
		}
		System.out.printf("\n짝수의 총합 : %d\n", even);
		
		System.out.println("< 홀수 >");
		for(int o : oddArr) {
			System.out.printf("%3d", o);
		}
		System.out.printf("\n홀수의 총합 : %d\n", odd);
		
		// To. 교수님, 더 간단한 방법이 있을것 같습니다. 더 고민해보겠습니다. 
	}

}

