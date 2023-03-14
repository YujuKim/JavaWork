package ch06;

import java.util.Scanner;

import ch05.UserInfo;

public class UserinfoClient {

	static String dbName = "Oracle";

	// main함수 --> 실행하는 코드 작성(사용하는 쪽 코드)
	public static void main(String[] args) {
		// UserInfoOracleDao 만들기
		// 스캐너를 통해 사용자 이름,사용자 비번 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String inputUserName = scanner.nextLine();
		System.out.println("패스워드를 입력하세요.");
		String inputUserPw = scanner.nextLine();

		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		
		UserInfoOracleDao dao = new UserInfoOracleDao();
		
		// 흐름 만들기
		// 1.저장 기능, 2.수정 기능
		
		// dbName 변경해 가며 코드 동작 확인 하기
		
		

	} // end of class
} // end of main
