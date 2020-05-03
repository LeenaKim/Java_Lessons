package kr.ac.kopo.day10;

import java.util.ArrayList;

// 명시적 형변환 
public class CastMain02 {

	public static void main(String[] args) {
		class Icecream {
			
		}
		
		class Hotdog {
			
		}
		
		/*
		 *  그럼 이런 형변환을 언제쓰냐? - ArrayList. 배열과 같다. 하지만 배열은 고정된 크기인 반면, 
		 *  ArrayList는 크기를 계속 유동적으로 수정할 수 있다. 
		 *  ArrayList는 참조자료형 타입의 데이터들만 저장할 수 있다. 
		 */
		ArrayList list = new ArrayList();
		list.add(10); // list.add(object e)가 매개변수로 들어오는데, object는 모든 자료형의 부모클래스이다. 즉, 하위클래스에서 부모클래스로 묵시적 형변환이 일어난다. 
		// 이때의 10은 ArrayList는 참조자료형만 저장할 수 있는데 어떻게 했느냐? - 자바는 기본자료형 int를 참조자료형 Integer라고 인식한다. 
		list.add("hello");
		list.add(new Icecream());
		list.add(new Hotdog());
		
		String str = (String)list.get(1);
		System.out.println("str : " + str + ", length: " + str.length());
		
		/* < 2 >
		Parent p = new Child01();
		Child01 c = (Child01) p; // Runtime 오류를 예방하기위해선 이미 묵시적 형번환이 일어나 자식클래스 값이 할당되있는 객체 p가 값으로 들어와줘야함. 
		*/
		
		/* < 1 >
		// Runtime시 오류 발생 
		Child01 c = (Child01) new Parent(); // 명시적형변환 
		c.print(); // => 컴파일시점엔 에러가 없으나, 실행시켜보면 CastException이 나타남. 자식클래스 공간이 없기 떄문에. 
		*/
	}
	
}
