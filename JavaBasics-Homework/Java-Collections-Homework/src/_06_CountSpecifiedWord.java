import java.util.Scanner;


public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().split("\\W+");
		String targetWord = input.nextLine();
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase(targetWord)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
