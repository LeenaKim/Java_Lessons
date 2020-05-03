package kr.ac.kopo.day10.inter01;

public class LGTV {

	private boolean power;
	private int channelNo;
	
	public LGTV() {
		System.out.println("LG TV를 구매했습니다. ");
		power = false;
		channelNo = 3;
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다. ");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다. ");
	}
	
	public void volumeUp() {
		System.out.println("음량을 올립니다. ");
	}
	
	public void volumeDown() {
		System.out.println("음량을 내립니다. ");
	}
	
	public void channelUp() {
		System.out.println("채널을 올립니다. ");
	}
	
	public void channelDown() {
		System.out.println("채널을 내립니다. ");
	}
}
