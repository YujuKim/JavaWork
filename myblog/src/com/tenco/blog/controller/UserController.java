package com.tenco.blog.controller;

import com.tenco.blog.dto.UserDTO;
import com.tenco.blog.service.UserService;

// main --> UserController
public class UserController {
	private UserService userService;
	
	// 외부에서 요청한 일을 수행하고 결과를 리턴한다.
	public UserController() {
		userService = new UserService();
	}


	// 사용자 정보를 받아 회원 가입 처리를 한다.
	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에서는 회원가입이 안 됩니다.";
		if (host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;
	}

	public UserDTO requestsignIn(String username, String password) {
		UserDTO  responseUserDTO = userService.checkUser(username, password);
		return responseUserDTO;

	}
}
