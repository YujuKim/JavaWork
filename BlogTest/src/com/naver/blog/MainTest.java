package com.naver.blog;

import com.naver.blog.controller.UserController;
import com.naver.blog.dto.UserDTO;

public class MainTest {

	public static void main(String[] args) {

		UserDTO userDTO = new UserDTO(001, "34567", "쿠키몬스터", "cookies@naver.com");

		UserController userController = new UserController();

		String resultMsg = userController.requestSignUp(userDTO);
		
		System.out.println(resultMsg);
	}

}
