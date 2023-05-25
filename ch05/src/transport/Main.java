package transport;

public class Main {

	public static void main(String[] args) {
		// 사람객체 생성

		Person p1 = new Person("조혜원", 10000);
		Person p2 = new Person("김이나", 5000);
				
		//버스 객체생성
		Bus bus740 = new Bus("bus740");
	
		// 택시객체생성
		Taxi taxi1 = new Taxi("taxi1");
		
		
		p1.take(bus740, 1300);		
		p2.take(taxi1, 4800);
		
		p1.showInfo();
		p2.showInfo();
		
		System.out.println();
		
		bus740.showInfo();
		System.out.println();
		taxi1.showInfo();
		
		
		
		
	}

}
