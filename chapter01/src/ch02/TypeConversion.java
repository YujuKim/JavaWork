package ch02;

public class TypeConversion {

	// 코드의 시작
	public static void main(String[] args) {
		/**
		 * (여러 줄 주석) 형변환 
		 * 자동 형변환 
		 * 강제 형변환
		 */
		
		int iNumber1 = 100;

		// 자동 형변환(묵시적 형변환)
		double dNumber1 = iNumber1;
		System.out.println(dNumber1); //100.0
		// 형이 변환 되었기에 자신에 맞는 형태로 출력

		System.out.println("==================================================");
		
		double dNumber2 = 0.0012345;
		System.out.println(dNumber2);
		// 강제 형변환(명시적 형변환)
		// 개발자가 컴파일러한테 괜찮으니까 강제로 구겨 넣으라 하는 격
		int iNumber2 = (int)dNumber2;
		System.out.println(iNumber2); 
		// 0_강제 형변환시 소수점 단위는 그냥 버림
		int iNumber3 = (int)10.55;
		System.out.println(iNumber3);
		//10
		
		
		System.out.println("====================연습문제=========================");
		double a;
		int b;
		
		a=0.5;
		b=(int)10.5;
		System.out.println(a); // 0.5
		System.out.println(b); // 10
		

	} // end of main

} // end of class
