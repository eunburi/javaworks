package abstractex.car;

public class CarMain {

	public static void main(String[] args) {
		//부모타입으로 bus객체 생성(자동  형변환)
		Car car = new Bus();
		
		car.run();
		car.refuel();
		
		System.out.println("******************");
		
		//부모 타입으로 truck 객체 생성(자동형변환)
		Truck truck = new Truck();
		
		truck.run();
		truck.refuel();
		truck.load();
		
		System.out.println();
		
		// 다운캐스팅 (강제 형 변환 - instanceof)
		if(car instanceof Bus) {
			Bus bus = (Bus)car;
			bus.takePassenger();
		}

	}

}
