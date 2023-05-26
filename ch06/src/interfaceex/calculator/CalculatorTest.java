package interfaceex.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// 인ㅇ터페이스는 객체 생성안됨
		//Calculator calc = new Calculator();
		
		//MyCalculator 로 객체 생성
		MyCalculator calc = new MyCalculator();
		
		int x = 10, y =0;
		
		System.out.println(calc.add(x, y));
		System.out.println(calc.subtract(x, y));
		System.out.println(calc.times(x, y));
		System.out.println(calc.divide(x, y));

	}

}
