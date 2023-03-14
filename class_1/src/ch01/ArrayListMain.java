package ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
	public static void main(String[] args) {

		// List계열
		List list0;
		// 순서가 있고(인덱스가 있고) 중복이 가능하다

		ArrayList<Integer> list = new ArrayList<>(); // 정수를 담을 수 있는 메모리 공간 선언
		ArrayList<Student> members = new ArrayList<>(); // Student타입만 들어올 수 있는 메모리 공간
		ArrayList<String> strings = new ArrayList<String>(); // 꺾쇠 안에 내용은 위처럼 생략 가능

		// 값 추가 방법
		list.add(3); // 인덱스 0번
		list.add(null); // 인덱스 1번. <Integer>가 클래스라서 null값을 넣을 수 있다
		list.add(100); // 인덱스 2번
		list.add(1, 20);// index 1번에 20이라는 값을 할당. 끼워넣는 거임. null은 2번으로 밀려남

		System.out.println(list.toString()); // 내용 출력
		System.out.println(list.size()); // 크기 출력
		// 3, 20, null, 100

		// 값 삭제 방법
		list.remove(2);
		System.out.println(list.toString());
		System.out.println(list.size());

		// 매번 삭제하려면
//		list.clear(); // <-- 전체 삭제
//		System.out.println(list.toString());
//		System.out.println(list.size());

		// 지정된 값을 화면에 출력
		System.out.println("------------------------");
		System.out.println(list.get(2)); // .get()연산 호출

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (int 변수명아무거나됨 : list) { // initialized for문 (for each문)
			// 연산 없이 단순히 배열 내용 순회할 땐 이걸 많이 쓴다

			System.out.println("조회 결과: " + 변수명아무거나됨);

		}

		// 값 검색 기능 사용해보기

		// contains --> 요소 안에 있는지 없는지 판별-true/false 반환
		System.out.println(list.contains(70)); // 70을 Integer클래스 타입으로 자동으로 형변환
		System.out.println(list.contains(100));

		// indexOf --> 값이 몇 번째 인덱스 요소에 있나 판별
		System.out.println(list.indexOf(100)); // 값이 있으면 해당하는 인덱스 번호 리턴
		System.out.println(list.indexOf(555)); // 값이 없으면 -1 리턴

		Iterator<Integer> iter = list.iterator(); // iterator()--> 반복자로 형변환해줌
		while (iter.hasNext()) {
			System.out.println("값 확인 방법: " + iter.next());
		}

	} // end of main

}// end of class

class Student {

}