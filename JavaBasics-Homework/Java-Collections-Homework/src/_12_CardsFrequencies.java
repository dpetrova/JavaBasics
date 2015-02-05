import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Scanner;


public class _12_CardsFrequencies {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split("\\W+");
		LinkedHashMap<String, Integer> cards = new LinkedHashMap<>();
		for (String card : input) {
			Integer count = cards.get(card);
			if (count == null) {
				count = 1;
			}
			else {
				count += 1;
			}
			cards.put(card, count);
		}
		for (Entry<String, Integer> entry : cards.entrySet()) {
			double frequency = (double)entry.getValue() / input.length * 100;
			System.out.printf("%s -> %.2f%%\n", entry.getKey(), frequency);
		}

	}

}
