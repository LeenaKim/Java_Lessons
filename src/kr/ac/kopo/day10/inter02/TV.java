package kr.ac.kopo.day10.inter02;

public interface TV {

	int MAX_VOLUME = 30; // 상수항 
	void togglePower();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();

	/**
	 * 디폴트가 나온 배경은 이미 만들어진 프로그램이 저작권때문에 새로운 추상클래스를 만들고 하위 클래스 객체의 형을 계속 바꿔주는것을 해결하기위해 만들어진것이지,
	 * 디폴트 키워드는 설계할때 허용되지 않는다. 디폴트클래스보다, 중간에 추상클래스를 상속받아 사용하게 만드는게 제대로된 설계다. 
	 * 디폴트 메소드는 자식클래스에서 오버라이드가 가능하다. 바뀌지 않게하려면 final을 붙여줘야 한다. 
	 * @since JDK 1.8 추가 
	 */
	default void copyright() {
		System.out.println("저작권은 TV 협회에 있습니다. ");
		System.out.println("임의로 수정, 배포하실 수 없습니다. ");
	}
	
}
