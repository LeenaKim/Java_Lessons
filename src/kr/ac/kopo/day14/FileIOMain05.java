package kr.ac.kopo.day14;

import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;
// 문자스트림 //
public class FileIOMain05 {

	// iotest/FileIOMain03.java --> iotest/FileIOMain03.java.txt 복사
	public static void main(String[] args) {
		// 속도를 빠르게 하려면 buffered 클래스를 쓰면 된다. 
		FileReader fr = null;
		FileWriter fw = null;
		
		
		try {
			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/FileIOMain03.java.txt");
			
			
			while(true) {
				int c = fr.read();
				if(c == -1) break;
				System.out.print((char)c);
				fw.write(c);
			}
			fw.flush();// write() 스트림 버퍼 안에 남아있는 데이터들을 file로 모두 보내준다. 
			System.out.println("복사가 완료되었습니다. ");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 매번 finally, if, try catch 구문 쓰기 귀찮으니 따로 메소드를 만들자. kr.ac.kopo.util에. 
			// < 2 > - 다 메소드 오버로드해놨으니 원하는대로 간단히 표현 가능하다. 
			
//			FileClose.close(fr);
//			FileClose.close(fw);
			/*
			if(fr != null) {
				try {
					fr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(fw != null) {
				try {
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}*/
		}
	}
}
