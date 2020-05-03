package kr.ac.kopo.day07.homework.stringConstructor;
/**
 * 아래의 내용을 만족하는 StringUtil 클래스를 작성합니다.
 * 1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 isUpperChar(char c) 메소드를 작성하시오.
 * 2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메소드를 작성하시오.
 * 3. 두개의 숫자를 입력받아 큰 수를 반환하는 max(int i, int j) 메소드를 작성하시오.
 * 4. 두 개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오.
 * 5. 문자열을 입력받아 거꾸로 변경하는 reverseString(String str) 메소드를 작성하시오.
 * 6. 문자열을 입력받아 대문자로 변경하는 toUpperString(String str) 메소드를 작성하시오.
 * 7. 문자열을 입력받아 소문자로 변경하는 toLowerString(String str) 메소드를 작성하시오. 
 * @author Lina
 *
 */
public class StringUtil {
	// < 1 >
	boolean isUpperChar(char c) {
		boolean isCapital; // 리턴값 boolean 생성 
		isCapital = (c <= 90 ? true : false); // ascii코드표에서 90보다 작으면 대문자이니 true 할당. 그 외 false 할당. 
		return isCapital;
	}
	
	// < 2 >
	boolean isLowerChar(char c) {
		boolean isLower;
		isLower = (c >= 97 ? true : false); // ascii 코드표에서 97보다 크면 소문자이니 true 할당. 그 외 false 할당. 
		return isLower;
	}
	
	// < 3 >
	int max(int i, int j) {
		int max;
		max = (i < j ? j : i); // i가 j보다 작으면 max에 j를 할당. 그 외 i를 할당. 
		return max;
	}
	
	// < 4 >
	int min(int i, int j) {
		int min;
		min = (i > j ? j : i); // i가 j보다 크면 min에 j를 할당. 그 외 i를 할당. 
		return min;
	}
	
	// < 5 >
	String reverseString (String str) {
		String answer = "";
		for(int i = str.length() - 1; i >= 0; i--) { // str의 마지막 인덱스에서부터 0까지 하나씩 줄여가며 리턴값에 추가해준다. 
			answer += str.charAt(i);
		}
		return answer;
	}
	
	// < 6 >
	String toUpperString (String str) {
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 97 && str.charAt(i) >= 122) answer += (char)(str.charAt(i) - 32); // ascii 값에 따라 소문자일경우 32를 빼 대문자로 바꿔준다. 
			else answer += str.charAt(i); // 그 외는 그대로 추가. 
		}
		return answer;
	}
	
	// < 7 >
	String toLowerString (String str) {
		String answer = "";
		for(int i = 0; i < str.length(); i++) { // ascii 값에 따라 대문자일 경우 32를 더해 소문자로 만들어준다. 
			if(str.charAt(i) <= 90 && str.charAt(i) >= 65) answer += (char)(str.charAt(i) + 32);
			else answer += str.charAt(i); // 그 외 그대로 추가. 
		}
		return answer;
	}
}
