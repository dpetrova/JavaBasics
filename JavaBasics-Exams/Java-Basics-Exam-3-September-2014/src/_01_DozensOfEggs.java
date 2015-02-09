import java.util.Scanner;


public class _01_DozensOfEggs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int allEggs = 0;
		String input= scn.nextLine();
		while (! input.equals("")) {
			String[] eggs = input.split(" ");
			int count = Integer.parseInt(eggs[0]);
			String measure = eggs[1];
			if (measure.equals("eggs")) {
				allEggs += count;
			}
			else if (measure.equals("dozens")) {
				allEggs += count * 12;
			}
			input = scn.nextLine();
		}
		int dozen = allEggs / 12;
		int singleEggs = allEggs % 12;
		System.out.printf("%d dozens + %d eggs\n", dozen, singleEggs);

	}

}
