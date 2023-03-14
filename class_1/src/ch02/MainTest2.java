package ch02;

import java.util.ArrayList;

public class MainTest2 {

	public static void main(String[] args) {
		A a = new A();

		// 문제) D object에 있는 value 값을 화면에 출력해주세요
		String result = a.b.c.d.value;
		System.out.println(result);

		ArrayList<String> temp = a.b.c.d.arrayList;
		System.out.println(temp.toString());

		// for문 for each문

		for (int i = 0; i < a.b.c.d.arrayList.size(); i++) {
			String result2 = a.b.c.d.arrayList.get(i);
			System.out.println(result2);
		}

		for (String str : a.b.c.d.arrayList) {
			System.out.println(str);

		}

	}

}
