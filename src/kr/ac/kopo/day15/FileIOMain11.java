package kr.ac.kopo.day15;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.FileClose;
// ArrayList 클래스를 가보면 Serializable 상속받기때문에 리스트 자체를 직렬화할수있다. 
public class FileIOMain11 {

	public static void write() {
		
		List<UserVO> list = new ArrayList<>();
		
		list.add(new UserVO("홍길동", 25, "010-1111-2222", "서울시 서초구"));
		list.add(new UserVO("윤길동", 30, "010-3333-4444", "서울시 은평구"));
		list.add(new UserVO("강길동", 33, "010-5555-6666", "부천시 원미구"));
		list.add(new UserVO("최길동", 45, "010-7777-8888", "경기도 광명시"));
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/object_userList.txt");
			oos = new ObjectOutputStream(fos); 
			
			
			oos.writeObject(list);
			
			
			System.out.println("저장완료... ");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos);
			FileClose.close(oos);
		}

		
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/object_userList.txt");
			ois = new ObjectInputStream(fis);
			
			List<UserVO> list = (List<UserVO>)ois.readObject();  // 리스트도 직렬화, 리스트 안에 객체들도 직렬화한다.  
			System.out.println("로드 완료..."); 
			
			for(UserVO user : list) {
				System.out.println(user);
			}
		
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fis);
			FileClose.close(ois);
		}
	}
	public static void main(String[] args) {
		
//		write();
		read();
	}
}
