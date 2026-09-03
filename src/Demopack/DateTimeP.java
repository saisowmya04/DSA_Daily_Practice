package Demopack;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeP {

	public static void main(String[] args) {
		//returns current date and time
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		//returns same time tomorrow
		LocalDateTime tmr=dateTime.plusDays(1);
		System.out.println(tmr);
		
		//returns nextweek's same time
		LocalDateTime nextweek=dateTime.plusWeeks(1);
		System.out.println(nextweek);
		
		//returns nextmonth's same date and time
		LocalDateTime nextmonth=dateTime.plusMonths(1);
		System.out.println(nextmonth);
		System.out.println("Year: "+dateTime.getYear());
		System.out.println("Month: "+dateTime.getMonth());
		System.out.println("Week: "+dateTime.getDayOfWeek());
		System.out.println("Day: "+dateTime.getDayOfMonth());
		System.out.println("Hour: "+dateTime.getHour());
		System.out.println("Minute: "+dateTime.getMinute());
		System.out.println("Seconds: "+dateTime.getSecond());
		System.out.println("Nanoseconds: "+dateTime.getNano());
		
		
		//time
		LocalTime t=LocalTime.now(); // returns current time
		System.out.println(t);
		
		//set date and time
		LocalTime t2=LocalTime.of(6, 31);
		System.out.println(t2);
		
		LocalDate dt=LocalDate.of(1993, 4, 16);
		System.out.println(dt);
		
		
		/*
		 * DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-mm-yyyy");
		 * System.out.println(f); String result=dt.format(f);
		 * System.out.println(result);
		 */
		 
		//between
		LocalDate bdyDate=LocalDate.of(2005, 12, 11);
		LocalDate tdyDate=LocalDate.now();
		Period p=Period.between(bdyDate, tdyDate);
		System.out.println(p.getYears()+" "+p.getMonths()+" "+p.getDays());
		
		
		//zone
		ZonedDateTime india=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(india);
		
		ZonedDateTime usa=ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(usa);
		
		
		/*
		 * ZonedDateTime england=ZonedDateTime.now(ZoneId.of("England/London"));
		 * System.out.println(england);
		 */
		 
		
		//year
		LocalDateTime idDateTime=LocalDateTime.now();
		System.out.println(idDateTime); //returns current date and time with seconds and nanoseconds 
		
		
	}

}
