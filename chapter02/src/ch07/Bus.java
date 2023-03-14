package ch07;

public class Bus {
	int BusNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber) {
		this.BusNumber = busNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showBusInfo() {
		System.out.println(BusNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
}// end of class
