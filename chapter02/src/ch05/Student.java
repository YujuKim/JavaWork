package ch05;

public class Student {

	String name;
	int money;
	int number;

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 학생이 버스를 탄다
	public void takeBus(Bus targetBus) {
		// Bus localBus = targetBus;
		// System.out.println("takeBus 메서드 실행");
		// targetBus.showInfo();
		// localBus.showInfo();
		targetBus.take(1_000);
		this.money -= 1000;
		this.number++;

	}

	// 학생이 지하철을 탄다
	public void takeSubway(Subway targetSubway) {
//		System.out.println("takeSubway 메서드 실행");
		targetSubway.take(1_200);
		this.money -= 1_200;
		this.number++;

	}

	// 상태창
	public void showInfo() {
		System.out.println("학생의 이름: " + this.name);
		System.out.println("학생의 소지금: " + this.money);

	}

	// 상태창2 (잔액)
	public void showMoney() {
		if (this.money < 1000) {
			System.out.println("충전이 필요합니다.");
		} else {
			System.out.println(this.name + "학생의 잔액은 " + this.money + "원 입니다.");
		}
		System.out.println("==============================");
	}

	// 상태창3 (대중교통 이용횟수)
	public void showNumber() {
		System.out.println(this.name + "학생은 대중교통을 " + this.number + " 회 이용하였습니다.");

	}

}
