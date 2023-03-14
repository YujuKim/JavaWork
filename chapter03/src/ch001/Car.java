package ch001;

public class Car {
	private Engine engine;

	public Car(Engine engine) {
		// Car객체를 생성하려면 엔진 클래스가 있어야 한다
		// 따라서 Car클래스는 엔진 클래스에 의존한다

		this.engine = engine;
		// 이렇게 하지 않으면 밑의 engine.start에서 null 오류! 따라서 값을 넣어줘야 함
	}

	public void start() {
		engine.start(); // 
		System.out.println("Car started");

	}
}
