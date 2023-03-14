package starcraft2;

public class Zergling {
	private String name;
	private int power;
	private int hp;

	public Zergling(String name) {
		this.name = name;
		this.power = 3;
		this.hp = 50;
	}

	// getter메서드 만들기
	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}

	public int getHp() {
		return this.hp;
	}

	// 저글링이 질럿을 공격합니다
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
		// 저글링의 공격력3
		zealot.beAttacked(this.power);

	}

	// 저글링이 마린을 공격합니다
	public void attackMarine(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
		marine.beAttacked(this.power);

	}

	// 자기 자신이 공격을 당합니다
	public void beAttacked(int power) {
		System.out.println(this.name + "이 공격 당합니다.");
		this.hp -= power;

	}

	public void recover(int potion) {
		System.out.println(this.name + "이 회복 중입니다.");
		this.hp += potion * 5;
	}

	public void showInfo() {
		System.out.println("=========상태창=========");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("생명력: " + this.hp);

	}
}
