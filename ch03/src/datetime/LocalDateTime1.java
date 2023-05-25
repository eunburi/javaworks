package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime1 {

	public static void main(String[] args) {
		// TODO LocalDate - 날짜,LocalTime-시간, LocalDateTime - 날짜와 시간
				
		//날짜
		LocalDate date = LocalDate.now();
		System.out.println("날짜 : " + date);

		//시간
		LocalTime time = LocalTime.now();
		System.out.println("시간 : " +time);
		
		//날짜와 시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println("날짜와 시간 : " +now);;
		
		//날짜와 시간 형식 - DateTimeFormatter
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		String current_time =now.format(datetime);
		System.out.println("날짜,시간형식 : " +current_time);
		
		
		
	}
	

}
