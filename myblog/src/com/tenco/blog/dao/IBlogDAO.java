package com.tenco.blog.dao;

public interface IBlogDAO {

	int save(String title, String content, int userId);

	void select();

	void update();

	void delete();

	void delete(int boardId, int userId);

	void delete(int boardId);

}
