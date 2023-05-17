package whileexample;

import java.util.Scanner;

public class SeatLayout {

	public static void main(String[] args) {
		// 입장객 수에 따른 열과 줄 수 계산하기
		Scanner sc = new Scanner(System.in);
		int customer; // 입장객 수 저장
		int colNum; // 좌석 열 수 저장
		int rowNum; // 줄(행)의 수 저장
		
		System.out.print("입장객 수 입력 : ");
		customer = sc.nextInt();
		
		System.out.print("좌석 열 수 입력 : ");
		colNum = sc.nextInt();	
		
		// 연산처리(조건문) - 나누어 떨어지는 경우, 줄수에 1을 더하는 경우
		
		if(customer % colNum == 0) {
			rowNum = customer / colNum; //나누는 몫
		}else{
			rowNum = (int)(customer / colNum)+1;  //몫 +1
		}
		
		
		System.out.println(rowNum + "개의 줄이 필요합니다.");
		
		sc.close();
	

			
		for(int i=0; i<rowNum; i++) {
			for(int j=1; j<=colNum; j++) {
				int num =colNum*i+j;
				if(num> customer)
					break;
				System.out.print("좌석" + num + " ");
		}
			System.out.println();
		}
	}

}
