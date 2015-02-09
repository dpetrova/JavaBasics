import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;


public class _02_ThreeLargestNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		ArrayList<BigDecimal> numbers = new ArrayList<BigDecimal>();
		for (int i = 0; i < count; i++) {
			numbers.add(input.nextBigDecimal());
		}
		Collections.sort(numbers, Collections.reverseOrder());
		int counter = 0;
		for (int i = 0; i < numbers.size() && counter < 3; i++, counter++) {
			System.out.println(numbers.get(i).toPlainString());
		}

	}

}
