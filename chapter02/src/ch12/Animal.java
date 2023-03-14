package ch12;

public abstract class Animal { // class 앞에 abstract를 선언함
	// 추상 메서드를 포함하는 클래스는 반드시 추상클래스가 되어야 한다.

	// 추상 클래스란?
	// 하나 이상의 추상 메서드를 포함하거나 abstract 키워드를 가진 클래스

	// 일반 메서드
	public void move() {
		System.out.println("동물이 움직입니다.");

	}

	// 추상 메서드
	public abstract void hunt();

}
