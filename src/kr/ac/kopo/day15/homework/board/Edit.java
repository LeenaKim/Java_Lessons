package kr.ac.kopo.day15.homework.board;
// 글 수정 클래스 
public class Edit extends PostChange {

	// 상위클래스 PostChange를 상속받아 메소드를 오버라이드 한다. 
	@Override
	public void howToChange() {
		super.howToChange();
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1 : 
			editByPostNum(Integer.parseInt(scanStr("글 번호를 입력해주세요. ")));
			break;
		case 2 : 
			editByPostNum(changeByTitle(scanStr("글 제목을 입력해주세요. ")));
			break;
		case 3 : 
			editByPostNum(changeByAuthor(scanStr("글쓴이를 입력해주세요. ")));
			break;
		}
	}
	
	
	@Override
	public int changeByTitle (String title) {
		return super.changeByTitle(title);
	}
	
	@Override
	public int changeByAuthor (String author) {
		return super.changeByAuthor(author);
	}
	
	public void editByPostNum (int postNum) {
		if(Board.getTitle()[postNum-1] != null) { // 배열을 활용했기 때문에 String 배열의 길이를 초기화시켜줘야했다. 
			Board.setTitle(scanStr("수정할 제목을 입력 : "), postNum-1);
			Board.setAuthor(scanStr("수정할 글쓴이를 입력 : "), postNum-1);
			Board.setDate(NewPost.today(), postNum-1);
			System.out.println("게시글이 수정되었습니다. ");			
		} else {
			System.out.println("해당 게시글이 없습니다. ");
		}
	}
	
}
