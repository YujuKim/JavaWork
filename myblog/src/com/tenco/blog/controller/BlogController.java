package com.tenco.blog.controller;

import com.tenco.blog.service.BlogService;

public class BlogController {

	private BlogService blogService;

	public BlogController() {
		blogService = new BlogService();
	}

	// 블로그 글쓰기 기능 요청
	public int reqSaveBoard(String title, String content, int userId) {
		if(title.equals(content))
		// 방어적 코드
		if (userId != 0) {
			blogService.saveBoard(title, content, userId);
		}
		return 0;
	}
	
	 // 게시글 삭제 요청 받기
//	public void requestBoardDelete(int boardId, int userId) {
//		blogService 
//		
//	}

}
