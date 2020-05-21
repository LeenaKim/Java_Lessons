package kr.ac.kopo.day14.homework;

import java.io.File;

public class DeleteFile extends FileManager implements Inputable {

	@Override
	public String input(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
	
	public void delete() {
		File file = new File(getMainDir() + "/" + input("삭제할 파일 이름을 입력하십시오 : "));
		boolean check = file.delete();
		System.out.println(check ? "삭제되었습니다. " : "삭제를 실패했습니다. ");
	}

}
