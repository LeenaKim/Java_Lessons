package kr.ac.kopo.day15.homework.board;

public class Delete extends PostChange {

	@Override
	public void howToChange() {
		super.howToChange();
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1 : 
			delByPostNum(Integer.parseInt(scanStr("글 번호를 입력해주세요. ")));
			break;
		case 2 : 
			delByPostNum(changeByTitle(scanStr("글 제목을 입력해주세요. ")));
			break;
		case 3 : 
			delByPostNum(changeByAuthor(scanStr("글쓴이를 입력해주세요. ")));
			break;
		}
	}
	
	public void delByPostNum(int postNum) {
		if(Board.getTitle()[postNum-1] != null) {
			for(int i = postNum-1; i < Board.getNumOfPosts(); i++) {
				Board.setTitle(Board.getTitle()[i+1], i);
				Board.setAuthor(Board.getAuthor()[i+1], i);
				Board.setDate(Board.getDate()[i+1], i);
			}
			System.out.println("게시글이 삭제되었습니다. ");
			Board.setNumOfPosts(Board.getNumOfPosts()-1);			
		} else {
			System.out.println("해당 게시글이 없습니다. ");
		}
	}
	
	@Override
	public int changeByTitle(String title) {
		return super.changeByTitle(title);
	}
	
	@Override
	public int changeByAuthor(String author) {
		return super.changeByAuthor(author);
	}
}
