package ch03;

public class GenericPrinterMainTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		// 제네릭 클래스 사용 방법
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();

		// 재료 넣기
		genericPrinter.setMaterial(powder);
		// 최상위 클래스인 Object를 활용하는 것보다 안정적인 코드를 만들 수 있다.
		// 가독성도 높아진다.

		// 재료 꺼내기
		Powder usePowder = genericPrinter.getMaterial();
		// 다운캐스팅 할 필요가 없다.
		// 잘못된 데이터 타입을 대입하면 컴파일 시점에 오류를 잡아준다.
		// 같은 변수 이름과 같은 기능일 때 제네릭으로 프로그래밍을 설계하면 된다.

	} // end of main

} // end of class
