package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

/*
 * D_TEST에서 오름차순 기준(id) 첫번째 사용자를 조회 
 */
public class SelectMain02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuffer sb = new StringBuffer(); // String str 로 계속 +연산으로 붙이는것보다 속도가 더 빠른 StringBuffer나 StringBuilder(동기화가 되기때문에 웹에서 많이씀)를 쓴다.
			
			sb.append("select ID, NAME ");
			sb.append(" from ( select * ");
			sb.append("	   		from D_TEST ");
			sb.append("	   		order by id asc ");
			sb.append("		 )");
			sb.append(" where rownum = 1 ");
			
			String sql = sb.toString(); // sb 문자열들은 String이 아니라 StringBuffer이기 때문에 toString으로 형변환한다. 
			
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				
				System.out.println("id : " + id +", name : " + name );
			} else {
				System.out.println("등록된 ID가 없습니다. ");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
	}
}
