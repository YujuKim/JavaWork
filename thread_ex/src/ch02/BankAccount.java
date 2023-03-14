package ch02;

import java.util.Set;

// sharedResource 상황을 구현해 보자
public class BankAccount {
	int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// synchronized --> 동기화 처리 진행
	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액: " + getMoney());

	}

	public int withDraw(int money) {
		// 현재 10만원 상태
		// 동기화처리 --> 블럭을 사용
		synchronized (this) {
			int currentMoney = getMoney();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

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

class Father extends Thread {
	BankAccount account;

	public Father(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// 입금 시키기
		account.saveMoney(10_000);
	}
}

class Mother extends Thread {
	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// 출금 시키기
		account.withDraw(5_000);
	}
}
