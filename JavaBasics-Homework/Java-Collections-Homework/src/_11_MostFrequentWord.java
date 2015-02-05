import java.util.Collections;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] text = input.nextLine().toLowerCase().split("\\W+");
		TreeMap<String, Integer> words = new TreeMap<String, Integer>();
		for (String str : text) {
			Integer count = words.get(str);
			if (count == null) {
				count = 0;
			}
			words.put(str, count + 1);
		}
		Integer mostFrequentWord = Collections.max(words.values());
		for (Entry<String, Integer> entry : words.entrySet()) {
			if (entry.getValue() == mostFrequentWord) {
				System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
			}
		}
	}

}
