package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1단계 : 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계 : db 접속
			String url 		= "jdbc:oracle:thin:@172.16.88.129:1521:xe";
			String user 	= "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3단계 : preparedStatement SQL 작성 
			// prepared statement 객체 : statement 클래스를 상속받은 객체. 
			// 수행할 쿼리를 conn.preparedStatement에 미리 만들어놓는다. 
			
			System.out.print("등록할 ID를 입력하세요 : ");
			String id = sc.nextLine();
			System.out.println("등록할 이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			String sql = "insert into D_TEST(ID, NAME)";
				   sql += " values(?, ?)"; // 아직 이 자리에 뭐가 들어올지 모를때 ?를 써준다. 뭐가들어갈진 모르지만 쿼리는 준비해둔다. 
			pstmt = conn.prepareStatement(sql);
			// prepared를 쓰는 가장 큰 이유 : 문자열을 넣을때 ''를 넣기가 너무 귀찮아서 내가 문자형을 넣으면 알아서 따옴표 넣어서 저장해주기 위해. 
			pstmt.setString(1, id); // 첫번째 물음표 
			pstmt.setString(2, name); // 두번째 물음표 
				   
			// 4단계 : sql문 실행 및 결과도출
			int cnt = pstmt.executeUpdate();
			System.out.println("총 " + cnt + "개 행 삽입 ");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계 
			if(pstmt != null) {
				try {
					pstmt.close();
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
