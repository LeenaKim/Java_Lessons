package kr.ac.kopo.day11;

import java.util.Scanner;

public class ExceptionMain07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("짝수를 입력하세요 : ");
			int num = sc.nextInt();
			if(num % 2 == 1) {
//				throw new Exception("홀수입니다. 짝수를 입력하세요. ");	 // 예외 생성자 
				throw new OddException("홀수입니다. 짝수를 입력하세요. "); // 내가 정의한 예외를 호출. 
			}
			System.out.println("입력받은 짝수 : "+ num);			
		} catch(Exception e) {
			System.out.println("예외발생!!!" + e.getMessage()); // getMessage 찍어도 사용자정의 예외라 null값이 뜸. 이럴땐 생성자에다 적어줘야 함. 
			e.printStackTrace(); // 생성자에서 호출메세지를 정의해주면 printStackTrace 메소드 호출시 "홀수입니다. 짝수를 입력하세요."가 예외 메세지로 뜸. 하지만 사용자정의 이름은 그냥 Exception으로 뜸. 이럴땐 사용자정의 예외 클래스를 만들고 Exception 클래스를 상속받으면 됨. -> oddException 클래스 확인  
		}
		/* < 방법 1 > 이렇게 if else로 잡아줘도 되지만, 짝수가 아닐경우 사용자정의 예외로 판단해보자. 
		if(num % 2 == 1) {
			System.out.println("홀수입니다. 짝수를 입력하세요. ");
		} else {
			System.out.println("입력받은 짝수 : "+ num);			
		}
		*/
		
	}

}
