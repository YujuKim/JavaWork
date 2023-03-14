package ex11;

public class Archer extends Hero{
	public Archer(String name, int hp) {
		super(name, hp); 
	}

	void arrowAttack() {
		System.out.println(name + "가 화살 공격을 합니다.");
	}

	// 테스트 코드
	public static void main(String[] args) {
		Archer archer = new Archer("궁수", 100);
		archer.arrowAttack();
	}

}


