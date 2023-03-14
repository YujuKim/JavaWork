package ch01;

public class DataType1 {
	//main 함수: 코드의 시작점
	public static void main(String[] args) {
		// 데이터 타입의 종류_크게 2가지
		// 1. 기본 데이터 타입(primitive data type)
		// 2. 참조 타입(reference type)
		
		// 정수형 데이터 타입
		// 크기가 다를 수 있다
		byte b; //1바이트 크기만큼 담을 수 있다(8bit)
		short s; //2바이트 (16bit)
		int i; //4바이트 (32bit)
		long l; //8바이트 (64bit)
		
		b=127;
		b=-128;
		// 데이터 타입 byte는 127 부터 -128 까지 담을 수 있다.
		
		s=128;
		
		i=2100000000;
		// int는 약 +-21억까지의 정수를 담을 수 있다.
		// 컴퓨터 정수값의 기본단위는 int. 따라서 21억이상의 수는 접미사가 필요
		
		
		l=2200000000L; //<-'L/l'접미사를 붙여 줘야 함
				
		System.out.println("–32,768 ~ 32,767");
	}

	
} //end of class
