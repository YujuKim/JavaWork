package ch05;

public class UserInfoMSsqlDao implements IUserinfoDao {

	// DB연결 영역에선 코드 작성, 질의 생성, 결과 집합
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL: 저장 기능 호출");
		System.out.println("사용자 이름으로 저장 기능 호출: " + userInfo);

	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL: 수정 기능 호출");
		System.out.println("사용자 이름으로 수정 기능 호출: " + userInfo);

	}

	@Override
	public void deleteUserInfo(String userName) {
		System.out.println("MSSQL: 삭제 기능 호출");
		System.out.println("사용자 이름으로 삭제 기능 호출: " + userName);

	}

	@Override
	public void selectUserInfo(String userName) {
		System.out.println("MSSQL: 조회 기능 호출");
		System.out.println("사용자 이름으로 조회 기능 호출: " + userName);

	}
	// DAO --> 사용자측(앞단)에서 던져 준 데이터를 갖고 DB에 값을 밀어넣는 기능
}
