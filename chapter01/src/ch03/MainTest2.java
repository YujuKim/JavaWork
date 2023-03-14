package ch03;

public class MainTest2 {

	public static void main(String[] args) {
		//산술 연산자
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		int number4 = (int)(5.0 / 4.0);
		int number5 = 5 % 3;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		
		System.out.println("====================================");
		
//		1.(12 + 3) / 3의 값을 화면에 출력하시오
//		int num = (12 + 3) / 3;
//		System.out.println(num);
		System.out.println((12 + 3) / 3);
//		2.(25 % 2) 의 값을 화면에 출력하시오
//		int num1 = 25 % 2;
//		System.out.println(num1);
		System.out.println(25 % 2);
//		3.(3.0 / 5) 의 값을 정수값 result변수에 담으시오
		int result = (int)(3.0 / 5);
		System.out.println(result);

	}

}
