package com.muse.blog.dao;

import com.muse.blog.dto.UserDTO;

public interface IUserDAO {

	int saveUser(UserDTO user);

	UserDTO selectUserByUsernameAndPassword(String username, String password);
	
}
