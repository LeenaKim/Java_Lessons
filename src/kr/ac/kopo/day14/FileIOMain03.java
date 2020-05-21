package kr.ac.kopo.day14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// iotest/Koala.jpg ==> iotest/Koala3.jpg 복사 
// 코알라 사진 파일을 읽어서(input) 코알라2사진으로 복사한다(output).
/*
 * 작업순서
 * 1. Stream open // 램과 파일간의 연결통로를 만들어준다. 
 * 2. 작업 수행(read, write)
 * 3. Stream close 
 */
public class FileIOMain03 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			//1단계 : stream open 
			fis = new FileInputStream("iotest/Koala.jpg"); 
			fos = new FileOutputStream("iotest/Koala2.jpg"); 
			
			// filterclass인 BufferedInputStream, BufferedOutputStream 객체 생성
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			
			//2단계 : 작업수행(read, write)
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			long end = System.currentTimeMillis();
			System.out.println("복사가 완료되었습니다. ");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초"); // 버퍼를 안쓰면 0.59초, 쓰면 0.014초나옴. 
		} catch(Exception e) {
			e.printStackTrace();
		} finally { // 필터클래스를 사용했을경우 필터클래스를 먼저 닫아주고, 그 후 원본 파일을 닫아준다.
			//3단계 : stream close
			try {
				if(bis != null) { 
					bis.close(); 					
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			if(bos != null) {
				try {
					bos.close(); 
				} catch(Exception e) {
					e.printStackTrace();
				}				
			}
			try {
				if(fis != null) {
					fis.close(); 				
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			if(fos != null) {
				try {
					fos.close(); 
				} catch(Exception e) {
					e.printStackTrace();
				}				
			}
			
			}
	}
}
