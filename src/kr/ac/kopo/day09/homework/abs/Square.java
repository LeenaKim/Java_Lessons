package kr.ac.kopo.day09.homework.abs;

public class Square extends Rectangle {

	private int width;
	
	public Square() {
		
	}
	
	@Override
	public void getWHR() {
		this.width = Figure.r.nextInt(10)+1;
	}
	
	@Override
	public void calculateArea() {
		getWHR();
		setArea(Math.pow(width, 2));
	}

}
