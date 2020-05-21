package kr.ac.kopo.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain09 {
/* 이번엔 객체값을 한번에 뽑고싶다 - ObjectOutputStream(필터클래스)
 * writeObject() : 파일 저장 단위를 바이트나 문자가 아니라 object형태로 쓰겠다! 필터클래스라 필터형태로 써야함.
*/
	public static void write() {
		
		UserInfo user = new UserInfo("홍길동", 25, "경기도 광명시");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/object_user.txt");
			oos = new ObjectOutputStream(fos); 
			// 객체직렬화 : 객체가 갖고있는 정보를 바이트스트림에 맞도록 일렬로 줄세우는것. 직렬화를 위해선 UserInfo에서 serializable 인터페이스를 상속받으면 된다. 
			oos.writeObject(user); // 묵시적형변환이 일어남. object -> UserInfo로. 
			
			System.out.println("저장완료... ");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos);
		}
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/object_user.txt");
			ois = new ObjectInputStream(fis);
			
			UserInfo user = (UserInfo)ois.readObject(); // 하나의 객체는 '객체' 자체를 읽고 반환하는데, user는 object의 자식클래스이니 반환된 object형을 자식클래스인 UserInfo로 명시적 형변환을 해줘야한다. 
			System.out.println("로드 완료..."); // UserInfo의 멤버변수 age를 transient를 통해 객체직렬화에서 제외시켜서 age = 0으로 나옴. 
			System.out.println(user);
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fis);
		}
	}
	
	public static void main(String[] args) {
	
//		write();
		read();
	}
}
