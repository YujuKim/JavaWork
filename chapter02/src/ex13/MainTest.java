package ex13;

import java.util.Random;

public class MainTest {

	public static void main(String[] args) {
		// 우리반 학생 이름을 배열에 담아주세요
		// 랜덤 클래스를 사용해 한 명을 추출해 주세요

		String students[] = new String[19];
		students[0] = "편용림";
		students[1] = "김효린";
		students[2] = "배진석";
		students[3] = "강민정";
		students[4] = "한범진";
		students[5] = "손주이";
		students[6] = "김유주";
		students[7] = "김미정";
		students[8] = "김지현";
		students[9] = "박성희";
		students[10] = "이지운";
		students[11] = "정다운";
		students[12] = "이치승";
		students[13] = "이서영";
		students[14] = "전대영";
		students[15] = "김현우";
		students[16] = "김민우";
		students[17] = "이현서";
		students[18] = "오세훈";

		Random random = new Random();
		int randomNumber = random.nextInt(18);

		System.out.println(students[randomNumber]);

	}

}
