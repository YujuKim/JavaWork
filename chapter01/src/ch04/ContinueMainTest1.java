package ch04;

import java.util.Iterator;

public class ContinueMainTest1 {

	public static void main(String[] args) {
		// 무시하고 계속 진행하는 continue문
		for (int i = 1; i < 11; i++) {
			// 7이면 출력하지 마라
			if(i % 7 == 0) {
				continue;
			}
			System.out.println("현재 값: " + i); 
			
		}
		// 3의 배수는 출력하지 않는 continue문
		for (int i = 1; i < 11; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println("현재 값: " + i);
		}
		
	
	}

}
