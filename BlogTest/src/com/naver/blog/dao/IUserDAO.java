package com.naver.blog.dao;

import com.naver.blog.dto.UserDTO;

public interface IUserDAO {
	int saveUser(UserDTO user);

	UserDTO selectUserByUsernameAndPassword(String username, String password);

}
