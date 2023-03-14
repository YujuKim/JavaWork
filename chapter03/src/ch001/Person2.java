package ch001;

public class Person2 {
	private String name;
	private int age;
	private Address2 address;

	public Person2(String name, int age, Address2 address) {
		address = new Address2("노량진로21", "서울", "아이파크", "4567");
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

	public Address2 getAddress() {
		return address;
	}

}
