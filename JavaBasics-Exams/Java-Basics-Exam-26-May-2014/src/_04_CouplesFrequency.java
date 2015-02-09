import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class _04_CouplesFrequency {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		LinkedHashMap<String, Integer> couplesCount = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < input.length - 1; i++) {
			String couple = input[i] + " " + input[i + 1];
			Integer count = couplesCount.get(couple);
			if (count == null) {
				count = 0;
			}
			count++;
			couplesCount.put(couple, count);
		}
		for (Entry<String, Integer> entry : couplesCount.entrySet()) {
			double frequency = (double)entry.getValue() / (input.length - 1) * 100;
			System.out.printf("%s -> %.2f%%\n", entry.getKey(), frequency);
		}

	}

}
