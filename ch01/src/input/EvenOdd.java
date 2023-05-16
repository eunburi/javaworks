package input;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		//짝수 홀수 판별프로그램
		// 예외 프로그램 실행시 오류
		// try ~ catch구문
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("숫자입력 : ");
			int num = scan.nextInt(); //키보드에서 숫자 입력
			
			//String result = ((num % 2 == 0) ? "짝수":"홀수");
			
			String result = "";
			if(num % 2 == 0) {
				result = "짝수입니다.";
			}else {
				result = "홀수입니다.";
			}
			
			System.out.println(result);
		
			scan.close();
		}catch(Exception e) {
			System.out.println("숫자를 입력해주세요");
		}
		
		
	}

}
