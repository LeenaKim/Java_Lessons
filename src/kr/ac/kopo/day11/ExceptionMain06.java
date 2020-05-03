package kr.ac.kopo.day11;
import java.io.FileNotFoundException;
// 간접 예외처리 - 예외를 모두 Main함수로 던져 jvm이 처리하도록 한다. 
import java.io.FileReader;

public class ExceptionMain06 {

	static void a() throws NullPointerException {
		
		String str = "hello";
		
		try {
			String str2 = null;
			System.out.println(str2.substring(2)); // NullPointerException 발생 
			System.out.println("3번째 문자 : " + str.charAt(2));
			System.out.println("5번째 문자 : " + str.charAt(5)); // StringIndexOutOfBoundsException 발생 
			
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("예외발생..." + e.getMessage());
			e.printStackTrace();
		}
	}
	
	static void b() throws 
	FileNotFoundException { // Exception으로 묵시적 형변환해서 던져도 되고, FileNotException으로 구체적으로 써줘도 된다. JVM 니가 처리해! 
		FileReader fr = new FileReader("a.txt"); // checked exception : FileReader 클래스의 생성자 메소드에도 예외처리를 사용자인 나에게 던지는(throws) 기능이 있어서 컴파일시부터 예외가 표시되는 것이다. 
	}
	
	public static void main(String[] args) {
		// a가 있던 없던간에 b도 호출하고싶으면 try catch가 따로 따로 있어야 한다. 
		System.out.println("main start... ");
		try {
			a();
		}  catch(NullPointerException ne) {
			System.out.println("main 예외발생..."+ ne.getMessage());
		}
		
		try {
			b();			
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		System.out.println("main end... ");

	}

}
