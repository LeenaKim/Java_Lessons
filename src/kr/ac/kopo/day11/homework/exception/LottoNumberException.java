package kr.ac.kopo.day11.homework.exception;

public class LottoNumberException extends Exception {
// 사용자 정의 예외 - 상위클래스 Exception의 생성자를 상속받는다. 
	public LottoNumberException() {
		super();
	}

	public LottoNumberException(String message) {
		super(message);
	}

}
