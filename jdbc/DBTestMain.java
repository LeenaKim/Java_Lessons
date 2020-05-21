package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {
		
		
		// 1단계 : JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // classNotFoundException이 나오니까 예외처리해줘야함. 			
			System.out.println("드라이버 로딩 성공...");
			
			// 2단계 : DriverManager - db와 연결 
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@172.16.88.129:1521:xe", 
					"hr", 
					"hr"); // @localhost:1521(포트번호):xe(시드이름) : 내 컴퓨터에 깔린 오라클에 접속할때 
			
			System.out.println("DB 접속 성공! " + conn);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
