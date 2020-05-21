package kr.ac.kopo.day15;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.FileClose;

public class FileIOMain10 {

	public static void write() {
		
		List<UserVO> list = new ArrayList<>();
		
		list.add(new UserVO("홍길동", 25, "010-1111-2222", "서울시 서초구"));
		list.add(new UserVO("윤길동", 30, "010-3333-4444", "서울시 은평구"));
		list.add(new UserVO("강길동", 33, "010-5555-6666", "부천시 원미구"));
		list.add(new UserVO("최길동", 45, "010-7777-8888", "경기도 광명시"));
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/object_user2.txt");
			oos = new ObjectOutputStream(fos); 
			
			for(UserVO user : list) {
				oos.writeObject(user);
			}
			
			System.out.println("저장완료... ");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos);
			FileClose.close(oos);
		}

		
	}
	
	public static void read() {
		
		List<UserVO> list = new ArrayList<>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/object_user2.txt");
			ois = new ObjectInputStream(fis);
			/* < 내가짠코드 >
			List<UserVO> list = (List<UserVO>)ois.readObject();  
			System.out.println("로드 완료..."); 
			System.out.println(list);
			*/
			// < 교수님이 짠 코드 >
			try {					
				while(true) {
					UserVO user = (UserVO)ois.readObject();
					list.add(user);
				} 
			} catch(EOFException e) {
				
			}
			
			
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
