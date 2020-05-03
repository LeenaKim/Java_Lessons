package kr.ac.kopo.day10.inter02;

public class SamsungTV implements TV {

	private boolean power;
	
	@Override
	public void togglePower() {
		power =! power;
		System.out.println("전원" + (power ? "ON" : "OFF"));
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("Channel UP");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("Channel DOWN");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Volume UP");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Volume DOWN");
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("Mute");
	}

}
