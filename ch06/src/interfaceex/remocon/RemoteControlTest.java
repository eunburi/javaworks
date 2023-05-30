package interfaceex.remocon;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		
		
		//부모 타입으로 형 변환
		RemoteControl rcTV = new Television();
		RemoteControl rcAd = new Audio();
		
		rcTV.turnOn();
		rcTV.setVolume(15);
		
		System.out.println("*__________________*");
		
		rcTV.setMute(true); // 무음 처리
		rcTV.setMute(false); // 무음 해제
		
		RemoteControl.changeBattery(); //인터페이스 이름으로 직접 접근
		
		System.out.println("*__________________*");
		
		rcTV.turnOff();
		
		System.out.println();
		
		System.out.println("[오디오] >>>>>");
		
		rcAd.turnOn();
		rcAd.turnOff();
		rcAd.setMute(true);
		rcAd.setMute(false);
		
		RemoteControl.changeBattery();
		

	}

}
