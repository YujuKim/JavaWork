package ch09;

public class Book {
	private int totalPage;
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;

	}

	public Book(int totalPage, String title, String author) {
		this(title, author);
		this.totalPage = totalPage;

	}

	public int getTotalPage() {
		return this.totalPage; // this. 생략 가능
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void showInfo() {
		System.out.println(">>> 책정보 <<<");
		System.out.println("제목: " + title);
		System.out.println("저자: " + author);
	}
	


}
