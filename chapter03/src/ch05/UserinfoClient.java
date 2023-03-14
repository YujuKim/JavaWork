package ch05;

public class UserinfoClient {

	static String dbName = "MSSQL";

	// main함수 --> 실행하는 코드 작성(사용하는 쪽 코드)
	public static void main(String[] args) {

		// 사용자한테 정보를 입력받는다
		// String userName, String pw

		// 스캐너 활용 --> 이름 한글자 이상, pw특수문자 포함
		String inputUserName = "홍길동";
		String inputUserPw = "1234";
		// 위에 받은 데이터를 Object타입으로 변화 -->DTO
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		userInfo.showInfo();
		
		
		IUserinfoDao dao;
		if (UserinfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();

		} else {
			dao = new UserInfoMSsqlDao();

		}
		

		UserInfoMysqlDao dao1 = new UserInfoMysqlDao();
		dao1.insertUserInfo(userInfo);
		dao1.updateUserInfo(userInfo);
		dao1.deleteUserInfo(userInfo.getUserName());
		dao1.selectUserInfo(userInfo.getUserName());

	} // end of class
} // end of main
