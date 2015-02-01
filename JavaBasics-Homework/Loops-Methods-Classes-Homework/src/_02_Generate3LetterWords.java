import java.util.Scanner;

public class _02_Generate3LetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] arr = input.next().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					String combination = "" + arr[i] + arr[j] + arr[k];
					System.out.print(combination + " ");
				}
			}
		}
	}
}
