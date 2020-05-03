package kr.ac.kopo.day11;

public class ExceptionMain05 {
	// < 방법 2 >
	static void a() {
		for(int i = -2; i < 3; i++) {
			System.out.println("for문 진입... [" + i + "]");
			try {
				System.out.println(10 / i);	
//				if(i == -1) return;
			} catch(Exception e) {
				e.printStackTrace();
				break; // 예외발생시 break로 나가면 밑에 for문 종료 문장을 수행하지 않고 빠져나가게됨. 
			} finally {
				System.out.println("for문 종료..."); // 근데 문장을 finally로 해주면 break를 해줘도 예외 있든없든 무조건 실행. 				
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main start");

		a();
	
		/* < 방법 1 > 
		 * for(int i = -2; i < 3; i++) {
			System.out.println("for문 진입... [" + i + "]");
			try {
				System.out.println(10 / i);				
			} catch(Exception e) {
				e.printStackTrace();
				break; // 예외발생시 break로 나가면 밑에 for문 종료 문장을 수행하지 않고 빠져나가게됨. 
			} finally {
				System.out.println("for문 종료..."); // 근데 문장을 finally로 해주면 break를 해줘도 예외 있든없든 무조건 실행. 				
			}
		}
		 */
		
		System.out.println("main end");
	}

}
