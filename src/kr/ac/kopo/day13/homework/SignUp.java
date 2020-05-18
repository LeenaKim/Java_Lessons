package kr.ac.kopo.day13.homework;

import java.util.Scanner;

public class SignUp {

	private Scanner sc;
	MemberList ml;
	
	SignUp() {
		sc = new Scanner(System.in);
	}
	
	public void signUp() {
		System.out.println("등록할 아이디 입력 : ");
		String id = sc.nextLine();
		System.out.println("등록할 비밀번호 입력 : ");
		String pw = sc.nextLine();
		ml = new MemberList(id, pw);
	}
}
