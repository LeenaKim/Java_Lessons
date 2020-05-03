package kr.ac.kopo.day11;

public class OddException extends Exception {
// 실제로 예외가 호출됬을때 메세지와 함께 보여주기위해선 생성자가 필요 - source에서 super class의 생성자 자동완성 

	public OddException() {
		super();
	}

	public OddException(String message) {
		super(message);
	}
	
}
