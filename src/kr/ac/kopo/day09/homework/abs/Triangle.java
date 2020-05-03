package kr.ac.kopo.day09.homework.abs;

public class Triangle extends Figure {

	private int width;
	private int height;
	
	public Triangle() {
		
	}

	@Override
	public void getWHR() {
		this.width = Figure.r.nextInt(10)+1;
		this.height = Figure.r.nextInt(10)+1;
	}
	@Override
	public void calculateArea() {
		getWHR();
		setArea((width * height) / 2);
	}


}
