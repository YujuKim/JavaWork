package ex13;

public class MainTest2 {

	// for문과 if문을 활용해 배열값 오름차순으로 정렬

	public static void main(String[] args) {
		int[] myNumbers = new int[10];
		myNumbers[0] = 10;
		myNumbers[1] = 4;
		myNumbers[2] = 100;
		myNumbers[3] = 23;
		myNumbers[4] = 51;
		myNumbers[5] = 1;
		myNumbers[6] = 6;
		myNumbers[7] = 88;
		myNumbers[8] = 42;
		myNumbers[9] = 31;

		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = i + 1; j < myNumbers.length; j++) {
				int tmp = 0;
				if (myNumbers[i] > myNumbers[j]) {
					tmp = myNumbers[i];
					myNumbers[i] = myNumbers[j];
					myNumbers[j] = tmp;
				}
			}

			System.out.println(myNumbers[i]);

		}

	}
}
