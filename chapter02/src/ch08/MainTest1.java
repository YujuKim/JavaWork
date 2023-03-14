package ch08;

public class MainTest1 {
	// 메인함수 - 코드의 시작점
	public static void main(String[] args) {

		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);

		numberPrinter1.prinWaitNumber(); // 누군가가
		numberPrinter1.prinWaitNumber(); // 다른 누군가가
		numberPrinter1.prinWaitNumber(); // 또 다른 누군가가
		System.out.println("=================================");
		numberPrinter2.prinWaitNumber();
		numberPrinter2.prinWaitNumber();
		numberPrinter2.prinWaitNumber();

	} // end of main

} // end of class
