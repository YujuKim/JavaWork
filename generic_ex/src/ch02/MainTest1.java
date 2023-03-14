package ch02;

public class MainTest1 {
	public static void main(String[] args) {
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		ThreeDPrinter3 threeDPrinter3 = new ThreeDPrinter3();

		threeDPrinter3.setMaterial(plastic);

		// 재료 꺼내보기

		Plastic usePlastic = (Plastic)threeDPrinter3.getMaterial();
		
		// Object클래스를 쓰면 이렇듯 불편한 점이 생긴다.
		// 다운캐스팅 처리를 해야 하고
		// 런타임 시점에 잘못된 처리를 하게 되면 예외를 발생시킬 수 있다.

	} // end of main

} // end of class
