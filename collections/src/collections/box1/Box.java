package collections.box1;

//제네릭(Generic) 클래스 사용
public class Box<T> {
	private T type;
	
	public void set(T type) {
		this.type = type;
	}
	
	public T get() {
		return type;
	}

}
