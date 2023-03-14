package com.naver.blog.controller;

import com.naver.blog.service.UserService;
import com.naver.blog.dto.UserDTO;

public class UserController {

	private UserService userService;

	public UserController() {
		userService = new UserService();
	}

	public String requestSignUp(UserDTO userDTO) {
		
		return userService.signUp(userDTO);

	}

}
