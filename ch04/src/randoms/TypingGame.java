package randoms;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		String[] words = {"river","mountain","sky","earth","moon",
				"tree","flower","cow","pig","horse"};
		
		int n = 1; //문제번호
		double start, end;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("영어타자게임, 준비되면 엔터를 누루세요!!");
		scan.nextLine(); //엔터 
		start = System.currentTimeMillis(); //게임시작 시간측정
		while(n<11) {
			int rand = (int)(Math.random()*words.length);
			System.out.println("문제" + n);
			String question = words[rand];
			System.out.println(question);
			
			String answer = scan.nextLine();
			if(answer.equals(question)) {
				System.out.println("통과!");
				n++;
			}else {
				System.out.println("오타! 재도전!");
			}
		}
		end = System.currentTimeMillis();
		System.out.println("게임소요시간은" + (end-start)/1000 + "초입니다.");
		scan.close();
		

	}

}
