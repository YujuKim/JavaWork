package ch04;

public class Wizard {
	// 속성
	String name;
	int level;
	int power;

	public Wizard(String name, int level, int power) {
		this.name = name;
		this.level = level;
		this.power = power;
	}

	// 기능

	// 정보 출력
	public void showinfo() {
		System.out.println("이름 " + this.name);
		System.out.println("레벨 " + this.level);
		System.out.println("체력 " + this.power);

	}

	// 공격하다
	public void attack(int count) {
		System.out.println(count + "회 공격했습니다.");
		this.power -= count * 5;
	}

	// 공격당하다
	public void damage(int count) {
		System.out.println(count + "회 공격당했습니다.");
		this.power -= count * 10;
		
	}

	// 달리기
	public void run(int count) {
		this.power -= count * 2;
		System.out.println("달리면 체력이 소모됩니다.");
	}

	// 회복
	public void recover(int count) {
		if (count != 0) {
			this.power += count * 20;
			System.out.println("체력이 회복되었습니다.");
		}
	}

	public void restpower() {
		if (this.power < 0) {
			System.out.println("죽었습니다.");
		}
		else{System.out.println("현재 남은 체력은: " + this.power);
		}
	}

}
