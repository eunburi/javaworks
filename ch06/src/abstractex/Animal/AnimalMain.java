package abstractex.Animal;

public class AnimalMain {

	public static void main(String[] args) {
		//고양이 객체 생성
		//Cat cat = new Cat();
		//부모타입으로 객체생성(다형성)
		
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.breathe();
		//cat.sound();
		cat.showInfo();
		
		System.out.println("*______________*");
		
		//dog.sound();
		
		//animalSound()호출
		animalSound(cat);
		animalSound(dog);
	}
	
	//매개변수의 다형성	
	private static void animalSound(Animal animal) {
		animal.sound();
	}

}
