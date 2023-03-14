package ch13;

//템플릿 메서드 패턴 구현
//핵심 메서드는 run메서드

public abstract class Car {

	protected abstract void drive();

	protected abstract void stop();

	private void startCar() {
		System.out.println("시동을 켭니다.");

	}

	private void turnOff() {
		System.out.println("시동을 끕니다.");

	}

	public abstract void wiper();

	// 후크 메서드
	public void washCar() {
	}

	// 실행의 흐름을 만들어 둔다
	// 메서드 앞에 final을 붙이면
	// 하위 클래스에서 메서드를 재정의 할 수 없다
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();

	}

}
