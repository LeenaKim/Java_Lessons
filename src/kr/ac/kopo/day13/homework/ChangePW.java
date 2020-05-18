package kr.ac.kopo.day13.homework;

import java.util.Scanner;

public class ChangePW {

	private Scanner sc;
	
	ChangePW () {
		sc = new Scanner(System.in);
	}
	// ArrayList를 사용했기때문에 반복문으로 스캔해주며 같은 아이디와 비밀번호를 찾았다. - ArrayList는 중복을 허용하기때문에 map처럼 같은 값이 들어왔을시 자동으로 기존값을 업데이트해주지 않는다. 
	public void pwChange() {
		System.out.println("패스워드 변경서비스입니다. ");
		System.out.println("변경할 아이디를 입력하세요.");
		
		String id = sc.nextLine();
		
		for(Member mem : MemberList.getMemberList()) { // arraylist내의 Member의 인스턴스변수들의 id를 탐색 
			if(mem.getId().equals(id)) { // map에서 했던것처럼 같지 않을시 프로그램을 종료하게되면 arraylist의 경우 인덱스를 기준으로 탐색하기때문에 내가 변경하고자하는 값이 0번째에 나오지 않는한 모두 종료시켜버리므로 '같을 시'로 조건을 주었다. 
				System.out.print("현재 패스워드를 입력하세요: ");
				String password = sc.nextLine();
				if(mem.getPw().equals(password)) {
					System.out.print("변경할 패스워드를 입력하세요. :");
					String newPassword = sc.nextLine();
					mem.setPw(newPassword);
					System.out.println("비밀번호가 변경됬습니다. ");
				} else {
					System.out.println("패스워드가 올바르지 않습니다. ");
					System.out.println("서비스를 종료합니다.");
					System.exit(0);
				}
			} else {
				if(mem.equals(MemberList.getMemberList().get(MemberList.getMemberList().size()-1))) { // list의 마지막 멤버형 객체까지 갔는데도 같은 id가 나오지 않을시 종료. Member 클래스에서 Object 메소드 equals()를 재정의하여 사용. 
					System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다.");
					System.out.println("서비스를 종료합니다. ");
					System.exit(0);
				}
				
			}
		}
		
	}
	
}
