package abstractex.Phone;

public class PhoneTest {

	public static void main(String[] args) {
		
		// 추상클래스는 객체 생성이 안됨
		//Phone phon = new Phone();
		
		// 스마트폰 객체 생성
		SmartPhone smartPhone = new SmartPhone("이지은");
		
		smartPhone.powerOn();
		smartPhone.internetSerach();
		smartPhone.powerOff();

	}

}
