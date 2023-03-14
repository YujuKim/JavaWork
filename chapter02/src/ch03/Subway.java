package ch03;

public class Subway {
	
	// 상태
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 기능
	public void take(int count) {
		this.passengerCount += count;
		this.money += (1500 * count);		
		System.out.println(count + "명의 승객이 탑니다.");
		
	}
	public void takeOff(int count) {
		this.passengerCount -= count;
		this.money -= (1500 * count);	
		System.out.println(count + "명의 승객이 내립니다.");
		
	}
	
	
	public void showInfo() {
		System.out.println("상태 창");
		System.out.println("지하철 호선 번호: " +this.lineNumber);
		System.out.println("승객 수: " +this.passengerCount);
		System.out.println("수익금: " +this.money);
		
	}

}
