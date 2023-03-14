package ch01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class MapMainTest {
	public static void main(String[] args) {

		Map map;
		// key와 value구조로 데이터를 저장한다.

		Map<String, String> map1 = new HashMap<>(); // value-null값 허용
		Hashtable<String, String> map2 = new Hashtable<>(); // value-null값 허용 안 함

		// C R U D

		// 값 넣기
		map1.put("A01", "김포공항정문");
		map1.put("A02", "김포공항후문");
		map1.put("A03", "김포공항로비");
		map1.put("B01", "인천공항정문");
		map1.put("B02", "인천공항후문");
		map1.put("B03", "인천공항로비");
		map1.put("C01", null);

		// map자료구조 전체값 확인하기
		System.out.println(map1); // toString 자동으로 오버라이딩돼서 주소값 안 나옴

		// 값 꺼내기 - key값을 통해 꺼낼 수 있다
		System.out.println(map1.get("B03"));
		System.out.println(map1.get("C01"));
		System.out.println(map1.get("b01")); // 없는 key값을 요청하면 null반환

		// 사이즈 확인
		System.out.println("size: " + map1.size());

		for (int i = 0; i < map1.size(); i++) {

			System.out.println(map1.get(i));

		}
		// map은 원래 순서가 없지만 정수값을 주면 key값으로 for문을 활용도 할 수 있다
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.put(0, "A");
		map3.put(1, "B");
		map3.put(2, "C");
		map3.put(3, "D");
		map3.put(4, "E");

		for (int i = 0; i < map3.size(); i++) {
			System.out.println("value: " + map3.get(i));
		}

		// 삭제
		map1.remove("C01");
//		map1.clear(); 전체 삭제
		System.out.println(map1.toString());

		// 자료구조는 반복문과 if문을 많이 활용
		// Entry<String, String> entry1 = (Entry<String, String>) map1.entrySet();

		// map계열을 for문과 활용하는 방법

		// Entry로 형변환해 for문 돌림
		// key, value를 반복하면서 한 번에 꺼낼 수 있다
		for (Entry<String, String> entry2 : map1.entrySet()) {
			System.out.println("key: " + entry2.getKey());
			System.out.println("value: " + entry2.getValue());
			System.out.println("-----------------------------");

		}

		System.out.println("=========================");

		System.out.println(map1.keySet().size());
		// map값을 꺼낼 때 key값으로 접근
//		String str = map1.get("A01");
		for (String key : map1.keySet()) {
			System.out.println("key: " + key); // 반복 돌면서 key값 확인
			System.out.println("value: " + map1.get(key));
		}

	} // end of main

} // end of class
