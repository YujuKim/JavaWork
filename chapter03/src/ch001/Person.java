package ch001;

public class Person { // Person은 Address에 의존하고 있다.
	private String name;
	private int age;
	private Address address;

	public Person(String name, int age, Address address) {

		address = new Address("연수로249번길", "서울", "자이303호", "344-123"); // 메인함수에 있는 거랑 다른 거임
		this.name = name;
		this.age = age;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

}
