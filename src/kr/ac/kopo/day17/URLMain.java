package kr.ac.kopo.day17;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) {
		
		try {
			URL urlObj = new URL("https://www.naver.com");
//			URL urlObj = new URL("https://movie.naver.com/movie/bi/mi/basic.nhn?code=189150");
			
			
			System.out.println("프로토콜 : " + urlObj.getProtocol());
			System.out.println("호스트 이름 : " + urlObj.getHost());
			System.out.println("포트 : " + urlObj.getPort());// 포트를 쓴적이 없어서 -1이 나옴 
			System.out.println("경로 : " + urlObj.getPath());
			System.out.println("쿼리 : " + urlObj.getQuery());
			
			
			System.out.println("-------------------------------------------");
			//oepnStream 메소드 : url 정보로부터 접속된 서버가 넘겨주는 정보를 읽어올 수 있는 메소드 
			InputStream is = urlObj.openStream();
			// 근데 URL 클래스에는 OutputSream을 가져오는 메ㅗ드는 없다. 대신, 자바에서 웹사이트의 헤더 정보를 가져오는 클래스가 있는데 그것이 URLConnection. 
			InputStreamReader isr = new InputStreamReader(is); //inputStreamReader의 두번쨰 매개변수로 인코딩방식을 쓸 수 있다. 만약 내가 정보를 가져오고자하는 url의 인코딩이 utf-8이 아니라 euc-kr이라면 euc-kr을 isr과 함께 매개변수로 주면 된다. 
			
			while(true) {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);// naver.com에서 오른쪽마우스클릭 -> 페이지 소스 코드 보기에 나오는 코드가 출력됨. 하지만 한글은 바이트로 하나하나 읽어오면 깨지기때문에 바이트를 문자형태로 변환해야함. inputStreamReader 이용.
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		}
}
