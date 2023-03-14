package ch05;

// 클래스를 사용하는 코드
public class UserMainTest {
	// 메인 함수
	public static void main(String[] args) {

		// 메모리 올리고
		User user1 = new User();

		// 값을 할당
		user1.name = "김유주";
		user1.gender = "female";
		user1.nationality = "Korean";
		user1.age = 28;
		user1.height = 164;

		// 화면에 출력
		System.out.println(user1.name);
		System.out.println(user1.gender);
		System.out.println(user1.nationality);
		System.out.println(user1.age);
		System.out.println(user1.height);

	} // end of main

} // end of class
