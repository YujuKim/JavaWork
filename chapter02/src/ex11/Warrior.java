package ex11;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		// 부모 클래스에 사용자 정의 생성자가 있다면
		// 부모 생성자를 반드시 호출해야 한다.
		super(name, hp); // 부모생성자를 호출하려면 this가 아니라 super
		System.out.println("Warrior생성자 마지막줄 코드");
		// 부모에 정의된 생성자가 있으면 그걸 먼저 호출해야 함

	}

	void comboAttack() {
		System.out.println(name + "가 2단 공격을 합니다.");
	}

	// 테스트 코드
	public static void main(String[] args) {
		Warrior warrior = new Warrior("전사", 100);
		warrior.comboAttack();
	}

	// 메서드 오버로딩
	// System.out.println도 메서드 오버로딩 이다.
	// 어떤 데이터타입을 담을지 미리 설계 되어있다.

}
