package kr.ac.kopo.day14.homework;

import java.io.File;

public class EditName extends FileManager implements Inputable {

	
	@Override
	public String input(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
	
	public void edit() {
		File curFile = new File(getMainDir() + "/" + input("바꿀 파일의 현재 이름을 입력하세요. "));
		
		if(curFile.exists()) {
			curFile.renameTo(new File(getMainDir() + "/" + input("새로운 이름을 입력하세요. ")));
			System.out.println("변경되었습니다. ");
		} else {
			System.out.println("없는 파일 이름입니다. ");
		}
	}

	
	

}
