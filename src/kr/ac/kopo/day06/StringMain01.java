package kr.ac.kopo.day06;

import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// < 문자열 생성자들 > // 
		String str = new String(); // 비어있는 문자열("") 생성. str은 가리키고 있는 문자열이 있고, 그 길이가 0인 것이다. null과는 다르다. 
		String str2 = new String("Hello World");
		
		char[] chars = {'A', 'B', 'C', 'D', 'E'};
		String str3 = new String(chars); // chars가 갖고있는 배열들을 조합해서 하나의 문자열로 만들겠다. 
		String str4 = new String(chars, 1, 3); // chars 배열의 1번지부터 3개를 가지고 문자열을 만들겠다. 
		
		System.out.println("str : [" + str + "], length : " + str.length());
		System.out.println("str : [" + str2 + "], length : " + str2.length());
		System.out.println("chars : " + Arrays.toString(chars));
		System.out.println("str : [" + str3 + "], length : " + str3.length());
		System.out.println("str : [" + str4 + "], length : " + str4.length());
	
		// charAt(i)
		for(int i = 0; i < str4.length(); i++) {
			System.out.println("str4의" + i + "번째 문자 : "+ str4.charAt(i));			
		}
		
		// getChars(int sourceStart, int sourceEnd, char target[], int targetStart) : 문자열 하나를 문자의 배열로 바꿔주는 메소드 
		str = "Hello World!!";
		chars = new char[str.length()];
		
		str.getChars(0, str.length(), chars, 0); 
		str.getChars(0, 5, chars, 0); // str.length() 대신 임의의 숫자 n을 넣으면 0번지부터 n번지까지의 문자만 추출 
		str.getChars(0, 5, chars, 3); // 0 ~ 5번 문자를 chars의 3번지부터 저장해라 
		System.out.println("chars : " + Arrays.toString(chars));
	}

}
