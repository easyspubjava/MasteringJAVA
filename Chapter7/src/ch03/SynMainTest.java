package ch03;

class Bank{
	
	
	private int money = 10000;
	
	public  void  saveMoney(int save) {
		int m = this.getMoney();
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney( m + save);
	
	}
			
	public  void minusMoney(int minus) {
		
			int m = this.getMoney();
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney( m - minus);	
		}
		
	
	
			
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
}


class Park extends Thread{
	
	public void run() {
	
		synchronized (SynMainTest.myBank) {
			System.out.println("start save");
			SynMainTest.myBank.saveMoney(3000);
			System.out.println("saveMoney(3000) :" + SynMainTest.myBank.getMoney() );
			
		}
		
	}
	
}

class ParkWife extends Thread{
	
	public void run() {
		synchronized (SynMainTest.myBank) {
			System.out.println("start minus");
			SynMainTest.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000) :" + SynMainTest.myBank.getMoney() );
		}
	}
}

public class SynMainTest {
	
	public static Bank myBank = new Bank();

	public static void main(String[] args) throws InterruptedException {

		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		
		ParkWife pw = new ParkWife();
		pw.start();
	
		
		
	}

}
