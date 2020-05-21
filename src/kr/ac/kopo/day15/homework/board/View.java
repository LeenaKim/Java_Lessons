package kr.ac.kopo.day15.homework.board;
// 게시글 조회 클래스 
public class View extends Board {

	View(){}
	// 전체 게시글 조회 
	public void viewAll() {
		
		System.out.println("< 전체 게시글 조회 >");
		System.out.println("번호\t\t제목\t\t글쓴이\t\t등록일");
		for(int i = 1; i <= Board.getNumOfPosts(); i++) {
			viewByPostNum(i); // 전체 조회시 글 번호 조회 메소드로 넘어가 모든 글을 반복문을 통해 출력한다. 
		}			
		
	}
	// 글 번호로 조회 
	public void viewByPostNum(int postNum) {
		if(Board.getTitle()[postNum-1] != null) { // 해당 글 번호를 인덱스로 바꾸어 글 제목, 글 저자, 날짜를 출력한다. 
			System.out.println(postNum + "\t\t" + (Board.getTitle())[postNum-1] 
					+ "\t\t" + (Board.getAuthor())[postNum-1] + "\t\t" + (Board.getDate())[postNum-1]);						
		} else {
			System.out.println("해당 게시글이 없습니다. ");
		}
		 
		
	}
}
