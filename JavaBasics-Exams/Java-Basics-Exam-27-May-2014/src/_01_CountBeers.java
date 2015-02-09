import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Scanner;


public class _01_CountBeers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		int allBeers = 0;
		while (! input.equals("End")) {
			String[] token = input.split(" ");
			int count = Integer.parseInt(token[0]);
			String measure = token[1];
			if (measure.equals("beers")) {
				allBeers += count;
			}
			else if (measure.equals("stacks")) {
				allBeers += count * 20;
			}
			input = scn.nextLine();
		}
		int stacksBeers = allBeers / 20;
		int singleBeers = allBeers % 20;
		System.out.printf("%d stacks + %d beers\n", stacksBeers, singleBeers);

	}

}
