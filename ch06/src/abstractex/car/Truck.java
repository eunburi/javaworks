package abstractex.car;

public class Truck extends Car{
	
	public void load() {
		System.out.println("트럭이 짐을 싣습니다.");
	}
	
	
	@Override
	public void run() {
		System.out.println("트럭이 달립니다~");
		
	}

	@Override
	public void refuel() {
		System.out.println("트럭이 기름을 주유합니다.");
		
	}

}
