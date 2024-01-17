package Date_Time;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaCurrentDateLocalDateTime {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:MM:SS");
		String finalResult = dtf.format(now);
		System.out.println("Today Date and Time is : " +finalResult);
		
		
		LocalDate date = LocalDate.now();
		System.out.println("Today Date is : "+date);
		
		LocalTime time = LocalTime.now();
		System.out.println("Today Time is : "+time);
		
		  Date dt = new Date(0);
	      SimpleDateFormat dateFormat;
	      dateFormat = new SimpleDateFormat("hh:mm:ss a");
	      System.out.println("Time in 12 hr format = "+dateFormat.format(dt));
	}
}
