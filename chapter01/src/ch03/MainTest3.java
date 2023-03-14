package ch03;

public class MainTest3 {

	//메인 함수(메인 스레드)
	public static void main(String[] args) {
		//복합 대입 연산자
		//다른 연산자와 대입 연산자를 함께 사용하는 것
		int num1 = 1;
		num1 = num1 + 10;
		System.out.println(num1);
		
		int num2 = 1;
		num2 += 10; //num1의 대입과정을 간소화한 것
		System.out.println(num2);
		
		int num3 = 1;
		num3 -= 10;
		System.out.println(num3);
		
		System.out.println("=======연습문제=======");
		int num =1;
		num *= 2;
		System.out.println(num);
		int numm =1;
		numm /= 2;
		System.out.println(numm);
		numm %= 2;
		System.out.println(numm);

	}

}
