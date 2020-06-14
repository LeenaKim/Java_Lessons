package kr.ac.kopo.day17.homework.account;

public class Account {

	private String name;
	private int money;
	
	public Account(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	// 입금 메소드 
	public synchronized void deposit(String usrName) {
		try {
			int howMuch = (int)(Math.random()*10+1)*1000;
			System.out.println(usrName + "고객님이 " + howMuch + "원을 입금하셨습니다.");
			money = money + howMuch;// 잔액 업데이트 
			System.out.println("현재 잔액은 " + money + "원입니다.");// 잔액 알림 
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 출금 메소드 
	public synchronized void withdraw(String usrName) {
		try {
			int howMuch = (int)(Math.random()*10+1)*1000;
			System.out.println(usrName + "고객님이 " + howMuch + "원을 출금하셨습니다. ");
			if(money < howMuch) {// 잔액이 부족할시 출금 안됨 
				System.out.println("잔액이 부족합니다. ");
			} else {
				money = money - howMuch;		// 잔액 업데이트 		
			}
			System.out.println("현재 잔액은 " + money + "원입니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
