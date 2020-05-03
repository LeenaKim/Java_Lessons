package kr.ac.kopo.day07;

public class StringMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("Hello");
		String str2 = "hello";
	
		System.out.println("str : [" + str + "]");
		System.out.println("str2 : [" + str2 + "]");
		
		// == 연산자를 사용하게 되면 주소값을 비교하기때문에 다르다. 
		System.out.println("== 연산자는 주소값을 비교 ");
		if(str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		
		// str, str2가 참조하고있는 주소에 저장된 값을 비교하려면 equals. 대소문자를 구분하기때문에 !=가 나옴. 
		System.out.println("equals()...");
		boolean bool = str.equals(str2);
		if(bool) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		
		// 대소문자 무시하고 비교하고싶다면 equalsIgnoreCase
		System.out.println("equalsIgnoreCase()...");
		bool = str.equalsIgnoreCase(str2);
		if(bool) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		
		System.out.println("startsWith()...");
		str = "hello world";
		System.out.println("[" + str + "] 이 'h'로 시작하나요? : " + str.startsWith("h"));
		System.out.println("[" + str + "] 이 'he'로 시작하나요? : " + str.startsWith("he"));
		System.out.println("[" + str + "] 이 'He'로 시작하나요? : " + str.startsWith("He"));
		System.out.println("endsWith()...");
		System.out.println("[" + str + "] 이 'world'로 끝나나요? : " + str.endsWith("world"));
		
		str = "Hello";
		str2 = "Herlo";
		
		System.out.println("compareTo()...");
		// compareTo는 문자열 내 각각의 인덱스에있는 문자의 유니코드를 서로 빼서 비교한다. 빼서 0이면 같다. 뺴서 음수면 str이 str2보다 작다. 뺴서 양수면 str이 str2보다 크다. 
		// 예를들어 Heplo와 Hello를 비교한다면 H, e는 차이가 0이니 같지만 p - l > 0 (사전에 l이 먼저나오니까).
		// 대소문자를 구분하고, 0번째 인덱스부터 비교하다가 차이가 나면 그것만 반환하고 뒤 문자는 보지 않는다. 
		int cmp = str.compareTo(str2);
		System.out.println("compareTo() 결과 : " + cmp); // 0이나오니까 같은것. 
		
		str = "banana";
		str2 = "boat";
		
		if(cmp == 0) {
			System.out.println(str + " == " + str2);
		} else if(cmp < 0) {
			System.out.println(str2 + " > " + str);
		} else {
			System.out.println(str2 + " < " + str);
		}
		
		
		String[] names = {"홍길동", "홍길순", "강길동", "윤길동", "한길동", "김철수", "강철홍", "홍길동"};
		
		System.out.println("< 이름이 \"홍길동\"인 사람 검색 >");
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals("홍길동")) {
				System.out.println(names[i]);
			}
		}
		
		System.out.println("< 성이 \"홍\"인 사람 검색 >");
		for(int i = 0; i < names.length; i++) {
			if(names[i].startsWith("홍")) {
				System.out.println(names[i]);
			}
		}
		System.out.println("< 이름이 \"길동\"인 사람 검색 >");
		for(int i = 0; i < names.length; i++) {
			if(names[i].endsWith("길동")) {
				System.out.println(names[i]);
			}
		}
		// str.contains("str2") : str2가 포함됬냐 안됬냐 boolean 
		System.out.println("< \"홍\"이 포함된 사람 검색 >");
		for(int i = 0; i < names.length; i++) {
			if(names[i].contains("홍")) {
				System.out.println(names[i]);
			}
		}
	}

}
