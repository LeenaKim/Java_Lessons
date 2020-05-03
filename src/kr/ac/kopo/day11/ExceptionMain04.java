package kr.ac.kopo.day11;
import java.io.FileNotFoundException;
// 컴파일시점의 예외(Checked Exception) 
import java.io.FileReader;

public class ExceptionMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main start... ");
		
		try {
			FileReader fr = new FileReader("aaa.txt");// 파일이 없을경우 FileNotFoundException이 발생. => ExceptionMain 01 ~ 03에 나왔던 예외와 달리, 컴파일시점의 예외이다. (Checked Exception) - try catch로 처리 안해주면 무조건 예외가 나타난다. 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("예외발생 유무에 상관없이 무조건 실행");
		}
	
		System.out.println("main end... ");
	}

}
