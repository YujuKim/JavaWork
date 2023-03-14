package ch02;

public class MainTest2 {

	public static void main(String[] args) {
		BankAccount2 bankAccount = new BankAccount2();
		
		Father2 Kim = new Father2(bankAccount);
		Mother2 Kang = new Mother2(bankAccount);
		
		Kim.start();
		Kang.start();
		

	}

}
