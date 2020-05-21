package kr.ac.kopo.day15.homework.board;

import java.util.Scanner;

public class BoardOperation {

	private Scanner sc;
	View view = new View();
	NewPost newPost = new NewPost();
	Edit edit = new Edit();
	Delete del = new Delete();
	
	BoardOperation() {
		sc = new Scanner(System.in);
	}
	
	public void start() {
		
		while(true) {
			
			System.out.println("<< POLITEC 데이터분석과 게시판 >>");
			System.out.println("1. 전체 게시물 조회 ");
			System.out.println("2. 글 번호로 조회 ");
			System.out.println("3. 글 등록 ");
			System.out.println("4. 글 수정 ");
			System.out.println("5. 글 삭제 ");
			System.out.println("0. 종료 ");
			
			int choice = Integer.parseInt(sc.nextLine());
			
			// Board board = null;
			// 각 case마다 자식클래스 값으로 묵시적 형변환해준 후 자식클래스의 메소드를 쓰기 위해 명시적 형변환을 해주었더니 새로운 기능을 넘어갈때마다 객체의 형이 부모가 아니라 자식으로 바뀌면서 부모클래스의 static 값이 무의미해졌다. 
			switch(choice) {
			case 1 : 
				view.viewAll();
				break;
			case 2 : 
				System.out.println("글 번호를 입력해주세요. ");
				int postNum = Integer.parseInt(sc.nextLine());
				view.viewByPostNum(postNum);
				break;
			case 3 : 
				newPost.post();
				break;
			case 4 : 
				edit.howToChange();
				break;
			case 5 :
				del.howToChange();
				break;
			case 0 :
				System.exit(0);
			}
		}
		
	}
}
