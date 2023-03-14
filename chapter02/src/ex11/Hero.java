package ex11;

public class Hero {
	protected String name; // ->protected: 같은 패키지 + 자식클래스에서 접근 가능
	protected int hp;

	// 사용자 정의 생성자
	public Hero(String name, int hp) {
		System.out.println("Hero클래스를 생성합니다.");
		this.name = name;
		this.hp = hp;
	}

	void attack() {
		System.out.println("기본 공격합니다.");
	}

}
