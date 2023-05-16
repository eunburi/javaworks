package operator;

public class Operator3 {

	public static void main(String[] args) {
		// 조건연산자 - 비교문 ? 참 : 거짓
		boolean bool = (5 > 3) ? true : false;
		// char ch = (5 > 3) ? 'T' : 'F';
		
		System.out.println(bool);
		//System.out.println(ch);
		
		//부모님의 나이 비교
		int fartherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fartherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);

	}

}
