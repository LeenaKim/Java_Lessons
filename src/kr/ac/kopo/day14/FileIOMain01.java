package kr.ac.kopo.day14;

import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {

	public static void main(String[] args) {
		
		System.out.println("입력하세요. 종료는 ctrl+z 입니다. "); // ctrl+z 는 프로그램 종료의 암묵적인 약속이다. 모든 프로그램상에서 컨트롤 제트를 실행취소나 종료로 암묵적으로 사용한다. 
	
		InputStream is = System.in; // System 클래스의 public static 변수인 in : 키보드 입력장치를 의미한다. Scanner(System.in)을 해준 이유. 
		InputStreamReader isr = new InputStreamReader(is); // 바이트로 들어와 캐릭터로 나오는 io의 필터 클래스 
		
		try {
			while(true) {
				int c = isr.read();
				if(c==-1 || c=='q') break;
				System.out.print((char)c);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
			
	/*
	 * < 1 >
		InputStream is = System.in; // System 클래스의 public static 변수인 in : 키보드 입력장치를 의미한다. Scanner(System.in)을 해준 이유. 
	
		try {	
			while(true) {
				int c = is.read(); // 너 외부장치로 입력받을라하는데, 그 외부장치가 문제생기면 어떡하려구...! 라는 생각에 빨간줄로 컴파일시점에 에러남. read() 메소드 가보면 read()를 사용하는 객체에 예외를 던지고있기때문에 항상 try catch로 예외처리를 해줘야함. 				
				if(c == -1) break; // read() 메소드는 문자열의 끝을 만날시 -1을 반환한다. 
				//System.out.println(c); // 즉, 파일의 끝에 도달하면 -1을 반환해서 종료하게 하거나, 컨트롤 제트를 날리면 종료하게 한다. 10은 엔터의 ascii코드. 
				// 내가 칠때마다 하나씩 출력됨. 왜? 버퍼로 입력받기때문에. 입력받는 문자와 숫자를 모두 ascii코드로 출력한다. 
				System.out.print((char)(c)); // ascii코드값으로 변환하지않으려면 char형으로 변환하면 된다. 
					//but, '안녕하세요'를 입력하면 한글은 한글자당 2~3바이트이기때문에 문자열의 반만 잘라서 아스키코드로 읽게되 이상한 문자가 출력된다. 그래서 한글의경우 1바이트 들어오고 그 다음 1바이트가 들어와서 합쳐주는 과정이 필요하다. 바이트형태로 들어온 아이를 문자로 바꿔주는 클래스가 필요하다. 그것이 바로 inputStreamReader. 
			}
		} catch(Exception e) { 
			e.printStackTrace();
		}
		
	 */
}

}
