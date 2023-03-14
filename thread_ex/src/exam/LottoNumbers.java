package exam;

import java.util.Arrays;
import java.util.Random;

public class LottoNumbers {

	public int[] createNumber() {
		int[] numbers = new int[6];
		Random r = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
				}

			}
		} // end of for

		Arrays.sort(numbers);
		return numbers;
	}
} // end of class
