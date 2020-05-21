package kr.ac.kopo.day15.homework.board;
/**
 * 3. 게시판 관리 프로그램 (배열 작성)
 --------------------------------------------------
1. 전체게시물 조회   
2. 글번호 조회   
3. 글등록   
4. 글수정   
5. 글삭제   
0. 종료     
--------------------------------------------------
메뉴 중 처리할 항목을 선택하세요 : 3
   등록할 제목을 입력 : 하하하....
   등록할 글쓴이를 입력 : 닌자
   게시글이 등록되었습니다
 --------------------------------------------------
1. 전체게시물 조회   
2. 글번호 조회   
3. 글등록   
4. 글수정   
5. 글삭제   
0. 종료     
--------------------------------------------------
메뉴 중 처리할 항목을 선택하세요 : 1
   < 전체 게시글 조회 >
  번호     제목     글쓴이    등록일
   1       하하하    닌자      2020-04-28

메뉴 중 처리할 항목을 선택하세요 : 0
게시판 프로그램을 종료합니다.
 * @author Lina
 *
 */
public class Board {

	private static String[] title;
	private static String[] author;
	private static String[] date;
	private static int numOfPosts;
	
	Board() {
		numOfPosts = 0;
		title = new String[100];
		author = new String[100];
		date = new String[100];
		// 배열의 길이를 새로운 게시글이 작성된 횟수로 계속해서 바꿔주는 방법을 고려했었지만, 길이를 다시 세워주면 String 변수가 새로운 공간을 만들어 이전의 게시글 기록을 찾지 못한다. NullPointerException 발생.  
		// 임의의 길이 100으로 설정해줬다. 
	}
	public static String[] getTitle() {
		return title;
	}
	public static void setTitle(String title, int idx) {
		Board.title[idx] = title;
	}
	public static String[] getAuthor() {
		return author;
	}
	public static void setAuthor(String author, int idx) {
		Board.author[idx] = author;
	}
	public static String[] getDate() {
		return date;
	}
	public static void setDate(String date, int idx) {
		Board.date[idx] = date;
	}
	public static int getNumOfPosts() {
		return numOfPosts;
	}
	public static void setNumOfPosts(int numOfPosts) {
		Board.numOfPosts = numOfPosts;
	}
	
	
	
}
