package kr.ac.kopo.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

public class FileIOMain08 {

	
	public static void write() {
		UserInfo user = new UserInfo("홍길동", 25, "경기도 광명시");
		System.out.println(user);
		// 나는 이렇게 받은 유저 정보를 파일로 저장하고싶다. 문자로 입력되었으니 문자열 스트림을 사용한다. 
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("iotest/userInfo.txt");
			bw = new BufferedWriter(fw);
			
			/*
			// bw.write(toString(user)) 해도 되지만 나는 이름, 나이, 주소만 보고싶으니 게터 메소드로 원하는 정보만 write한다. 
			bw.write(user.getName());
			bw.write(user.getAge());
			bw.write(user.getAddr());
			// 하지만 문제는 age의 경우 문자로 입력되어서 숫자를 문자로 변환해서 로드된다.
			// 그럼 내가 어디까지가 문자고 어디까지가 숫자인지 알고있나? 아니다. 왜? 이름이 두글자일수도 있으니까. 
			// 그럼 구분자를 내가 따로 만들자. 공백은 어떤가? 안된다. 왜? 주소에 공백이 들어갈수도 있으니까.
			// 그럼 우린 : 로 구분해보자. 
			*/
			
			bw.write(user.getName() + ":" + user.getAge() + ":" + user.getAddr());
			bw.newLine(); // 엔터 입력 
			bw.flush();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bw, fw);
		}
	}
	
	public static void read() {
		
		UserInfo user = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("iotest/userInfo.txt");
			br = new BufferedReader(fr);
			
			String data = br.readLine(); // 유저 정보가 한줄씩 입력되있으니 한줄씩 읽어온다. 
			String[] dataArr = data.split(":"); // 콜론으로 구분되있으니 콜론으로 잘라준다.
			
//			System.out.println(Arrays.toString(dataArr));
			
			String name = dataArr[0];
			int age = Integer.parseInt(dataArr[1]);
			String addr = dataArr[2];
			user = new UserInfo(name, age, addr);
			
			System.out.println("userInfo.txt 로드 완료...");
			
			System.out.println(user);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fr, br);
		}
	}
	
	public static void main(String[] args) {
		
		// write();
		read();
		
	}
}
