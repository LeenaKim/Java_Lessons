package kr.ac.kopo.day16;

import java.util.Date;

class SleepThread extends Thread {
	
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println("현재시간 : " + new Date().toLocaleString());							
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class SleepMain {

	public static void main(String[] args) {
		
		SleepThread st = new SleepThread();
		st.start();
		
		while(true) {
			try {
				Thread.sleep(100); // sleep을 안걸어주면 go를 찍는 무한루프가 너무 빨리 생겨서 현재 시간을 찍어주지 않음. sleep을 걸어주며 main 스레드가 runnable로 잠깐 들어감 
				System.out.println("go!!!!"); // sleep을 빠져나오며 go를 찍음. 				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		/*
		// sleep을 만나는순간 run 상태에서 빠져나오고, runnable에 있던 thread중 하나가 run으로 간다.
		System.out.println("메인스레드를 2초동안 잠들게 하겠습니다.");
		
		try {
			Thread.sleep(2000); // 밀리세컨드니까 2초는 2000밀리초. 근데 checked exception이 일어남. 			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인스레드가 2초 후에 깨어났습니다. ");
		*/
	}
}
