package ch02;

public class Student {
	// 생성자: constructor
	// 객체를 생성할 때 다음과 같은 모양으로 객체를 만들라고 지시하는 것
	// 강제성을 부여한다고 볼 수 있다.
	// 생성자는 객체를 생성할 때 반드시 존재해야 한다.

	String name;
	int number;
	int grade;

	// 생성자 만들어보기 (사용자 정의 생성자)
	// 생성자는 리턴 타입이 없다. 파일 이름과 같다.
	// 메소드와 다른 점: 대문자로 시작하고 있다(class이름과 같다)
	
	// 기본 생성자
	// 사용자 정의 생성자가 없다면 컴파일러가 자동으로 만든다.
	public Student() {

	}
	// 사용자 정의 생성자
	public Student(String s, int n, int g) {
		name = s;
		number = n;
		grade = g;
	}

}
