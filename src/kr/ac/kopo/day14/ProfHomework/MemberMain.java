package kr.ac.kopo.day14.ProfHomework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Member> memberList = new ArrayList<>();
		
		memberList.add(new Member("aaa", "1111"));
		memberList.add(new Member("bbb", "2222"));
		memberList.add(new Member("ccc", "3333"));
		memberList.add(new Member("ddd", "4444"));
		
		try {
		System.out.println("패스워드 변경서비스입니다...");
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		Member user = new Member(id); // id만 비교하기위해 id만 파라미터로 가진 생성자를 사용 
		
		// contains()도 equals를 쓴다. 
		boolean bool = memberList.contains(user); // 더 간결하게 
		
		/*
		boolean bool = false;
		for(Member mem : memberList) {
			if(mem.equals(user)) {
				bool = true;
				break;
			}
		}*/
		if(!bool) {
//			System.out.println("입력하신 아이디 {" + id + "}는 존재하지 않습니다. ");
//			System.out.println("서비스를 종료합니다. ");
//			System.exit(0);
			throw new CheckIDPASSException(1);
		}
		
		int index = memberList.indexOf(user);// equals를 썼기때문에 인덱스를 알아낼 수 있다. 
		System.out.println("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		
		if(!memberList.get(index).getPw().equals(password)) {
//			System.out.println("패스워드가 올바르지 않습니다. ");
//			System.out.println("서비스를 종료합니다. ");
//			System.exit(0);
			throw new CheckIDPASSException(2);
		}
		
		System.out.println("변경할 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		// 방법 1 
//		memberList.remove(index);
//		memberList.add(index, new Member(id, newPassword));
		
		// 방법 2
		memberList.set(index, new Member(id, newPassword)); // ArrayList의 set 메소드는 인덱스에 해당 값으로 변환시킨다. 
		
		System.out.println("< 전체 회원 목록 >");
		Iterator<Member> ite = memberList.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next()); // toString() 메소드를 오버라이드해놨기때문에 그냥 바로 불러도 출력된다. ite.next()로 멤버 객체가 나오고, 객체 이름만 호출하면 컴퓨터는 toString메소드를 호출한다. 
		}
		} catch(CheckIDPASSException e) {
			System.out.println(e.getMessage());
			System.out.println("서비스를 종료합니다. ");
		}	
	}
}
