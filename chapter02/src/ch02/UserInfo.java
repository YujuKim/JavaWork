package ch02;

public class UserInfo {
	String userId;
	String userName;
	String phone;

	// 1. 사용자 정의 생성자 만들기_매개변수 3개 한 번에 사용

	public UserInfo(String userId, String userName, String phone) {
		this.userId = userId;
		this.userName = userName;
//		this.phone = phone;
		this.phone = "1234-1234";
		// 필요하다면 외부에서 주입받지 않고
		// 바로 초기화 가능

	}

	// 2. 사용자 정의 생성자 만들기_userId; userName;

	public UserInfo(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;

	}

	// 3. 사용자 정의 생성자 만들기_userId;
	public UserInfo(String id) {
		userId = id;

	}

	// 4. 기본 생성자 만들기
	public UserInfo() {

	}
}
