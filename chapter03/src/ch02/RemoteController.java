package ch02;

public interface RemoteController {
	// 인터페이스의 모든 변수는 public static final
	// 모든 메서드는 추상메서드

	// 인터페이스란
	// 구현된 것이 아무것도 없는, 밑그림만 있는 기본 설계도
	// 인터페이스는 표준, 약속, (강제성 있는)규칙 등의 의미를 가진다

	// 인터페이스 특징
	// 1.추상클래스보다 추상화가 높다
	// 2.멤버 변수, 일반 구현 메서드를 가질 수 없다
	// 3.오직 추상메서드와 상수만 멤버로 가질 수 있다

	public static final int SERIAL_NUMBER = 100;

	public abstract void turnOn();

	// public abstract void turnOff();

	void turnOff(); // 3번 특징 때문에 abstract를 생략하는 것도 가능하다.
	
	

}
