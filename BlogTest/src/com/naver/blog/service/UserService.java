package com.naver.blog.service;

import com.naver.blog.dao.UserDAO;
import com.naver.blog.dto.UserDTO;

public class UserService {
	private UserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}
	// 사용자와 관련된 로직들을 처리

	// 회원 가입 로직 처리
	public String signUp(UserDTO user) {

		String msg = "";
		user.setUserRole("USER");
		int resultRow = userDAO.saveUser(user);
		return resultRow + "";
	}

}
