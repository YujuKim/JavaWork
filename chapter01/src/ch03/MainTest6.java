package ch03;

public class MainTest6 {

	public static void main(String[] args) {
		// 논리 연산자(&&, ||, !)
		// && <--논리곱. 하나라도 거짓이면 false
		// || <--논리합. 하나라도 참이면 true
		// ! <--부정
		// 연산의 결과값은 true or false
		// 보통 비교연산자와 함께 쓰임
		
		int num1 = 10;
		int num2 = 20;
		
//		boolean flag1 = (num1 > 0) && (num2 > 0);
//		System.out.println(flag1); //true

		boolean flag1 = (num1 > 0) || (num2 > 0);
		System.out.println(flag1); //true
		
		flag1 = (num1 > 0) && (num1 < 0);
		System.out.println(!flag1); //true
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		boolean flag2 = (num1 > 0) || (num2 < 0); //true
		
		
				
		
	}//end of main

}//end of class
