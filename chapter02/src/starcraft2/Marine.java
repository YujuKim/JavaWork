package starcraft2;

public class Marine {
	private String name;
	private int power;
	private int hp;

	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp = 70;
	}

	// getter메서드 만들기
	public int getHp() {
		return this.hp;
	}

	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}

	// 마린이 질럿을 공격합니다
	public void attactZealot(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");

	}

	// 마린이 저글링을 공격합니다
	public void attackZergling(Zergling zergling) {
		System.out.println("마린이 저글링을 공격합니다.");

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
