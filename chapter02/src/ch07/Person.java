package ch07;

class Person {
//	this의 사용법
//	1.자기 자신을 가리킨다.
//	2.생성자에서 다른 생성자를 호출할 때 사용할 수 있다.
//  3.자신의 주소(참조값/주소값)를 반환 시킬 수 있다.
	private String name;
	private int age;
	private String phone;
	private String gender;

	public Person(String name, int age) {
		// 1. 자기 자신을 가리키는 this
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String phone) {
		// 2. 다른 생성자를 호출하는 this
		this(name, age); // new this(); 와 같다.
		this.phone = phone;
	}

	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
	}

	public Person getPerson() {
		// 3. 자기 자신의 주소값을 반환하는 this
		return this;
	}

	public void showInfo() {
		System.out.println("이름: " + name + "나이: " + age);
	}

} // end of Person class

// 동일한 .java 하나의 파일 안에 여러 개의 클래스를 작성할 수 있다.
// 단, public을 가지는 클래스는 하나만 선언할 수 있다.
// default 접근 제어 지시자 --> ch07에 있는 클래스는 사용 가능

class PersonMainTest {
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 100);
		person1.showInfo();


	} // end of main
}// end of PersonMainTest class
