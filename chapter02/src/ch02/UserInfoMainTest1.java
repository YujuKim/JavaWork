package ch02;

public class UserInfoMainTest1 {

	public static void main(String[] args) {
		UserInfo user1 = new UserInfo("orange1","오렌지","1234-5678");
		System.out.println(user1.userId);
		System.out.println(user1.userName);
		System.out.println(user1.phone);
		
		UserInfo user2 = new UserInfo("banana1","바나나");
		System.out.println(user2.userId);
		System.out.println(user2.userName);
		
		UserInfo user3 = new UserInfo("apple1");
		System.out.println(user3.userId);
		
		UserInfo user4 = new UserInfo();
		System.out.println(user4.userId);

	} // end of main

} // end of class
