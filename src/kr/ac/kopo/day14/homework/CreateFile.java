package kr.ac.kopo.day14.homework;

import java.io.File;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class CreateFile extends FileManager implements Inputable {
	
	@Override
	public String input(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
	
	
	public void create() {
		File newFolder = new File(getMainDir() + "/" + input("생성할 폴더 이름 입력 : "));
		boolean check = newFolder.mkdir();
		System.out.println(check ? "폴더가 생겼습니다. " : "폴더 생성에 실패했습니다. ");
		
	}
	
	

}
