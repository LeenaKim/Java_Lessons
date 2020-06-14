package kr.ac.kopo.day16;
//join() : 한 스레드가 끝날때까지 기다렸다가 실행 
class BoyFriendThread extends Thread {
	
	@Override
	public void run() {
		GirlFriendThread gt = new GirlFriendThread();
		gt.start();
		
		System.out.println("(남자친구) : 나는 남자친구 스레드입니다. ");
		System.out.println("(남자친구) : 오늘 여자친구 스레드와 영화를 보기로 했습니다. ");
		System.out.println("(남자친구) : 예매한 영화시간이 얼마 남지 않았습니다.");
		System.out.println("(남자친구) : 여자친구를 기다립니다. 제 인내심은 5초까지입니다. ");
//		System.out.println("(남자친구) : 여자친구가 올때까지 기다리겠습니다. ");
		
		try {
			gt.join(5000); // join 뒤에 시간을 저장하면 해당 시간이 지난후에 block 상태에 있는 남자친구 스레드를 runnable로 옮겨주겠다. 
//			gt.join(); // 여자친구 스레드의 run()이 다 수행되어 종료될때까지 남자친구 run 메소드는 block 상태에 들어간다. 			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 여자친구 스레드가 종료될때까지 수행되면 안됨 
		System.out.println("(남자친구) : 5초동안 여자친구가 안왔습니다. 집에 갑니다. ");
//		System.out.println("(남자친구) : 드디어 여자친구가 왔습니다. 영화보러갑니다. ");
	}
}

class GirlFriendThread extends Thread {
	
	@Override
	public void run() {
	
		System.out.println("(여자친구) : 나는 여자친구 스레드입니다. ");
		System.out.println("(여자친구) : 오늘 남자친구의 애정도를 테스트하겠습니다. ");
		System.out.println("(여자친구) : 10초도 못기다리는 남자친구는 나를 좋아하는게 아니겠죠? ");
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);	 //1초
				System.out.println("(여자친구) : " + i + "초가 지났습니다. 남자친구가 계속 기다리고있을까요?");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("(여자친구) : 남자친구가 없어요...ㅜㅜ 헤어져벌여!!!!!");
//		System.out.println("(여자친구) : 남자친구가 10초를 기다려줬어요... 저를 좋아하나봐요. ");
	}
}

public class JoinMain {

	public static void main(String[] args) {
		
		BoyFriendThread bt = new BoyFriendThread();
		bt.start();
		
		
	}
}
