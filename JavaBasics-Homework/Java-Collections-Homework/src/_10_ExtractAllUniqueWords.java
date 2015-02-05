import java.util.Scanner;
import java.util.TreeSet;


public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().toLowerCase().split("\\W+");
		TreeSet<String> words = new TreeSet<String>();
		for (String word : input) {
			words.add(word);
		}
		//System.out.println(words);
		for (String word : words) {
			System.out.print(word + " ");
		}
	}

}
