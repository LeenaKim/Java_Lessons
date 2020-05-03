package kr.ac.kopo.day11.homework.exception;

import java.util.Scanner;
// 굳이 이러지 않아도 되지만... 사용자값을 받는것을 '기능의 추가'로 생각했습니다. 
public interface GetLottoNum {

	Scanner sc = new Scanner(System.in); // 상수항으로 sc 인스턴스변수 선언 
	
	public abstract void getLottoNum();
}
