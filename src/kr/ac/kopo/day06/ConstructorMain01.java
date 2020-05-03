package kr.ac.kopo.day06;
/*
 * 생성자의 특징
 * 1. 클래스 명과 동일
 * 2. 반환형이 존재하지 않음 (void 쓰지도 않아!) 
 * 3. 생성자 오버로딩을 지원
 * 4. 객체의 속성을 초기화 
 * 5. 디폴트 생성자를 지원 : 클래스 내에 생성자가 하나도 정의되어있지 않은 경우 JVM이 자동으로 생성자 선언 (매개변수 X, 내용부 X) 
 * 						클래스명() { }
 * 
 */
class Dog {
	// 대부분 매개변수 받는 생성자를 만드는데, 그 전에 항상 디폴트 생성자 만들어라. 오류를 덜 나게 하는 방법이다. 
	Dog() {
		System.out.println("디폴트생성자(기본생성자) 호출...");
	}
	
	Dog(String name){
		System.out.println("Dog(String) 생성자 호출...");
	}
	
	Dog(String name, int age){
		System.out.println("Dog(String, int) 생성자 호출...");
	}
}
public class ConstructorMain01 {
	
	public static void main(String[] args) {
		
		new Dog(); // Dog에서 생성자 안만들어줘도 에러 안남. JVM이 디폴트 생성자를 알아서 만들어줘서. 
					// 근데 밑에 매개변수 받는 Dog()를 오버로딩하면 디폴트 생성자를 따로 안만들어주면 JVM이 자동으로 만들어주지 않아서 에러남. 
		new Dog("아지");
		
		new Dog("강아지", 5);
	}
}
