package ch06;

public interface IUserinfoDao {
	void insertUserInfo(UserInfo userInfo);

	void updateUserInfo(UserInfo userInfo);

	void deleteUserInfo(String userName);

	void selectUserInfo(String useName);

}
