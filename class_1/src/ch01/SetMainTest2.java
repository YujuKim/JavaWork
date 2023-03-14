package ch01;

import java.util.HashSet;
import java.util.Random;

public class SetMainTest2 {
	public static void main(String[] args) {
		// 로또 번호 생성

		HashSet<Integer> numberSet = new HashSet<>();

//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		System.out.println(numberSet.size());
//		System.out.println(numberSet.toString());

		// 문제) 무조건 6개의 사이즈를 갖는 numberSet 구성하기

		int count = 0;
		while (numberSet.size() != 6) {
			count++;
			numberSet.add(getRandomNumber());
		}
		System.out.println(numberSet.toString());
		System.out.println("반복횟수: " + count);

	} // end of main


	public static int getRandomNumber() {
		Random random = new Random();

		return random.nextInt(45) + 1;
	}

	

} // end of class
