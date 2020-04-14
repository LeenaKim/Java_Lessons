package kr.ac.kopo.day03;

public class LoopMain02 {

	public static void main(String[] args) {
// 중첩 for문 //
		/*
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		// 방법 2
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j < i) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		
		
		// 방법 1
		for(int i = 1; i <= 5; i ++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= 6-i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		/*
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j < 6; j++) {
				System.out.printf("%d", j);
			}
			System.out.println();
		}
		
		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print('*');			
			}
			System.out.println();
		}	

		/*
		 *    ***** 별 찍기 
		 *    ***** 별 찍기 
		 *    ***** 별 찍기 
		 */
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.println('*');
			}
			System.out.println('\n');
		}
		
	}
}