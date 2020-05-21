package kr.ac.kopo.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

/*
 * 콘솔에서 명령어를 입력하여 원본파일을 대상파일에 저장하는 프로그램 
 * $ java	FileIOMain07	aaa.txt		bbb.txt (aaa.txt를 bbb.txt파일에 복사하려한다.)
 */
public class FileIOMain07 {

	public static void main(String[] args) {
		//	args : 이 프로그램을 수행하며 어떤 명령이 들어왔는지 기억하는 녀석 (위의 명령을 String 두 개의 배열로 기억한다.)
		// 위의 도스 명령어에서, 
		// FileIOMain07 : FileIOMain07의 main 메소드를 실행해라.
		// aaa.txt, bbb.txt : main의 매개변수. 
		// 그래서 지금까지 우리가 수행했던 프로그램의 args 길이는 0이었다. 왜? args에 매개변수를 줘서 실행한적이 한번도 없었으니까. 
		System.out.println("args length : "+ args.length);
			// run configuration에 arguments에 a.txt, b.txt를 추가하고 실행했더니 args.length가 2가됨을 확인. 
		
		// args[0]파일을 args[1] 파일로 복사하려니까 args에는 항상 2개가 들어와야함으로 2개 미만으로 들어왔을경우 종료시킨다.
		if(args.length < 2) {
			System.out.println("명령 구문이 잘못되었습니다. ");
			System.out.println("java FileIOMain07 원본파일명 대상파일명");
			System.exit(0);
		}
		
//		System.out.println(Arrays.toString(args));
		
		File oriFile = new File(args[0]); // 0번지에 파일이 없으면 파일 복사를 진행할 필요가 없다. 
		if(!oriFile.exists()) {
			System.out.println("["+ args[0] + "] 파일이 존재하지 않습니다.");
			System.exit(0);
		}
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader(args[0]);
//			fr = new FileReader(oriFile); // 얘도 가능 
			br = new BufferedReader(fr);
			
			fw = new FileWriter(args[1]);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				bw.newLine();
			}
			bw.flush();
			
			System.out.printf("[%s] -> [%s] 복사완료 \n", args[0], args[1]);
		} catch(FileNotFoundException fnfe) { // 얘로 인해서 33 - 36행이 필요없게된다. 
			System.out.println("["+ args[0] + "] 파일이 존재하지 않습니다.");
			System.exit(0);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
			FileClose.close(bw, fw);
		}
	}
}
