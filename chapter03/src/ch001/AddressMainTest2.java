package ch001;

public class AddressMainTest2 {

	public static void main(String[] args) {
		Address2 address = new Address2("한강대로", "서울", "롯데아파트", "61234");
		Person2 person = new Person2("홍길동",20,address);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getAddress());
		System.out.println(address);

	}

}
