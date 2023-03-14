package ch001;

public class AddressMainTest1 {

	public static void main(String[] args) {

		Address address = new Address("해운대구 좌동", "부산", "롯데103호", "233-464");
		Person person = new Person("홍길동", 10, address);

		System.out.println("name: " + person.getName());
		System.out.println("Address: " + person.getAddress().toString());
		System.out.println(address);

		// Person 클래스에서 Address를 참조할 수 있다.
		// Address 클래스는 Person클래스를 참조 할 수 없다.
		
	} // end of main

}
