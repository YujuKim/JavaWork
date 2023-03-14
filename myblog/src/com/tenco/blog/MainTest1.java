package com.tenco.blog;

import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest1 {

	public static void main(String[] args) {

		// 회원가입 진행을 mysql 서버까지 보내야 한다
		UserDTO userDTO = new UserDTO("코코", "1234", "coco@nate.com", "부산");

		UserController userController = new UserController();
//		
//		String result = userController.requestSignUp(userDTO, "localhost");
//		System.out.println(result);

		// 로그인 요청
		// 아이디, 비밀번호
		UserDTO responseUser = userController.requestsignIn(userDTO.getUsername(), userDTO.getPassword());
		System.out.println("결과값 확인: " + responseUser);
		if (responseUser == null) {
			System.out.println("로그인 실패");
		} else {
			System.out.println("로그인 성공");
		}
	}

}
