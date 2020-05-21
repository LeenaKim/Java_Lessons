package kr.ac.kopo.day15.homework.board;
// 글 생성 클래스 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NewPost extends Board {
	// Board를 상속해주지않으면 Board의 생성자가 작동을 하지 않아 setTitle을 해주는 과정에서 NullPointerException 발생 
	protected Scanner sc;
	
	NewPost() {
		sc = new Scanner(System.in);
	}
	// 메세지 출력과 함께 입력값을 받는 메소드 
	public String scanStr(String msg) {
		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}
	// 오늘 날짜를 출력하는 메소드 
	public static String today() {
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		return sdf.format(new Date());
	}
	// 새로운 글을 등록하는 메소드 
	public void post() {
		String title = scanStr("등록할 제목을 입력 : ");
		String author = scanStr("등록할 글쓴이를 입력 : ");
		
		Board.setTitle(title, Board.getNumOfPosts()); // 입력받은대로 저장해준다. 
		Board.setAuthor(author, Board.getNumOfPosts());
		Board.setDate(today(), Board.getNumOfPosts());			
		
		Board.setNumOfPosts(Board.getNumOfPosts()+1);
		System.out.println("게시글이 등록되었습니다. ");
	}
}
