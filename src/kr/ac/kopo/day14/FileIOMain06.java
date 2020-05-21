package kr.ac.kopo.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import kr.ac.kopo.util.FileClose;

public class FileIOMain06 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/FileIOMain03.java.txt");
			
			br = new BufferedReader(fr); // 필터클래스를 붙여준다. 
			bw = new BufferedWriter(fw);
			
			pw = new PrintWriter(fw);
			
			while(true) {
				String str = br.readLine(); 
				if(str == null) break;
				pw.println(str); // 아예 엔터를 포함하여 write하는 메소드 
			}
			bw.flush();
			
			/*
			while(true) {
				String str = br.readLine(); // readLine() : 한줄씩 읽어온다. 하지만, readLine엔 \n이 포함되있지않아서 \n도 같이 써줘야한다.
				if(str == null) break;
				bw.write(str);
//				bw.write('\n'); // 실제 파일에서 줄이 끝날때마다 줄바꿈을 해준다. 
				bw.newLine(); // 하지만 \n은 os마다 필요할수도 아닐수도 있다. 이를 위해 jvm이 알아서 형식에 상관없이 줄을 바꿔주는것이 newLine()이다. 
			}
			bw.flush();
			*/
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			//< 2 >
			FileClose.close(br, bw);
			FileClose.close(fr, fw);
			FileClose.close(pw);
			
			/* < 1 >
			FileClose.close(br);
			FileClose.close(bw);
			FileClose.close(fr);
			FileClose.close(fw);
			*/
		}
	}
}
