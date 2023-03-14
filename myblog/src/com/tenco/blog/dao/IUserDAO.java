package com.tenco.blog.dao;

import com.tenco.blog.dto.UserDTO;

public interface IUserDAO {

	int saveUser(UserDTO user);

	UserDTO selectUserByUsernameAndPassword(String username, String password);
	

}
