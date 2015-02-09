import java.util.Scanner;


public class _01_VideoDurations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int allMinutes = 0;
		while (true) {
			String line = input.nextLine();
			if (line.equals("End")) {
				break;
			}
			String[] tokens = line.split(":");
			int hours = Integer.parseInt(tokens[0]);
			int minutes = Integer.parseInt(tokens[1]);
			allMinutes += hours * 60 + minutes;
		}
		int durationHours = allMinutes / 60;
		int durationMinutes = allMinutes % 60;
		System.out.printf("%d:%02d\n",durationHours, durationMinutes);

	}

}
