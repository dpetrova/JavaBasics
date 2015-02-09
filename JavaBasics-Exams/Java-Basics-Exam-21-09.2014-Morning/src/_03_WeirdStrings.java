import java.util.Scanner;


public class _03_WeirdStrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		input = input.replaceAll("[ \\/()|]+", "");
		//input = input.replace("\\", "").replace("/", "").replace("(", "")
					//.replace(")", "").replace("|", "").replace(" ", "");
		String[] words = input.split("[^a-zA-Z]+");
		int biggestSum = 0;
		String firstWord = "";
		String secondWord = "";
		for (int i = 0; i < words.length - 1; i++) {
			int summedWeight = calculateWeight(words[i]) + calculateWeight(words[i + 1]);
			if (summedWeight >= biggestSum) {
				biggestSum = summedWeight;
				firstWord = words[i];
				secondWord = words[i + 1];
			}
		}
		System.out.println(firstWord);
		System.out.println(secondWord);
		

	}

	private static int calculateWeight(String word) {
		int weight = 0;
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++) {
			weight += word.charAt(i) % 96;
		}
		return weight;
	}

}
