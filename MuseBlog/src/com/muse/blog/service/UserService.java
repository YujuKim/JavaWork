package com.muse.blog.service;

import com.muse.blog.dao.UserDAO;
import com.muse.blog.dto.UserDTO;

public class UserService {

	private UserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}

	// 회원 가입
	public String signUp(UserDTO user) {
		String msg = "";

		if (user.getUsername().equals("")) {
			msg = "사용자 이름을 입력해주세요";
			System.out.println(msg);
			return msg;
		}
		user.setUserRole("USER");

		int resultRow = userDAO.saveUser(user);
		return resultRow + "";
	}

	// 회원 정보 찾기
	public UserDTO checkUser(String username, String password) {
		boolean isValid = true;
		boolean isFine = false;
		if (username.equals("")) {
			isValid = false;
		} else if (password.equals("")) {
			isValid = false;
		}
		UserDTO userDTO = null;
		if (isValid) {
			userDTO = userDAO.selectUserByUsernameAndPassword(username, password);

		}
		return userDTO;
	}
}
