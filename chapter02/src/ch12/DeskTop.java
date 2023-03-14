package ch12;

public class DeskTop extends Computer {
	@Override
	public void display() {
		System.out.println("이것은 데스크탑 디스플레이");

	}

	@Override
	public void typing() {
		System.out.println("데스크탑에서 타이핑");

	}

}
