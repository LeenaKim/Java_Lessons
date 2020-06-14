/*	
package kr.ac.kopo.day17.homework.account;

public class AccountThread extends Thread {

	Account ac;
	User user;
	
	AccountThread(User user) {
		this.user = user;
	}
	@Override
	public void run() {
		try {
			//synchronized(this){				
				for(int i = 0; i < 2; i++) {
					//notifyAll();
					int howMuchDep = (int)(Math.random()*10+1)*1000;
					user.deposit(howMuchDep);
					int howMuchWit = (int)(Math.random()*10+1)*1000;
					user.withdraw(howMuchWit);	
					//wait();
					//notifyAll();
				}			
			//}
			
		}  catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
*/
