import java.util.HashSet;
import java.util.Scanner;


public class _01_CognateWords {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] words = scn.nextLine().split("[^a-zA-Z]+");
		boolean isFound = false;
		HashSet<String> cognateWords = new HashSet<>();
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (i == j) {
					continue;
				}
				for (int k = 0; k < words.length; k++) {
					String str1 =words[i] + words[j];
					String str2 = words[k];
					if (str1.equals(str2)) {
						cognateWords.add(words[i] + "|" + words[j] + "=" + words[k]);
						isFound = true;
					}
				}
			}
		}
		if (isFound) {
			for (String string : cognateWords) {
				System.out.println(string);
			}
		}
		else {
			System.out.println("No");
		}

	}

}
