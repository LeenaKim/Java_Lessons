package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMain01 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 1단계 : JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1단계 드라이버 로딩...");
			
			// 2단계 : DriverManager를 이용한 DB 접속, Connection 객체 얻기 
			String url 		= "jdbc:oracle:thin:@172.16.88.129:1521:xe";
			String user 	= "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("2단계 conn : " + conn);
			
			// 3단계 : sql문 작성  (Statement)
			stmt = conn.createStatement(); //내가 연결한 연결객체로 새로운 statement객체를 얻어오고싶어 !
			String sql = "insert into D_TEST(ID, NAME) values('kim', '김길동')";
			
			// 4단계 : sql 실행 및 결과 도출
			int cnt = stmt.executeUpdate(sql); // insert는 테이블을 업데이트하는것이므로 executeUpdate메소드다.리턴값으로는 수정, 삭제한 행의 개수가 나온다. 
			System.out.println("총 " + cnt + "개 행 삽입...");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// statement -> connection 순서로 닫아주는게 안정적이다.
			// 5단계 : 접속 종료
			if(stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
