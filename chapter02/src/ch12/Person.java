package ch12;

public class Person extends Human {

	@Override
	public void hunt() {
		super.hunt(); // 부모에 있는 메서드 호출
		System.out.println("얘는 사람");

	}

}
