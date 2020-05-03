package kr.ac.kopo.day12;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set : 순서(X), 중복허용(X)
 * 	- HashSet
 * 	- TreeSet
 */

public class SetMain {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>(); // binary 이진트리형을 가지기때문에 문자형의 경우 알파벳대로 오름차순 구조를 취한다. 
		
		System.out.println("입력 전 set의 데이터 총 개수 : " + set.size());
		
		System.out.println("\"one\" 데이터 삽입 성공 여부 : " + set.add("one"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("one"); // 중복을 허용 안해서 개수가 똑같이 5다. add 메소드의 리턴타입에 boolean형이 있고, 입력이 제대로 되면 True, 아니면 false를 반환한다. 
		System.out.println("\"one\" 데이터 삽입 성공 여부 : " + set.add("one")); // 중복이기때문에 입력되지 않고 튕긴다. Map은 덮어쓰기가 된다. 
		
		System.out.println("입력 후 set의 데이터 총 개수 : " + set.size());
		
		/*
		 * set의 전체 데이터 출력 방식
		 * 1. 1.5버전의 for문 이용 
		 * 2. Iterator(순환자 클래스) 객체를 이용
		 * 3. toArray 메소드 이용  
		 */
		
		System.out.println("< 1.5버전의 for문을 이용한 출력 >");
		for(String str : set) {
			System.out.println(str);
		} // => 데이터를 찍어보니 순서 없이 출력됨. 출력이 입력순서와 다르게 나옴. 
		
		/*
		 * Iterator(순환객체) 주요 메소드
		 * 		hasNext() : 접근할 다음 데이터의 존재여부 판단 (boolean)
		 * 		next() 	: 다음 데이터로 이동 
		 */
		System.out.println("< Iterator 객체를 이용한 출력 >"); // Iterator : 맨 처음 기준점부터 맨 마지막 데이터까지 접근하는 아이 
		Iterator<String> ite = set.iterator(); // Iterator형을 반환하고 String을 제너릭형태로 씀. 
		
		while(ite.hasNext()) {// 야, iterator, 다음 접근할 데이터가 있니?? 있으면 next()로 옮겨가도록 한다. 
			System.out.println(ite.next()); // 제너릭에 의해 리턴타입은 String 
		}
	
		System.out.println("< toArray() 메소드를 이용한 출력 >");
		Object[] objArr = set.toArray(); // toArray는 제너릭이 안되고 그냥 Object 배열이다. 
		for(int i = 0; i < objArr.length; i++) {
			String str = (String)objArr[i]; // String으로 명시적 형변환 
			System.out.println(objArr[i] + ", 길이 : " + str.length()); // 각각의 문자열 원소의 길이 반환 
		}
	}

}
