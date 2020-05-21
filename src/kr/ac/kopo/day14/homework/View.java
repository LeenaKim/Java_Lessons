package kr.ac.kopo.day14.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class View extends FileManager {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	
	public void init() {
		// to. 교수님, \t로 자리수 맞추는건 어떻게 해야할지 모르겠습니다... 계속 중구남방입니다 ㅜㅜ 
		System.out.println("=================================================================================================");
		System.out.println("\t" + Operator.fm.getMainDir().getName() + "디렉토리 정보");
		System.out.println("=================================================================================================");
		System.out.println("이름" + " \t\t\t\t" + "종류" + "\t\t" + "크기" + "\t\t" + "날짜");
		System.out.println("=================================================================================================");
		
		for(File f : Operator.fm.getFiles()) {
			System.out.print(f.getName() + "\t\t\t");
			System.out.print(f.isFile() ? "파일" : "디렉토리");
			System.out.print("\t\t");
			System.out.print(f.length() + "bytes \t\t");
			System.out.println(sdf.format(new Date(f.lastModified())));
		}
		
		
		
		
	}
}
