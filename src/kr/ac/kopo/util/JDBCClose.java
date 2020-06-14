package kr.ac.kopo.util;
// 후에 jar파일로 묶어서 buildpath만 해주면 내가 원하는 프로젝트에 계속 넣어 쓸 수 있다. 
import java.sql.Connection;
import java.sql.Statement;

public class JDBCClose {
	
	public static void close(Connection conn, Statement stmt) { // prepared일수도, statement 일수도있으니 묵시적형변환으로 알아서 바뀌게 부모클래스인 statement로 매개변수를 지정한다. 
		
		if(stmt != null) {
			try {
				stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		if(conn != null) {
			try {
				conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
