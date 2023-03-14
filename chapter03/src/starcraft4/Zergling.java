package starcraft4;

public class Zergling extends Unit implements Attack {

	public Zergling(String name) {
		this.name = name;
		this.power = 3;
		this.hp = 50;
	}

	@Override
	public void doubleAttack() {
		System.out.println(this.name + " 이 두배로 공격합니다.");

	}

	@Override
	public void hiddenAttack() {
		System.out.println(this.name + " 이 숨어서 공격합니다.");

	}

}
