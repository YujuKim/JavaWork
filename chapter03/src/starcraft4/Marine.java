package starcraft4;

public class Marine extends Unit implements Attack {

	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
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
