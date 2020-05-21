package kr.ac.kopo.day14.homework;

import java.io.File;

public class Move extends FileManager implements Inputable {

	
	@Override
	public String input(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
	
	/*
	 * To. 교수님,
	 * 새로운 경로로 MainDir를 설정할때 full path를 넘겨주지 않고 파일을 넘겨주다보니 작동이 안되는것같고,
	 * 또 full path를 넘겨주려 FileManager에 String형만 받는 생성자를 만들었는데 자식클래스인 move에서 작동하질 않습니다.
	 * 해결방법을 알려주시면 감사하겠습니다 ㅜㅜ 
	 */
	public void moveUp() {
//		File file = new File(getMainDir().getParent());
//		setMainDir(file);
		Operator.fm = new FileManager(getMainDir().getParentFile().getAbsolutePath());
		System.out.println(Operator.fm.getMainDir().getName());
	}
	
	public void moveDown() {
		File file = new File(getMainDir() + "/" + input("이동할 폴더 이름 : "));
		setMainDir(file);
		//fm = new FileManager(getMainDir().)
	}

}
