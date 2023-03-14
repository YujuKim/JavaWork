package ch03;

public class ShortCircuitTest {

	public static void main(String[] args) {
		int num1 = 5;
		int i = 0;
		
		boolean value = ( (num1 += 10) > 10 ) && ( (i += 2) < 10 );
		System.out.println(value);
		System.out.println("=====================================");
		System.out.println(num1);
		System.out.println(i);
		System.out.println("=====================================");

		value = ( (num1 += 10) > 10 ) || ( ( i += 2) < 10 );
		System.out.println(value);
		System.out.println(i);

		
		System.out.println("============연습문제==============");
		int num = 2;
		int j = 5;

		// 문제 1
		boolean val = ((num *= 2) > 10) && ((j -= 5) == 0);
		System.out.println(val);
		System.out.println(num);
		System.out.println(j);

		// 문제 2
		boolean val2 = ((num += 1) == 5) || ((j += 5) == 10);
		System.out.println(val2);
		System.out.println(num);
		System.out.println(j);

		

	}// end of main

}// end of class
