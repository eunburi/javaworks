package interfaceex.tire;

public class Car2 {
	//필드 - 객체배열
	Tire[] tires = {
			new HanTire(),	 // 0번 위치
			new HanTire(),   // 1번 위치
			new KumTire(),	 // 2번위치
			new KumTire()	 // 3번 위치
			
	};
	
	// 메서드
	public void run() {
		for(int i=0; i<tires.length; i++)
			tires[i].roll();
		}
		
		/*for(Tire tire : tires) {
			tire.roll();}
		}*/
	
	
	
	
}
