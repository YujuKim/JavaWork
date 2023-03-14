package ch03;

public class Bus {
	// 상태
	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber) {
		this.busNumber = busNumber;

	}

	// 기능
	// 달린다
	public void run() {
		System.out.println("버스가 출발합니다.");
	}

	// 승차시키다
	public void take(int count) {
		// this.passengerCount++;
		// this.money += 1_000;
		this.passengerCount += count;
		this.money += (1_000 * count);
	}

	// 하차시키다
	public void takeoff(int count) {
		this.passengerCount -= count;
		System.out.println( count + " 명의 승객이 내립니다.");

	}

	// 정보 출력
	public void showInfo() {
		System.out.println("상태 창");
		System.out.println("버스 번호: " + this.busNumber);
		System.out.println("승객 수: " + this.passengerCount);
		System.out.println("수익금: " + this.money);

	}

}
