package kr.ac.kopo.day14.homework;

import java.util.Scanner;

public class Operator {

	private Scanner sc;
//	private View view = new View();
	public static FileManager fm = null;
	private CreateFile create = new CreateFile();
	private EditName edit = new EditName();
	private DeleteFile del = new DeleteFile();
	private Move mov = new Move();
	
	Operator() {
		sc = new Scanner(System.in);
	}
	public void execute() {
		
		fm = new FileManager();
		
		while(true) {
			
			
			View view = new View();
			view.init();
			System.out.println("[C]파일 및 폴더 생성 \t [R]이름 수정 \t [D]삭제 [.]상위폴더이동 \t [m]하위폴더이동 \t [q]종료 ");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("c")) {
				create.create();
			} else if(choice.equalsIgnoreCase("r")) {
				edit.edit();
			} else if(choice.equalsIgnoreCase("d")) {
				del.delete();
			} else if(choice.equals(".")) {
				mov.moveUp();
			} else if(choice.equalsIgnoreCase("m")) {
				mov.moveDown();
			} else if(choice.equalsIgnoreCase("q")) {
				System.exit(0);
			}
		}
	}
}
