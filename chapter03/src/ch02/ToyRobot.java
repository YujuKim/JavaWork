package ch02;

public class ToyRobot implements RemoteController, Sound {
	String name;

	@Override
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다.");

	}

	@Override
	public void alert() {
		System.out.println("뚜두두두 뚜두두두");

	}

}
