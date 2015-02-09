import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.DateFormatter;


public class _01_Timespan {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		String[] start = input.nextLine().split(":");
		String[] end = input.nextLine().split(":");
		long secondsSpan = calculateTotalSecond(start) - calculateTotalSecond(end);
		long sec = secondsSpan % 60;
		long min = (secondsSpan % 3600) / 60;
		long hour = secondsSpan / 3600;
		System.out.printf("%d:%s:%s", 
				hour, 
				min < 10 ? "0" + min : "" + min, 
				sec < 10 ? "0" + sec : "" + sec);	

		
	}

	private static long calculateTotalSecond(String[] str) {
		long hours = Long.parseLong(str[0]);
		long minutes = Long.parseLong(str[1]);
		long seconds = Long.parseLong(str[2]);
		long totalSec = seconds + minutes * 60 + hours * 3600;
		return totalSec;
	}

}
