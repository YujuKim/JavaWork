package com.muse.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.muse.blog.dto.UserDTO;
import com.muse.blog.utils.DBHelper;

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
		String query = "insert into user(username, password, email, address, createDate)\" + \"values(?,?,?,?,now());";
		int resultRow = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
		} catch (SQLException e) {
			System.out.println(" >> saveUser함수에서 오류 발생");
			e.printStackTrace();
		}
		return resultRow;

	}

	@Override
	public UserDTO selectUserByUsernameAndPassword(String username, String password) {
		UserDTO resultUser = null;

		String query = "SELECT * \" + \" FROM user \" + \" WHERE username = ?\" + \"	AND password = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUsername(rs.getString("username"));
				dto.setEmail(rs.getString("email"));
				resultUser = dto;
			}
		} catch (SQLException e) {
			System.out.println(">> userDAO 회원찾기 시 에러 발생 <<");
			e.printStackTrace();
		}

		return resultUser;
	}

}
