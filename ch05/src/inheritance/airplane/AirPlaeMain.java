package inheritance.airplane;

public class AirPlaeMain {

	public static void main(String[] args) {
		// SuperSonicAirplane 객체생성
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff();
		sa.fly();
		
		// 초음속비행
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		
		// 비행모드
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly();
		
		sa.land();
		

	}

}
