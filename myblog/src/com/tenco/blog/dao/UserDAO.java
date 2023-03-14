package com.tenco.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.blog.dto.UserDTO;
import com.tenco.blog.utils.DBHelper;

public class UserDAO implements IUserDAO {
	/**
	 * User와 관련된 DB서버 연결 로직 처리
	 * 
	 */

	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();

	}

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	@Override
	// 사용자 정보를 저장 시키는 기능
	public int saveUser(UserDTO user) {
		String query = "insert into user(username, password, email, address, createDate)" + "values(?,?,?,?,now());";
		int resultRow = 0;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			pstmt.executeUpdate(); // insert, update, delete 시 사용
		} catch (SQLException e) {
			System.out.println(" >> saveUser 함수에서 오류 발생 << ");
			e.printStackTrace();
		}
		return resultRow;

	}

	@Override
	// 사용자 정보를 아이디와 비번 값을 확인해 찾는 기능
	public UserDTO selectUserByUsernameAndPassword(String username, String password) {
		UserDTO resultUser = null;

		String query = "SELECT * " + " FROM user " + " WHERE username = ?" + "	AND password = ? ";
		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while (rs.next()) {
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
