package ch06;

public class Bank {
	// 아무것도 지정하지 않으면 default 접근 제어 지시자
	// int balance; //default는 다른 패키지에서 접근할 수 없다
	private int balance; // private은 여기 안에서만 접근 가능
	public String name; // public은 어디서나 접근 가능

	// 입급하다
	public void deposit(int money) {
		balance += money;
		showInfo();

	}

	// 출금하다
	public void withdraw(int money) {
		balance -= money;
		showInfo();
	}

	public void showInfo() {
		System.out.println("현재 계좌 잔액은: " + balance + " 입니다.");

	}

	// get메서드 만들기
	// get-> read only 성질을 가진다(데이터를 주입 받지 못하고 리턴만)
	public int getBalance() {
		return this.balance;
	}

	// set메서드 만들기
	// 외부에서 값을 주입 받을 수 있도록 설계
	// 방어적 코드 작성 가능
	public void setBalance(int money) {
		this.balance = money;
		if (money <= 0) {
			System.out.println("잘못된 입력값입니다.");
			return; // <- 함수, 메서드의 실행을 종료
		}
	}
}
