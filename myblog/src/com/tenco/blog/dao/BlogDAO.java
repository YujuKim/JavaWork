package com.tenco.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.blog.dto.BlogDTO;
import com.tenco.blog.utils.DBHelper;

public class BlogDAO implements IBlogDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public BlogDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public int save(String title, String content, int userId) {
		int resultRowCount = 0;
		String query = "insert into board(title, content, userId)" + " values(?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, userId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(" >> blogDao save 에서 에러 발생 << ");
			e.printStackTrace();
		}

		return resultRowCount;
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int boardId) {
		String query = "delete from board where id = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardId);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(">> blogDao delete 에러 발생 <<");
			e.printStackTrace();
		}

	}

	public BlogDTO selectByBoardId(int boardId) {
		String query = "select * from board where id = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardId);
			rs = pstmt.executeQuery(); // select는 executeQuery 나머지는 executeUpdate
		} catch (Exception e) {
			System.out.println(">> blogDao select 에러 발생 <<");
			e.printStackTrace();
		}
		return null;

		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int boardId, int userId) {
		// TODO Auto-generated method stub
		
	}

}
