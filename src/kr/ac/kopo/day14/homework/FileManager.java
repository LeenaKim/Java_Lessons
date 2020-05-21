package kr.ac.kopo.day14.homework;

import java.io.File;

public class FileManager {

	private static File mainDir;
	private static File[] files;
	private static String path;
	
	FileManager() {
		mainDir = new File("iotest");
		mainDir = new File(mainDir.getAbsolutePath());
		files = mainDir.listFiles();
//		path = mainDir.getAbsolutePath();
	}
	
	FileManager(String path) {
		
		mainDir = new File(path);
		files = mainDir.listFiles();
	}
	

	public File getMainDir() {
		return mainDir;
	}

	public void setMainDir(File mainDir) {
		this.mainDir = mainDir;
	}

	public File[] getFiles() {
		return files;
	}

	public void setFiles(File[] files) {
		this.files = files;
	}

	
	
	
	
	
}
