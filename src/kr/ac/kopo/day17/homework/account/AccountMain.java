package kr.ac.kopo.day17.homework.account;

public class AccountMain {

	public static void main(String[] args) {
		
		Account ac = new Account("홍길동", 10000);
		
		User ur1 = new User("홍길동", ac);
		User ur2= new User("어머니", ac);
		User ur3 = new User("아버지", ac);
		
		ur1.start();
		ur2.start();
		ur3.start();
		
	}
}
