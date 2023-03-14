package ch07;

//	Object클래스
// 자바는 단일 상속만 지원하지만
// 모든 클래스의 최상위 클래스 Object클래스는 예외다.

public class Book {
	private int bookId;
	private String title;
	private String author;

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;

	}

	// 코드힌트 살펴보기
	// extends Object키워드를 작성하지 않더라도
	// 컴파일러가 .class 생성 시 자동으로 넣어준다.

	// toString() <-- Object클래스의 메서드
	@Override
	public String toString() {

		return "[ " + this.title + " ]";

	}

	// equals 메서드 재정의하기
	// 책 제목과 작가 이름이 같다면 같은 책이라고 판별해보자
	@Override
	public boolean equals(Object obj) {
		// 만약 외부에서 주입된 값의 title과 author이 같다면 true를 리턴,
		// 아니라면 false를 리턴하자
		// Book이라는 데이터타입만 확인하는 방어적 코드 작성
		if (obj instanceof Book) {
			Book targetBook = (Book) obj;
			if (this.title == targetBook.title && this.author == targetBook.author) {
				System.out.println("같은 책 제목입니다.");
				return true;
			}
		}
		return false;
	}

}
