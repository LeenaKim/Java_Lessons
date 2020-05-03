package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello world";
		char c = 'l';
		
		// indexOf(int), indexOf(String) 모두로 가능하다. Int는 유니코드값을 입력. 
		System.out.println(c + "의 검색된 위치 : " + str.indexOf(c));
		// indexOf(String str, startIndex int)
		System.out.println(c + "의 검색된 위치 : " + str.indexOf(c, 4)); // 4번째 인덱스부터 탐색 
		
		c = 'P';
		System.out.println(c + "의 검색된 위치 : " + str.indexOf(c));

		// lastIndexOf : 뒤에서부터 해당되는 문자열의 인덱스를 반환 
		c = 'l';
		System.out.println("lastIndexOf " + c + "의 검색된 위치 : " + str.lastIndexOf(c));

		
		// 만약 문자열 전체에서 특정 문자열을 다 뽑아내고싶다면 
		// < 방법 1 >
		str = "hello world";
		String searchStr = "l"; // 찾고자하는 문자열 
		System.out.println("< " + str + "에서 \"" + searchStr + "\" 위치 >");
		int searchIdx = str.indexOf(searchStr);
		while(searchIdx != -1) {
			System.out.println("검색된 위치 : " + searchIdx);
			searchIdx = str.indexOf(searchStr, searchIdx+1);
		}
		
		// < 방법 2 >  - 더 효율적이고 간단 
		System.out.println("< " + str + "에서 \"" + searchStr + "\" 위치 >");
		searchIdx = -1;
		while((searchIdx = str.indexOf(searchStr, searchIdx+1)) != -1) {
			System.out.println("검색된 위치 : " + searchIdx);
		} // lastIndexOf로도 해봐라. 
	
		
		// Substring : 부분문자열 반환
		str = "hello world";
		System.out.println("substring(2) : " + str.substring(2)); // 2번지부터 마지막까지 = str.substring(2, str.length);
		System.out.println("substring(2, 7) : " + str.substring(2, 7)); // 2번지부터 7번지 전까지 (7은 포함 안됨) 
		
		// concat : 문자열 합치기. 더하기연산과 같은거다. 
		String strA = "good";
		String strB = "bye!!!";
		str = strA + strB;
		str = strA.concat(strB);
		
		// trim : 앞뒤 공백제거. 중간 공백은 제거하지 않는다. 
		str = "           hello           ";
		System.out.println("[" + str + "]" + "의 길이 : " + str.length());
			// 단, trim을 해도 원래 문자열이 바뀌는건 아니여서 길이는 똑같다. 
		System.out.println("[" + str.trim() + "]" + "의 길이 : " + str.length());
		str = str.trim(); // trim한 값으로 저장해줘야 한다. 
		System.out.println("[" + str.trim() + "]" + "의 길이 : " + str.length());
		
		// split : 특정 문자를 기준으로 분리한다. 반환은 문자열 배열이다. 
		str = "홍길동전:허균:조선시대";
		System.out.println("str : " + str);
		
		String[] strArr = str.split(":");
		System.out.println(Arrays.toString(strArr));
		
		strArr = str.split(","); // 분리가 안되서 통쨰로 하나로 배열에 들어간다. 
		System.out.println(Arrays.toString(strArr));
		
		String date = "2020-04-20";
		String[] dateArr = date.split("-");
		System.out.println(Arrays.toString(dateArr));
		
		// valueOf(num) : 기본형을 String형으로 변환 
		int num = 12345;
		System.out.println(num + "" + 100); // 12345100
		System.out.println(String.valueOf(num) + 100);
		
		int n = Integer.valueOf("12"); // 문자형을 정수형으로 
		int n2 = Integer.parseInt("12"); // 문자형을 정수형으로
	}
	
	
	/* indexOf를 메소드로 만들어보면 이런식이다. 
	int indexOf(String str, char c) {
		int i = 0;
		while(i < str.length() && str.charAt(i) != c) {
			i++;
		}
		if(i == str.length()) {
			i = -1;
		}
		return i;
	}
	*/	
	
	/* concat을 메소드로 만들어보면 이런식이다. 
	String concat(String a, String b) {
		char[] chars = new char[a.length() + b.length()];
		int loc = 0;
		for(int i = 0; i < a.length(); i++) {
			chars[loc++] = a.charAt(i);
		}
		for(int i = 0; i < b.length(); i++) {
			chars[loc++] = b.charAt(i);
		}
		return new String(chars);
	}
	*/

}
