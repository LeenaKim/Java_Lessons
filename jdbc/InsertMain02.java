package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 1단계 : 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계 : db 접속
			String url 		= "jdbc:oracle:thin:@172.16.88.129:1521:xe";
			String user 	= "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3단계 : 쿼리실행 
			stmt = conn.createStatement();
			
			System.out.print("등록할 ID를 입력하세요 : ");
			String id = sc.nextLine();
			System.out.println("등록할 이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			String sql  = "insert into D_TEST(ID, NAME)";
				   sql += " values(\'" + id + "\', \'" + name + "\')"; // += 연산자로 이어줄경우 values 앞에 띄어쓰기가 안되서 위험하다. 지금의 경우 (id, name)을 해줘서 구분됬지만 select같은걸 실행시 칼럼명으로 인식하게된다. 그래서 ' 'values 이렇게 앞에 들여쓰기 해줘야한다.  
				   // sql에서는 따옴표로 문자형을 구분하기때문에 작은따옴표 붙여야함에 유의 
			// 4단계 
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 "+ cnt + "개 행이 삽입...");
				   
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
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
