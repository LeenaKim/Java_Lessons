package kr.ac.kopo.day18.homework;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceiver extends Thread {

	Socket serSocket = new Socket();
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	String msg = null;
	
	ClientReceiver(Socket serSocket) {
		this.serSocket = serSocket;
	}
	/**
	 * 서버에서 보내준 메세지를 수신하는 메소드. 
	 */
	@Override
	public void run() {
		try {
			// 서버에서 보내준 메세지를 수신할 객체 필요 
			is = serSocket.getInputStream();
			isr = new InputStreamReader(is, "utf-8");
			br = new BufferedReader(isr);		
			//String msg = null;
			while(true) {
				msg = br.readLine();// 한줄씩 읽어온다. 
				// 서버에서 수신한 메세지를 출력 
				if(msg == null) break;
				System.out.println(msg);				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
					
	}
}
