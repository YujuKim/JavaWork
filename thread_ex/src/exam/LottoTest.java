package exam;

public class LottoTest {

	public static void main(String[] args) {

		int[] lottonumbers = new int[6];

		LottoNumbers lotto1 = new LottoNumbers();

		lottonumbers = lotto1.createNumber();

		System.out.println("추천 로또 번호");

		for (int i = 0; i < lottonumbers.length; i++) {
			System.out.println(lottonumbers[i]);
		}

	}

}
