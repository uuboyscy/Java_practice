import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		String[] d = {"Sun", "Mon", "Tue", "Wed", "Tur", "Fri", "Sat" };
		
		System.out.println(today);
		
		Date today2 = new Date();
		System.out.println(today2);
		
		System.out.println(today.getTime());

		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		int day_of_week = today.get(Calendar.DAY_OF_WEEK)-1;
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		System.out.printf("Today is %d/%02d/%02d.\n", year, month, day);
		System.out.printf("Today is %s.\n", d[day_of_week]);
		System.out.printf("Time is %d:%02d:%02d.\n", hour, minute, second);
		
		String wdays = "��@�G�T�|����";
		System.out.printf("Today is %c.\n", wdays.charAt(day_of_week));
		
		System.out.println("\n----------------\n");
		
		SimpleDateFormat dd = new SimpleDateFormat("hh:mm:ss");
		System.out.println("Time is " + dd.format(today.getTime()) + ".");
		
		
	} // end of main

} // end of class