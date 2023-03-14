package com.naver.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.naver.blog.dto.UserDTO;
import com.naver.blog.utils.DBHelper;

public class UserDAO implements IUserDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();

	}

	@Override
	public int saveUser(UserDTO user) {
		String query = "insert into blogmember(id, password, name, email)" + "values(?,?,?,?);";
		int resultRow = 0;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, user.getId());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			resultRow = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultRow;

	}

	@Override
	public UserDTO selectUserByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
