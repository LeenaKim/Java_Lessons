package kr.ac.kopo.day09.homework.abs;

public class Circle extends Figure {

	private int radius;
	
	public Circle() {
		
	}

	@Override
	public void getWHR() {
		this.radius = Figure.r.nextInt(10)+1;
	}
	
	@Override
	public void calculateArea() {
		getWHR();
		setArea(Math.pow(radius, 2) * Math.PI);
	}


}
