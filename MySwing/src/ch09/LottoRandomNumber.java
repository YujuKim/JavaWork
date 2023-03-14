package ch09;

import java.util.Arrays;
import java.util.Random;

// 기능 구현
// 랜덤 번호 발생
// get,set
// 6개 번호 리턴, 정렬
public class LottoRandomNumber {

	final int LOTTO_NUMBER_SIZE = 6;

	public int[] createLottoNumber() {
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIZE];
		Random r = new Random();
		for (int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = r.nextInt(45) + 1;
			// 중복 검증
			for (int j = 0; j < i; j++) {
				if (lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
			}
		} // end of for

		Arrays.sort(lottoWinNum); // 오름차순 정렬
		return lottoWinNum;
	}
} // end of class
