package abstractex.Phone;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner); // 부모생성자 상속
	}
	
	public void internetSerach() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
