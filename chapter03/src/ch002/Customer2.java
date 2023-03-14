package ch002;

public class Customer2 {
	private String name;
	private int balance;

	public Customer2(String name, int balance) {
		this.name = name;
		this.balance = balance;

	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public void buyCoffee(Coffee2 coffee) {
		if (balance >= coffee.getPrice()) {
			balance -= coffee.getPrice();
			System.out.println(name + "님이 " + coffee.getName() + " 을 삽니다.");

		} else {
			System.out.println("잔액이 부족합니다.");
		}

	}
}
