package ch02;

public class MainTest1 {
	public static void main(String[] args) {
		// 현재 잔액 100_000만원
		BankAccount bankAccount = new BankAccount();

		Father father = new Father(bankAccount);
		Mother mother = new Mother(bankAccount);

		// 아버지 입금하기
		father.start();

		// 어머니 출금
		mother.start();

		// 정상 동작한다면: 10만 +1만 -5천 = 10만 5천
	}
}
