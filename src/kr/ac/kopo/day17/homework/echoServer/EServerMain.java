package kr.ac.kopo.day17.homework.echoServer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * 서버단에서 클라이언트의 메세지를 받아서 다시 보내지말고, 
 * 소켓 형의 클라이언트를 스레드로 보내면 클라이언트가 접속할때마다 여러개의 스레드가 생겨
 * 멀티스레드의 형태로 동시 접속이 가능하다. 
 */
public class EServerMain {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("-------------------------------------------");
			System.out.println("    사용법 : java EchoServerMain  port번호  ");
			System.out.println("-------------------------------------------");
		}
		
		int portNo = Integer.parseInt(args[0]); // 클라이언트에서 접속한 포트번호를 가져온다.
		try {
			ServerSocket server = new ServerSocket(portNo);		
			while (true) {
                Socket client = server.accept();
                EchoThread echoThread = new EchoThread (client);
                echoThread.start();
            }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
