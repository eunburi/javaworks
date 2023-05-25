package chapter04;

public class Test4_2 {

	public static void main(String[] args) {
		//2번
		
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("3의 배수의 합은 : " + sum);
		
		//3번
		while(true) {
			int num1 = (int)(Math.random() * 6) +1;
			int num2 = (int)(Math.random() * 6) +1;

			System.out.println("(" + num1 + ", " + num2 + ")");
			if((num1 + num2 == 5)) {
				break;
			}
		}
		
		
		//5번
		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("☆");
				if (j==i) {
					System.out.println();
				}
			}
		}
		
		//6번
		for(int i=0; i<4; i++) {
			for(int j=3; j>=0; j--) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
				System.out.print("*");}
			}System.out.println();
		}
		
		
		
		
		
		
	}

}
