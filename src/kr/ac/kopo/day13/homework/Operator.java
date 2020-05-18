package kr.ac.kopo.day13.homework;

import java.util.Scanner;

public class Operator {

	private Scanner sc;
	private SignUp su = new SignUp();
	private ChangePW cPW = new ChangePW();
	private ViewMember vm = new ViewMember();
	
	Operator() {
		sc = new Scanner(System.in);
	}
	
	public void execute() {
		System.out.println("원하는 서비스를 고르세요. ");
		System.out.println("1. 회원가입 ");
		System.out.println("2. 비밀번호 변경 ");
		System.out.println("3. 전체 멤버 조회 ");
		System.out.println("프로그램 종료를 원할시 아무 숫자나 누르세요. ");
		int choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) {
			su.signUp();
		} else if(choice == 2) {
			cPW.pwChange();
		} else if(choice == 3) {
			vm.view();
		} else {
			System.out.println("해당되는 항목이 없으므로 프로그램을 종료합니다. ");
			System.exit(0);
		}
		execute();
		
	}
}
