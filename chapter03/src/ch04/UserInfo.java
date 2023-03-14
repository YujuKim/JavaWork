package ch04;

//DTO: Data Transfer Object
//특별한 기능 없이 데이터를 담아서 메모리에 올리는 역할
public class UserInfo {
	private String userName;
	private int id;
	private String pw;
	public static int SERIAL_NUMBER = 0;

	public UserInfo(String userName, String pw) {
		SERIAL_NUMBER++;
		this.id = SERIAL_NUMBER;
		this.userName = userName;
		this.pw = pw;

	}

	public int getId() {
		return id;

	}

	public String getUserName() {
		return userName;
	}

	public String getPw() {
		return pw;
	}

	public void showInfo() {
		System.out.println("사용자 정보 확인");
		System.out.println("userName: " + userName);
		System.out.println("pw: " + pw);
	}

}
