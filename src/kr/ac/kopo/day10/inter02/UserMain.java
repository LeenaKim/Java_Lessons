package kr.ac.kopo.day10.inter02;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV tv = new LGTV();
		tv = new SamsungTV(); // 묵시적 형변환 
		// 근데 왜 이걸 굳이 인터페이스로? TV를 그냥 추상클래스로 만들면 되지 않냐? - 추상클래스를 받고 인터페이스까지 받는 경우가 많다. 
		// 추상클래스 상속은 단일상속밖에 안되니까, 몇가지 더 기능이 필요할때 인터페이스와 함께쓴다. 
		
		tv.togglePower();
		tv.channelDown();
		tv.volumeDown();
		tv.volumeUp();
		tv.mute();
		tv.channelUp();
		tv.togglePower();
		
		
		tv.togglePower();
		tv.channelDown();
		tv.volumeDown();
		tv.volumeUp();
		tv.mute();
		tv.channelUp();
		tv.togglePower();
		
		tv.copyright();
	}

}
