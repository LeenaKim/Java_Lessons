package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

/*
 * D_TEST에서 오름차순 기준(id) 첫번째 사용자를 조회 
 */
public class SelectMain03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuffer sb = new StringBuffer(); // String str 로 계속 +연산으로 붙이는것보다 속도가 더 빠른 StringBuffer나 StringBuilder(동기화가 되기때문에 웹에서 많이씀)를 쓴다.
			
			sb.append("SELECT AVG(E.SALARY) AS SALARY, J.JOB_TITLE ");
			sb.append("FROM (SELECT * FROM EMPLOYEES WHERE SALARY >= ?) E, JOBS J ");
			sb.append("WHERE E.JOB_ID = J.JOB_ID ");
			sb.append("GROUP BY J.JOB_TITLE ");
			sb.append("ORDER BY SALARY ");
			
			String sql = sb.toString(); // sb 문자열들은 String이 아니라 StringBuffer이기 때문에 toString으로 형변환한다. 
			
			pstmt = conn.prepareStatement(sql);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("급여를 입력하세요. ");
			int level = sc.nextInt();
			sc.nextLine();
			
			pstmt.setInt(1, level);
			
			
			ResultSet rs = pstmt.executeQuery();
			
			int cnt = 0;
			
			while(rs.next()) {
				int salary = rs.getInt("SALARY");
				String jobTitle = rs.getString("JOB_TITLE");
				
				System.out.println("job title : " + jobTitle +", average salary : " + salary );
				cnt++;
			} 
			System.out.println(cnt + "개의 행이 검색되었습니다. ");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
	}
}
