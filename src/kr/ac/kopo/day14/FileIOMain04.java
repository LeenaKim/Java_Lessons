package kr.ac.kopo.day14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain04 {

	public static void write() {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("iotest/data_writer.txt");	
			dos = new DataOutputStream(fos);
			
			char c  ='A'; // 한번 write할때 1바이트씩 저장된다. 
//			fos.write(c);
			dos.writeChar(c); // char이니까 2바이트 
			dos.writeInt(125); // int니까 4바이트 => 총 6바이트여야한다. 여기서 생기는 파일은 output으로 write만 해줬기때문에 실제로 열어보면 ascii코드값으로 변환되어 나타난다. 그래서 read작업을 해줘야한다. S
			
			System.out.println("저장 완료... ");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(fos != null) {
				try {
					fos.close();
					
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void read() throws Exception {
	
		FileInputStream fis = new FileInputStream("iotest/data_writer.txt"); // 원래는 FileNotFoundException이 발생하지만 throw해줘서 read를 호출한 main에서 처리해줌. 
		DataInputStream dis = new DataInputStream(fis); // 기본데이터타입으로 올바르게 읽어오고싶다.
		
		// 이런식으로 형에 따라 데이터를 읽어올때는 어디까지는 char이고, 어디까지는 int이고 하는 순서를 명확하게 알고있어야한다. 
		char c = dis.readChar();
		int num = dis.readInt();
		double num2 = dis.readDouble();
		
		System.out.println("읽어온 문자 : " + c);
		System.out.println("읽어온 정수 : " + num);
		System.out.println("읽어온 실수 : " + num2);

		dis.close();
		fis.close();
	}
	
	public static void main(String[] args) {
		
//		write();
		try {
			read();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
