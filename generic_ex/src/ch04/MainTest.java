package ch04;

public class MainTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
//		GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>();
//		상속 안 받아서 오류남

		// 재료 넣기
		genericPrinter1.setMaterial(new Powder());
		genericPrinter2.setMaterial(new Plastic());

	}

}
