import java.util.Locale;
import java.util.Scanner;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT); // regional settings
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for (int i = 0; i < number; i++) {
			double value = input.nextDouble();
			String measure = input.next();
			angleUnitConverter(value, measure);
			
		}
	}

	private static void angleUnitConverter(double value, String measure) {
		switch (measure) {
		case "deg": 
			System.out.printf("%.6f rad", Math.toRadians(value)); //rad = deg * pi / 180
			break;
		case "rad":
			System.out.printf("%.6f deg", Math.toDegrees(value)); //deg = rad * 180 / pi
			break;
		}
		System.out.println();
	}
}
