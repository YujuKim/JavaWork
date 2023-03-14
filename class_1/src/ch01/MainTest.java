package ch01;

import java.util.HashMap;
import java.util.Map;

public class MainTest {

	public static void main(String[] args) {
		// Map 자료구조를 이용해 전화번호 저장하기

		// Map생성
		Map<String, String> map1 = new HashMap<>();

		// 전화번호 추가
		map1.put("둘리", "010-1234-5678");
		map1.put("고길동", "010-3433-4679");
		map1.put("고길동", "010-1447-8900");
		map1.put("도우너", "010-7777-4444");

		// 전화번호 검색
		String phoneNumber = map1.get("고길동"); // key값은 중복될 수 없다

		System.out.println(phoneNumber);

		// 2. String Object(Person)

	}

}
