package kr.ac.kopo.day10.inter02;

public class LGTV implements TV {

	private boolean power; 
	private int channelNo;
	private int volumeSize;
	
	
	public LGTV() {
		System.out.println("LG TV를 구매했습니다. ");
		power = false;
		channelNo = 3;
		volumeSize = 7;
	}
	
	@Override
	public void togglePower() {
		power = !power;
		if(power) {
			System.out.println("전원을 켰습니다. ");
			info();
		} else {
			System.out.println("전원을 끕니다. ");
		}
	}

	@Override
	public void channelUp() {
		channelNo++;
		info();
	}

	@Override
	public void channelDown() {
		channelNo--;
		info();
	}

	@Override
	public void volumeUp() {
		if(volumeSize != MAX_VOLUME)
			volumeSize++;
		info();
	}

	@Override
	public void volumeDown() {
		if(volumeSize != 0)
			volumeSize--;
		info();
	}

	@Override
	public void mute() {
		volumeSize = 0;
		info();
	}
	
	public void info() {
		System.out.println("현재 채널번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	}

}
