package kr.ac.kopo.day10.inter01;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LGTV lg = new LGTV();
		lg.powerOn();
		lg.channelUp();
		lg.volumeUp();
		lg.volumeDown();
		lg.powerOff();
		
		SamsungTV sam = new SamsungTV();
		sam.togglePower();
		sam.soundUp();
		sam.soundDown();
		sam.channelDown();
		sam.channelUp();
		sam.togglePower();
		// 두 회사의 리모콘 표준화가 서로 다르다. 엘쥐는 powerOn, 삼성은 togglePower 등 서로의 용어가 다르다. 
		// 이러다보니 각자의 회사의 리모콘으로 다른 회사의 티비를 제어할 수 없다. 
		// 하지만 나는 리모콘 하나로 여러 티비를 컨트롤하고싶다. TV 협회에서 회의를 했다. 음소거랑 전원 온오프는 서로 통하게해야하지 않겠느냐. 
		// 이를 위해 메소드 이름을 통일하자! 이럴때 인터페이스를 쓴다. => 패키지 kr.ac.kopo.day10.inter02로 이동 
	}

}
