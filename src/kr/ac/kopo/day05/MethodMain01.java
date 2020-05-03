package kr.ac.kopo.day05;

/* 다음의 결과를 보이는 프로그램을 작성하고 싶다. 
 * **********
 * Hello
 * **********
 * Hi
 * **********
 * Goodbye
 * **********
 */
public class MethodMain01 {
	
	/*
	 *  메소드 : 반환형 메소드명(매개변수) { }
	 *  반환형 : printStar -> main 값을 전달
	 *  매개변수 : main -> printStar 값을 전
	 */
	
	
	// printStar 함수를 정의 
	static void printStar(char c, int a) { // printStar은 호출을 당하기 때문에 "피호출자 메소드"라고 한다. 
		
		// < 3 > 매개변수가 두개인 메소드 - 별의 모양과 숫자를 모두 다르게
		for(int i = 0; i < a; i++) {
			System.out.print(c);
		}
		System.out.println();
		
		/* < 2 > 매개변수가 있는 메소드  - 별의 개수를 다르게 
		for(int i = 0; i < a; i++) {
			System.out.print('*');
		}
		System.out.println();
		 */
		
		/* < 1 > 매개변수 없는 메소드 
		 * int i = 10; // 만약 메소드 안에 지역변수 i를 만들면 i는 메소드가 호출될때마다 다시 선언된다. 
		System.out.println("**********");
		++i;
		 */
	}
	
	public static void main(String[] args) { // main이 printStar()를 호출하기 때문에 "호출자메소드"라고 한다. 
		
		/*
		System.out.println("**********");
		System.out.println("Hello");
		System.out.println("**********");
		System.out.println("Hi");
		System.out.println("**********");
		System.out.println("Goodbye");
		System.out.println("**********");
		// 이렇게 하면 되지만, 만약 별을 20개로 늘리려고 하면 네 개의 별을 찍는 코드를 다 수정해야됨.
		// 별을 다시 10개로, 이번엔 #으로 이런식으로 수정이 많이 들어가게되면 절차지향은 용이하지 않아짐. 
	    */
		
		/* 반복하면 되지 않아?
		for(int i = 0; i < 4; i++) {
			System.out.println("**********");
		} // 그런데 문제는, 그 뒤에 나올 문자들이 규칙이 없다는 것. 그래서 반복문 안에 못들어가는 것. 
		  // 즉, 반복문은 반복되는 문장이 연달아 나올때 의미가 있는것이다. 반복되지 않는 문장이 중간중간 들어가면 반복문이 의미 없게된다. 
		*/
		
		/* < 1 >
		// 그럼 별 열개찍고 엔터찍는 문장을 만들어서 그 문장을 수행하면 되지 않나?! => 메소드. (항상 클래스 안에 있어야 한다.) 
		int i = 100; // 메인메소드의 i와 printStar 메소드의 i는 서로가 지역변수이기때문에 서로 다른 변수이고, 서로 아무런 영향을 주지 않는다. 
		printStar(); // printStar 함수를 호출 
		System.out.println("Hello");
		printStar();
		System.out.println("Hi");
		printStar();
		System.out.println("Goodbye");
		printStar();
		System.out.println(i);
		// => 별의 개수나 모양을 바꿀때 메소드 정의만 바꿔주면 되서 간편함. 
		*/
		
		/* < 2 > 별의 개수를 내가 맘대로 바꾸고싶을때. 
		printStar(10);
		printStar(5);
		printStar(20);
		printStar(12);
		
		*/
		
		// < 3 > 별의 숫자와 모양을 모두 바꾸고 싶을 때.
		printStar('*', 10);
		printStar('-', 5);
		printStar('#', 12);
		printStar('!', 8);
		
		
	}
}
