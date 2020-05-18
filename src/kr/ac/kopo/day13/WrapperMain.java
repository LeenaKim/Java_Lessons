package kr.ac.kopo.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Wrapper Class : 기본 자료형 8가지를 참조 자료형으로 감싸는 것. java.lang 패키지에 있어서 따로 import 안해도 된다. 
 * 
 * 		byte			Byte
 * 		char			Character
 * 		short			Short
 * 		int				Integer
 * 		long			Long
 * 		float			Float
 * 		double			Double
 * 		boolean			Boolean
 */

/*
 * class Integer {
 * 		private int value;
 * } => 기본자료형인 int를 참조자료형인 Integer가 감쌌다. 
 */
public class WrapperMain {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(100)); // 근데, 우리는 지금까지 한번도 리스트에 new 생성자로 값을 넣지 않았다. 그냥 add(100) 하면 되었다. 
		list.add(new Integer(200));
		
		System.out.println(Arrays.toString(list.toArray()));
		
		int i = 10;
		// Integer i2; // 초기화된적이 없기 때문에 출력해보면 에러가 난다. undefined. 
		Integer i2 = new Integer(100); // 반드시 생성자로 인스턴스 객체를 생성해줘야한다.
		Integer i3 = 123; // java 1.5버전부터 가능해졌다. auto-boxing이 되서 알아서 new Integer로 boxing되었다. 
		int i4 = new Integer(200); // 반대로, Integer로 씌워있던 아이를 다시 int로 알아서 변환시켜줬다. 이를 auto-unboxing이라 한다. 
		
		String str = "19455";
		System.out.println(str + " + " + 100 + " = " + (str + 100));
		
		int num = Integer.parseInt(str); // 리턴타입이 기본자료형. 기본적으로 unboxing이 되어서 나온다. 
		System.out.println(num + " + " + 100 + " = " + (num + 100));
		
		int num2 = Integer.valueOf(str); // T.valueOf() : 들어온 인자를 모두 T 타입으로 바꿔준다. 리턴타입이 참조자료형. 그래서 내가 원하는게 기본자료형인데 속도가 빠른 프로세싱을 원한다면 valueOf보단 parseInt를 쓴다. 
		System.out.println(num2 + " + " + 100 + " = " + (num2 + 100));
		
		
	}
}
