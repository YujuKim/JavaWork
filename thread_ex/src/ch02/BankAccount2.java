package ch02;

public class BankAccount2 {
	int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입급 후 잔액: " + getMoney());
	}

	public int withDraw(int money) {
		synchronized (this) {

			int currentMoney = getMoney();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (currentMoney >= money) {
				setMoney(currentMoney - money);
				System.out.println("출금 후 계좌잔액: " + getMoney());
				return money;
			} else {
				System.out.println("잘못된 입력입니다");
				return 0;
			}
		}
	}

} // end of BankAccount class

class Father2 extends Thread {
	BankAccount2 account1;

	public Father2(BankAccount2 account) {
		this.account1 = account;

	}

	@Override
	public void run() {
		account1.saveMoney(10_000);
	}
}

class Mother2 extends Thread {
	BankAccount2 account3;

	public Mother2(BankAccount2 account) {
		this.account3 = account;

	}

	@Override
	public void run() {
		account3.withDraw(5_000);
	}
}
