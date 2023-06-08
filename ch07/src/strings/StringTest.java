package strings;

public class StringTest {

	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		//객체의 메모리주소 확인 : System.indentifyHashCode()
		System.out.println(javaStr);
		//주소를 보자!
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(javaStr));
		
		System.out.println(androidStr);
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(androidStr));
		
		// 문자열 연결 - contact() 사용 -> 메모리 주소가 처음과 바뀜
		// 내부에 변경 불가능한 final char[] 변수를 가지고 있음
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("연결한 주소값 : " + System.identityHashCode(javaStr));
		
		
		
	}

}
