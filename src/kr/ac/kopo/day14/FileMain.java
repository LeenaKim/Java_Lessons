package kr.ac.kopo.day14;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		
		File dirObj = new File("iotest");
		
		boolean bool = dirObj.exists();
		System.out.println(bool ? "유효한 디렉토리입니다." : "유효하지 않은 디렉토리입니다.");
		
		String[] list = dirObj.list(); // 해당 디렉토리에 있는 다른 모든 파일들 불러오기 
		System.out.println("-------------------------");
		System.out.println("\t" + dirObj.getName() + "디렉토리 정보");
		System.out.println("-------------------------");
		for(String element : list) {
			System.out.println(element);
		}
		System.out.println("-------------------------");
		
		File newDirObj = new File("iotest/하마");
		System.out.println(newDirObj.mkdir() ? "dir 생성 성공" : "dir 생성 실패"); // 해당 디렉토리가 생성되었으면 T, 안됬으면 F 반환 
			// 생성됬다고 나오지만 이클립스의 패키지 익스플로러는 실시간 연동이 아니라서 변경 결과를 보려면 새로고침해줘야함.
			// 처음 만들때만 생성하기때문에 이미 만들고 다시 mkdir를 수행하면 실패라 나온다. 
		
		newDirObj = new File("iotest/새폴더/오리");
		System.out.println(newDirObj.mkdir() ? "dir 생성 성공" : "dir 생성 실패"); 
			// 처음 실행했을때도 실패. 왜? iotest 밑에 새폴더라는 폴더가 없기때문에 오리를 만들수 없다. 
		
		newDirObj = new File("iotest/새폴더/오리");
		System.out.println(newDirObj.mkdirs() ? "dir 생성 성공" : "dir 생성 실패"); // mkdir's'()는 중간경로의 없는 폴더도 만든다. 
		
		newDirObj = new File("iotest/새폴더");
		bool = newDirObj.delete();
		System.out.println(bool ? "삭제성공" : "삭제실패"); // 새폴더 밑에 오리만 지워짐. 단위는 항상 Child 기준이어서. 즉, 자식 파일. But, 폴더를 삭제할경우 빈폴더만 지울수있다. 
		
		/*
		File fileObj = new File("iotest/aaa.txt"); // 파일 경로를 지정해주지않고 그냥 할시 디폴트는 해당 프로젝트의 최상위 폴더에서 찾는다. 
//		File fileObj = new File("/Users/linakim/eclipse-workspace/PolitecJava/iotest\aaa.txt");    
		
		String name = fileObj.getName();

		System.out.println("파일명 : " + name); 
		System.out.println("parent : " + fileObj.getParent());
		System.out.println("path : " + fileObj.getPath());
		System.out.println("Ab Path : " + fileObj.getAbsolutePath());
		
		boolean bool = fileObj.isFile(); // 파일이거나 디렉토리거나 둘중하나이기때문에
		System.out.println(bool ? "파일입니다" : "디렉토리입니다"); // 디렉토리라 나옴. 
		
		bool = fileObj.isDirectory();
		System.out.println(bool ? "디렉토리입니다" : "파일입니다"); // 파일이라나옴. 왜? aaa파일은 실제로 없으니까. 파일이 실제로 없으면 isDirectory, isFile 메소드는 모두 false 값을 반환.
		
		bool = fileObj.exists();
		System.out.println(name + (bool ? " 존재합니다. " : " 존재하지 않습니다. ")); // 존재하지 않습니다. 
		
		long length = fileObj.length(); // 파일의 크기를 보여줌. 리턴타입은 long 
		System.out.println("파일 크기 : " + length +"byte(s)");
		
		long lastTime = fileObj.lastModified(); // 파일의 마지막 수정날짜 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("마지막 수정시간 : " + sdf.format(new Date(lastTime))); // simpleDateFormat의 format 메소드는 Date형이여야하므로 new Date를 통해 lastTime을 Date형으로 바꿔준다.
		
		bool = fileObj.canWrite(); // 파일이 쓸수있니? 
		System.out.println(bool ? "쓰기 가능" : "쓰기 불가능"); // finder에서 정보보기에서 읽기 전용으로 만들어주면 쓰기 불가능으로 나옴. 
		
		bool = fileObj.canRead(); //파일 읽을수있니?
		System.out.println(bool ? "읽기 가능" : "읽기 불가능");
		*/
		
	}
}
