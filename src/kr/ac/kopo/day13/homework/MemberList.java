package kr.ac.kopo.day13.homework;

import java.util.ArrayList;
import java.util.List;

public class MemberList {

	private static List<Member> memberList = new ArrayList<>();
	
	MemberList() {}
	
	MemberList(String id, String pw) {
		memberList.add(new Member(id, pw));
	}

	public static List<Member> getMemberList() {
		return memberList;
	}

	
	
}
