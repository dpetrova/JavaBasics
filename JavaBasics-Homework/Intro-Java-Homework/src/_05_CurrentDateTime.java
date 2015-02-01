import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _05_CurrentDateTime {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now(); // Instantiate a Date object
		DateTimeFormatter formatting = 
				DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a"); //format date
		System.out.println(date.format(formatting)); // display date and time
	}

}