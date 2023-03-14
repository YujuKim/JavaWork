package ch04;

public class Plastic extends Material {
	@Override
	public String toString() {

		return "재료는 플라스틱입니다.";
	}

	@Override
	public void doprinting() {
		System.out.println("plastic재료로 출력합니다.");

	}
}
