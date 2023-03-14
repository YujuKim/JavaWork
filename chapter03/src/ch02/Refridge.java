package ch02;

public class Refridge extends HomeAppliances implements RemoteController, Sound {

	@Override
	public void turnOn() {
		System.out.println("냉장고를 켭니다.");

	}

	@Override
	public void turnOff() {

		System.out.println("냉장고를 끕니다.");

	}

	@Override
	public void alert() {
		System.out.println("띠리리리 띠리리리");

	}

}
