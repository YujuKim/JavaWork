package ch03;

public class MainTest4 {
	
	// 메인 함수

	public static void main(String[] args) {
		// 증감 연산자, 감소 연산자
		// ++,--
		
		int num1=1;
		num1++; //변수 값을 1 증가
		System.out.println(num1);
		
		int num2 =1;
		num2--; //변수 값을 1 감소
		System.out.println(num2);
		
		System.out.println("=============================");
		
		// 증가 연산자가 뒤에 올 경우
		int num3 = 10;
		int num4;
		num4 = num3++; //num3이 num4로 들어간 후에 증감 연산자 수행
		System.out.println(num4); //10
		System.out.println(num3); //11
		
		// 증가 연산자가 앞에 올 겨우
		int num5 = 10;
		int num6;
		num6 = ++num5; //num5를 +1한 후에 num6에 대입
		System.out.println(num6); //11
		System.out.println(num5); //11
		
		// 감소 연산자가 뒤에 올 경우
		int num7 = 20;
		int num8;
		num8 = num7--;
		System.out.println(num7); //19
		System.out.println(num8); //20
		
		// 감소 연산자가 앞에 올 경우
		int num9= 20;
		int num10;
		num10 = --num9;
		System.out.println(num9); //19
		System.out.println(num10); //19
		
	}//end of main

}//end of class
