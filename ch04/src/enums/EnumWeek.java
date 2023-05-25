package enums;

import java.util.Calendar;


public class EnumWeek {

	public static void main(String[] args) {
		Week today = null; //객체 자료형은 null 초기화
		
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal.get(Calendar,Year));
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		//0-일요일 , 1-월요일, 2-화요일,3-수요일,4목요일-5금요일,6토요일
		//System.out.println(day);
		
		switch(day){
		case 1:
		today = Week.일; break;
			
		case 2:
		today = Week.월; break;
			
		case 3:
		today = Week.화; break;
			
		case 4:
		today = Week.수; break;
				
		case 5:
		today = Week.목; break;
				
		case 6:
		today = Week.금; break;
			
		case 7:
		today = Week.토; break;
				
		}
		
		System.out.println("Today is " + today + "요일입니당~");
		
		
		if(today == Week.일) {
			System.out.println("일요일에는 짜파게티 요리사~");
		}else {
			System.out.println("열심히 프로그램 코딩합니다.");
		}

	}

}
