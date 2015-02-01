import java.text.ParseException;
import java.util.Scanner;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		String strDate1 = input.nextLine();
		String strDate2 = input.nextLine();
		DateTimeFormatter dateStringFormat = DateTimeFormat.forPattern("dd-MM-yyyy");
		DateTime date1 = dateStringFormat.parseDateTime(strDate1);
        DateTime date2 = dateStringFormat.parseDateTime(strDate2);
        int days = Days.daysBetween(date1, date2).getDays(); 
		System.out.println(days);
	}
}
