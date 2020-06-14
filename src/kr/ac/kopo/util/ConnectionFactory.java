package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;

// connection을 만들어주는 공장 
public class ConnectionFactory {
/*	 // 내가 오라클과 mysql 등 여러개의 db에 접속할때. 
	public Connection getConnection(String url, String user, String password) {
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, user, password);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
*/
	public Connection getConnection() {
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			String url = "jdbc:oracle:thin:@172.16.88.129:1521:xe";
			String user = "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url, user, password);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
