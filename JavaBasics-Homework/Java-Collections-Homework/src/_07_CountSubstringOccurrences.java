import java.util.Scanner;


public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		String subStr = input.nextLine().toLowerCase();
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.substring(i, text.length()).startsWith(subStr)) {
				count++;
			}
		}
		System.out.println(count);
			
	}

}
