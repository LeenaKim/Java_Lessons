package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main start...");
		
		// < 방법 3 >
		Random r = new Random();
		int num = r.nextInt(3);
		// 예외처리를 해보자. 
		try {
			System.out.println("추출된 난수: " + num);
			System.out.println(10 / num); 
			
			String str = "hello";
			System.out.println("5번째 문자 : " + str.charAt(5)); // 5번지까지 없기때문에 예외발생. 
			// but, 10/num에서 예외가 발생하면 String부분을 건너뛰고 catch로 간다. 10/num에서 예외가 발생하지 않으면 String이 실행되고 catch에서 잡아주지 않았기 때문에 예외가 발생되며 프로그램이 종료된다. 그래서 catch 구문은 멀티가 가능하다.  
		
		} catch(Exception e) { // 어떤 예외가 발생하건간에 묵시적 형변환으로 받아주기 위해. 내가 무슨 예외가 나올지 모를수도 있으니까. 보통 이렇게 묵시적 형변환을 시켜주고, 내가 예외처리 각각마다 처리를 다르게하고싶을때만 멀티catch 구문을 쓴다. 그렇다고 catch가 다수의 예외를 한꺼번에 처리해줄수있는건 아니다. 이 구문 자체가 둘 중 하나가 일어났을경우니까. 
			e.printStackTrace();
		}
		/*< 방법 2 >
		} catch(ArithmeticException | StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		*/
			
		/*< 방법 1 >
		 catch(ArithmeticException ae) {
		 
			System.out.println("ArithmeticException 예외 발생 !!!"); 
			System.out.println("발생 이유" + ae.getMessage()); 
			ae.printStackTrace(); 
		} catch(StringIndexOutOfBoundsException se) { // 하지만, 하나의 catch구문을 만족하면 나머지는 수행하지 않는다. 그래서 방법2같은 방법이 있다. 
			System.out.println("StringIndexOutOfBoundsException 예외 발생 !!!");
			se.printStackTrace();
		}
		*/
		System.out.println("main end...");
	}
	
}
