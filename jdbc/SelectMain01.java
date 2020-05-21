package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class SelectMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			/*
			 * ConnectionFactory factory = new ConnectionFactory();
			 * conn = factory.getConnection();
			 * 과 다른점은, 2번째거는 factory라는 인스턴스변수(객체)를 세웠기때문에 
			 * 클래스 내에서 또 connection 변수를 호출할때 용이하다. 
			 * 이 아이의 factory는 try catch 블록이 끝나면 gc가 수거해가고,
			 * 위의 방법은 저 수행이 끝나면 gc가 수거해간다. 
			 */
			String sql = "select * from D_TEST";
			
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); // 반환형이 resultSet형 
			
			while(rs.next()) { // boolean 반환. 다음 레코드가 있으면 T, 레코드의 끝에 도달하면 없으니 F 반환 
				String id = rs.getString("ID");
				String name = rs.getString(2); // rs값을 프린트해봤자 toString 오버라이드를 안했기때문에 주소값이 반환됨.
				System.out.println("id : " + id + ", name : " + name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
}
