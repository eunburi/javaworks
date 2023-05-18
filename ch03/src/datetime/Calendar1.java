package datetime;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		// Calendar 클래스 사용
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getCalendarType());
		
		// 날짜 - 월에 1을 더해줌(1월-0번 인덱스)
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		//월이 10미만이면 두자리 문자로 표기하며 아니면 그대로 표기함
		String strMonth = (month <10) ? ("0"+month)  : ("" + month);
		int date = cal.get(Calendar.DATE);
		String strDate = (date <10) ? ("0" + date)  : ("" + date);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		
		//시간
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		String strMinute = (minute <10) ? ("0"+minute)  : ("" + minute);
		int second = cal.get(Calendar.SECOND);
		String strSecond = (second <10) ? ("0"+second)  : ("" + second);
		
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		System.out.printf("%d년 %s월 %s일\n", year,strMonth,strDate);
		System.out.printf("%d시 %d분 %d초\n", hour,strMinute,strSecond);
		
		//요일 : 1-일, 2-월, 3-화 4-수, 5-목, 6-금, 7-토
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		String[] days = new String[]{"일","월","화","수","목","금","토"};
			
		System.out.println("오늘은 " + days[day-1] + "요일입니다~ ");

	}

}