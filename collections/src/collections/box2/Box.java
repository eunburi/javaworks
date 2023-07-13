package collections.box2;

//제네릭(Generic)클래스 
public class Box {
	
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	public Object get() {
		return obj;
	}
}
