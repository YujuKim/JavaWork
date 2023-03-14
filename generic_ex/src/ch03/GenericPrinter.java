package ch03;

// how
// why
public class GenericPrinter<T> {
	// T라는 대체 문자를 사용한다. E:element, K:key, V:value (아무거나 다 가능)
	
	// 제네릭 자료형. T자료형으로 선언한 변수 material
	private T material;
	
	// 제네릭 메서드-T자료형을 반환하는 제네릭 메서드
	// T타입의 값 material을 반환
	public T getMaterial() {
		return material;
	}
	// T타입의 값을 멤버 변수 material에 대입
	public void setMaterial(T material) {
		this.material = material;
	}

}
