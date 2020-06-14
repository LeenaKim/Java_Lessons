package kr.ac.kopo.day17;
/*
 * 바이트 단위의 움직임(스트림)은 InputStream / OutputStream 이며,

문자 단위의 움직임(스트림)은 Reader / Writer 이에요.

여기에서 파일에다가 읽고 저장을 한다고 하면, FileInputStream / FileOutputStream 클래스를 사용하게 되구요.

문자단위로 파일에 읽고 저장을 한다면 FileReader / FileWriter 클래스를 사용하면 됩니다.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import kr.ac.kopo.util.FileClose;

class AAA implements AutoCloseable {
	
	@Override
	public void close() throws Exception {
		System.out.println("AAA클래스 객체의 close() 메소드 호출 ");
	}
}
public class URLConnectionMain {

	public static void main(String[] args) {
		
//		FileOutputStream fos = null;
//		OutputStreamWriter osw = null;
//		BufferedWriter bw = null;
		
		try(
				FileOutputStream fos = new FileOutputStream("iotest/naver.html");
				OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
				BufferedWriter bw = new BufferedWriter(osw);
				// try 괄호 안에 auto closable 인터페이스를 상속받는 클래스는 바로 선언할 수 있고, try catch 구문이 끝나는순간 자동으로 close 된다. 
				AAA a = new AAA();// 에러남. autoclosable 인터페이스를 구현하지 않아서. 
		) {
			
//			fos = new FileOutputStream("iotest/naver.html");// 정보를 씌울 새로운 파일 생성 
//			osw = new OutputStreamWriter(fos, "utf-8");// 파일에 utf-8 인코딩으로 아웃풋을 씌운다. 
//			bw = new BufferedWriter(osw);// 빠르게 하기위해 buffered writer 사용 
			
			URL urlObj = new URL("https://www.naver.com ");	
			URLConnection uc = urlObj.openConnection();//  연결한 url 클래스의 자원의 속성을 알아내기위한 클래스 객체로 만들어줌 
			
//			System.out.println(uc.getContentType());
//			System.out.println(uc.getContentLength());
			
			// URL 객체의 전송정보를 iotest/naver.html에 저장
			InputStream is = uc.getInputStream();//url 정보 읽기 
			InputStreamReader isr = new InputStreamReader(is, "utf-8");// utf-8 인코딩으로 읽기 
			BufferedReader br = new BufferedReader(isr);// 빠르게 읽기 
			
			while(true) {
				String data = br.readLine(); // 파일의 끝을 Null로 인식한다. 
				if(data == null) break;
				bw.write(data);// 엔터 전까지만 읽기때문에 newLine() 메소드를 써줌
				bw.newLine();
			}
			bw.flush();
			 
			System.out.println("naver.html 저장하였습니다. ");
			
			FileClose.close(br);
			FileClose.close(isr);
			FileClose.close(is);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
//			FileClose.close(bw);
//			FileClose.close(osw);
//			FileClose.close(fos);
		}
		
	}
}
