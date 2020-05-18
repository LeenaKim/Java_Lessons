package kr.ac.kopo.day13.homework;

public class ViewMember {

	MemberList ml = new MemberList();
	
	public void view() {
		
		System.out.println("< 전체 회원 조회 >");
		
		for(Member mem : MemberList.getMemberList() ) {
			System.out.println("아이디 : " + mem.getId() + ", 비밀번호 : " + mem.getPw());
		}
	}
}
