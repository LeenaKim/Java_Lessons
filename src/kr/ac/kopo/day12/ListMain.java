package kr.ac.kopo.day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List : 순서(ㅇ), 중복허용(ㅇ) 
 * 	- ArrayList
 * 	- LinkedList
 */

public class ListMain {

	public static void main(String[] args) {
		// cf) ArrayList가 아니라 List로 써주는 이유 : ArrayList와 LinkedList 모두를 받을수있는 부모클래스 List라서 묵시적 형변환이 쉽다. 
//		List list = new ArrayList(); // 기존방식(row type)
//		List<String> list = new ArrayList<String>(); // 제너릭방식(jdk 1.5)
		List<String> list = new ArrayList<>(); // 제너릭방식(jdk 1.7) - 뒤에 나오는 타입은 생략 가능 

		System.out.println("입력 전 list의 원소의 총 개수 : " + list.size());
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("one"); // 리스트는 중복 허용 
		
		/*
		 * List의 전체 데이터 출력 방식
		 * 1. 인덱스를 이용
		 * 2. 1.5버전의 for문 이용
		 */
		System.out.println("입력 후 list의 원소의 총 개수 : " + list.size());
		
		System.out.println("< get(intdex)를 이용한 전체 데이터 출력 >");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("< 1.5버전의 for문을 이용한 전체 출력 >");
		for(String l : list) {
			System.out.println(l);
		}
		
		System.out.println("2번지에 위치한 데이터 : " + list.get(2));
		System.out.println("삭제된 데이터 : " + list.remove(2)); // 삭제한 데이터를 리턴한다. 인덱스로 remove할때의 리턴타입은 String. 
		System.out.println("삭제 후 2번지에 위치한 데이터 : " + list.get(2));
		
		System.out.println("\"one\" 데이터 삭제1 : " + list.remove("one")); // 데이터 값으로 삭제하는 경우 boolean 리턴. 첫번째 one 삭제 
		System.out.println("\"one\" 데이터 삭제2 : " + list.remove("one")); //	두번째로나오는 one 삭제 
		System.out.println("\"one\" 데이터 삭제3 : " + list.remove("one")); // 더이상 없으니 false 반환. 
		
		System.out.println("\"one\" 데이터 유무 : " + list.contains("one"));
		System.out.println("\"two\" 데이터 유무 : " + list.contains("two"));
		
		
		List<String> sub = new LinkedList<String>();
		sub.add("1");
		sub.add("2");
		sub.add("3");
		
		// list의 2번지에 "zero" 문자열 삽입
		list.add(2, "zero"); // zero가 들어가며 데이터가 하나씩 다 밀리게된다. 
		
		System.out.println("< list 전체 데이터 출력 >");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("< sub 전체 데이터 출력 >");
		for(String str : sub) {
			System.out.println(str);
		}
		
		list.addAll(sub); // sub는 LinkedList이고, list는 ArrayList이지만 상관 없다. 다 합쳐준다.
		
		System.out.println("addAll() 후 list의 전체 데이터 개수 : " + list.size());
		
		
		if(list.isEmpty()) {
			System.out.println("list가 비어있습니다.");
		} else {
			System.out.println("list에 데이터가 하나 이상 존재합니다. ");
		}
		
		list.clear();
		System.out.println("claer()...");
		if(list.isEmpty()) {
			System.out.println("list가 비어있습니다.");
		} else {
			System.out.println("list에 데이터가 하나 이상 존재합니다. ");
		}
	}

}
