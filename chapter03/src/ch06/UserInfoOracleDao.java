package ch06;

public class UserInfoOracleDao implements IUserinfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Oracle: 저장 기능 호출");
		System.out.println("사용자 이름으로 저장 기능 호출: " + userInfo);

	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Oracle: 수정 기능 호출");
		System.out.println("사용자 이름으로 수정 기능 호출: " + userInfo);

	}

	@Override
	public void deleteUserInfo(String userName) {
		System.out.println("Oracle: 삭제 기능 호출");
		System.out.println("사용자 이름으로 삭제 기능 호출: " + userName);

	}

	@Override
	public void selectUserInfo(String userName) {
		System.out.println("Oracle: 선택 기능 호출");
		System.out.println("사용자 이름으로 선택 기능 호출: " + userName);

	}

}
