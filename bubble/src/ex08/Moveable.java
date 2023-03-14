package ex08;

public interface Moveable {
	public abstract void left();

	public abstract void right();

	public abstract void up();

	// default문법 사용해보기
	// 후크 메서드와 같다. (구현부만 있고 로직은 없다.)
	// Moveable 인터페이스를 구현하는 클래스에서 필요하다면 재정의해서 사용
	default public void down() {};

}
