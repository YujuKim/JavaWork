package ch001;

public class EngineMainTest {

	public static void main(String[] args) {
		// 자바에서 의존관계란 보통 한 클래스가 다른 클래스를 사용하는 관계를 말한다.
		// 자동차 클래스가 엔진 클래스를 사용한다면 자동차 클래스는 엔진 클래스에 의존한다라고 말할 수 있다.

		Engine engine = new Engine();
		Car car = new Car(engine);

		car.start();

	}

}
