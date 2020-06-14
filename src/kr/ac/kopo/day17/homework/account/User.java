package kr.ac.kopo.day17.homework.account;

public class User extends Thread {

	private String usrName;
	private Account account;
	
	User(){}
	
	public User(String usrName, Account account) {
		super();
		this.usrName = usrName;
		this.account = account;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			account.deposit(usrName);
			account.withdraw(usrName);
		}
	}
	
	
	
	
	
	
	
	
}