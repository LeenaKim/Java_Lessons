package kr.ac.kopo.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.Writer;

// 파일 객체들을 close하는게 목적인 메소드를 만든다. 
public class FileClose {

	// 모든 buffered 클래스는 reader과 writer클래스를 상속받는다. 
	// => 매개변수를 다 reader과 writer 클래스로 받아야 FileReader이 오든, BufferedReader가 오던 묵시적 형변환이 되서 알아서 오버라이드되서 자식들이 구현된 close()메소드를 호출할것이다. 
	public static void close(Reader r) {
		if(r != null) {
			try {
				r.close();				
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Writer w) {
		if(w != null) {
			try {
				w.close();				
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public static void close(FileInputStream fis) {
		if(fis != null) {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(FileOutputStream fos) {
		if(fos != null) {
			try {
				fos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ObjectInputStream ois) {
		if(ois != null) {
			try {
				ois.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ObjectOutputStream oos) {
		if(oos != null) {
			try {
				oos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	// close할 경우들로 다시 오버로드하면 더 간결히 표현할 수 있다. 
	public static void close(Reader br, Reader r) {
		close(br); // 여기서의 close는 위의 close() 메소드다. 메소드 오버로드한것. 
		close(r);
	}
	
	public static void close(Writer bw, Writer w) {
		close(bw);
		close(w);
	}
	
	public static void close(Reader r, Writer w) {
		close(r);
		close(w);
	}
	
	public static void close(FileInputStream fis, FileOutputStream fos) {
		close(fis);
		close(fos);
	}
	
	public static void close(ObjectInputStream ois, ObjectOutputStream oos) {
		close(ois);
		close(oos);
	}
}
