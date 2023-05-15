package var;

public class IntLongTyp {

	public static void main(String[] args) {
		// int - 4byte : 32bit
		int iNum = 1234567890;
		
		System.out.println(iNum);

		//long 자료형(8byte-64bit)은 int와 구분하기 이해 끝에 'L','l'을 붙임
		long lNum = 12345678900L;
		
		System.out.println("int형 :" + iNum);
		System.out.println("long형 : " + lNum);
		
		
	}

}
