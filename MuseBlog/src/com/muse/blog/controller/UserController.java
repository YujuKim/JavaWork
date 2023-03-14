package com.muse.blog.controller;

import com.muse.blog.dto.UserDTO;
import com.muse.blog.service.UserService;

public class UserController {
	private UserService userService;

	public UserController() {
		userService = new UserService();
	}

	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에선 회원가입이 안 됩니다";
		if(host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;
	}
}
