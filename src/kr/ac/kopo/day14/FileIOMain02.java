package kr.ac.kopo.day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// iotest/Koala.jpg ==> iotest/Koala2.jpg 복사 
// 코알라 사진 파일을 읽어서(input) 코알라2사진으로 복사한다(output).
/*
 * 작업순서
 * 1. Stream open // 램과 파일간의 연결통로를 만들어준다. 
 * 2. 작업 수행(read, write)
 * 3. Stream close 
 */
public class FileIOMain02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//1단계 : stream open 
			fis = new FileInputStream("iotest/Koala.jpg"); // 컴파일시점의 예외가 뜨므로 예외처리해줘야함. 
			fos = new FileOutputStream("iotest/Koala2.jpg"); // 근데 finder에서 확인해보니 제대로 복사 안되고 0kb임. FileOutputStream은 파일이 있건없건 빈 파일을 새로 만들기때문. 그래서 FileOutputStream은 조심해야한다. 엇!하면 파일정보가 사라진다. 
			
			long start = System.currentTimeMillis();
			
			//2단계 : 작업수행(read, write)
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}
			long end = System.currentTimeMillis();
			System.out.println("복사가 완료되었습니다. ");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초"); // 생각보다 오래걸린다. 왜? 바이트를 하나하나씩 읽어들여서. 그래서 우리는 중간매체로 버퍼를 쓴다. 바이트 몇개를 한번에 싸서 보내기. 그게 바로 Filter Stream (BufferedInputStream, BufferedOutputStream). 
		} catch(Exception e) {
			e.printStackTrace();
		} finally {// 예외가 있건없건 닫아줘야하기때문에 close는 finally에서 수행해준다.
			//3단계 : stream close
			try {
				if(fis != null) { // null일경우는 if문으로 잡아줄 수 있기때문에 굳이 try catch로 잡지않는다. 
					fis.close(); // 에러난다. 왜? fis, fos 변수를 try 블록에서 만들어줘서, try블록이 끝나면 사라짐. 					
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			if(fos != null) {
				try {
					fos.close(); // 그래서 두 변수를 try문 밖에서 미리 선언을 해도 에러가 난다. 왜? 또 에러가 날 수 있기때문에. 그렇다고해서 또 try문으로 모두 묶진 말아라. 왜? 두개를 한 try블록으로 묶으면 만약 fis.close()에서 예외안나고 fos에서 예외나면 fis는 수행이 안되니까. 그래서 두 변수 모두 각각 try문으로묶어준다.
				} catch(Exception e) {
					e.printStackTrace();
				}				
			}
			}
	}
}
