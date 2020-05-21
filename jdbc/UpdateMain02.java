package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

/*
 * id를 입력하세요 : lee
 * 변경할 이름을 입력하세요 : 이길동
 * 1개의 행이 변경되었습니다.
 * 
 */
public class UpdateMain02 {
   
   public static void main(String[] args) throws Exception {
      
      Connection conn = null;
      PreparedStatement pstmt = null;
      
      try {
         //1단계 : 드라이버 로딩
    	 ConnectionFactory factory = new ConnectionFactory();
         conn = factory.getConnection();
         
         //3단계 : 쿼리 작성
         Scanner sc = new Scanner(System.in);
         
         System.out.print("아이디를 입력하세요 : ");
         String id = sc.nextLine();
         
         System.out.print("변경할 이름을 입력하세요 : ");
         String name = sc.nextLine();
         
         String sql = "update D_TEST ";
               sql += " set name = ? ";
               sql += " where id = ? ";
               
         pstmt = conn.prepareStatement(sql);
         
         pstmt.setString(1, name);
         pstmt.setString(2, id);
         
         //4단계 : sql 실행, 실행 결과 받기
         int cnt = pstmt.executeUpdate();
         System.out.println("총 "+ cnt +"개 행이 수정되었습니다.");
         
         
         sc.close();
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         
         //5단계 : 접속 해제
         JDBCClose.close(conn, pstmt);
         
      }

      
      
   }

}