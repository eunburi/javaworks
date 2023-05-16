package operator;

public class Operator2 {

	public static void main(String[] args) {
		// 비교연산 >, <, ==, !=
		int num1 = 7, num2 = 3;
				
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 == num2);	// 같다
		System.out.println(num1 != num2);	//같지않다.
		
		
		// 논리연산
		/*
		  && - 논리곱 (비교대상 모두 true이면 true)
		  || - 논리합 (비교대상 하나만 true 이면 true)
		  ! - 논리부정(비교조건이 true이면 flase)
		  
		 */
		System.out.println((num1 < num2) && (num1 != num2));	//false
		System.out.println((num1 < num2) || (num1 != num2));	//true
		System.out.println(!(num1 != num2));	//false
	}

}
