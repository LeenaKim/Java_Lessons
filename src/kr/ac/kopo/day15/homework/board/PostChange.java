package kr.ac.kopo.day15.homework.board;

import java.util.Scanner;

public class PostChange extends Board {

	protected Scanner sc;
	View view = new View();
	
	PostChange() {
		sc = new Scanner(System.in);
	}
	
	public String scanStr(String msg) {
		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}
	
	public void howToChange() {
		System.out.println("어떻게 글을 수정/삭제 하시겠습니까? ");
		System.out.println("1. 글 번호로 수정/삭제");
		System.out.println("2. 글 제목으로 수정/삭제");
		System.out.println("3. 글쓴이로 수정/삭제");
	}
	
	public int changeByTitle(String title) {
		int idx = 0;
		for(int i = 0; i < Board.getNumOfPosts(); i++) {
			if(Board.getTitle()[i].equals(title)) {
				view.viewByPostNum(i+1);
				if(scanStr("수정/삭제하려는 글이 이 글이 맞습니까? y/n").equals("y")) {
					idx = i;					
					break;
				} 
			} else if(i == Board.getNumOfPosts()-1) {
				System.out.println("해당되는 글이 없습니다. 다시 선택해주세요. ");
				howToChange();
			}
		}
		return idx+1;
	}
	
	public int changeByAuthor (String author) {
		int idx = 0;
		for(int i = 0; i < Board.getNumOfPosts(); i++) {
			if(Board.getAuthor()[i].equals(author)) {
				view.viewByPostNum(i+1);
				if(scanStr("수정/삭제하려는 글이 이 글이 맞습니까? y/n").equals("y")) {
					idx = i;
					break;					
				}
			} else if(i == Board.getNumOfPosts()-1) {
				System.out.println("해당되는 글이 없습니다. 다시 선택해주세요. ");
				howToChange();
			}
		}
		return idx+1;
	}
}
