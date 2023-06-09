package methods;

public class Random1 {

	public static void main(String[] args) {
		// Math.random() 사용
		// 주사위를 10번 던지기
		
		/*for(int i = 1; i<=10; i++) {
		int dice = (int)(Math.random()*6) + 1;
		System.out.println(dice);
		
		}*/

		// 문자를 난수(무작위 수)로 추출하기
		String[] word = {"나","너","우리","세계"};
		int rnd = (int)(Math.random()*word.length);
		System.out.println(rnd);
		System.out.println(word[rnd]);
		
		
		
		//로또 복권 추첨
		//번호 6개 젖아할 배열 선언
		int[] lotto = new int[6];
		
		//로또번호저장
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) +1;
			// 중복문제 발생
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) { // 이전 번호와 일치하면
					i--; // 이전 인덱스로 이동 - 다시 추첨  
			}
			
			
		}
		}		
		
		// 디버깅
		
		/*
		 * 29 24 31 31 15 16
		 * 
		 * i=0 lotto[0]
		 * i=1 lotto[1]==lotto[0] fasle 29,24
		 * i=2 lotto[2]==lotto[1] fasle 29,24,31
		 * i=3 lotto[3]==lotto[2] true 29,24,31(중복)
		 * i=3 lotto[3]==lotto[2] fasle 29,24,31, 25(재할당)
		 * i=4 lotto[4]==lotto[3] fasle 29,24,31,25,15
		 * i=5 lotto[5]==lotto[4] fasle 29,24,31,25,15,16
		 * 
		 */

	
		//로또번호출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
