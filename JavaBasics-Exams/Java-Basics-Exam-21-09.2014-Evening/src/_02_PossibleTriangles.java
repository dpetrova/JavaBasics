import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;


public class _02_PossibleTriangles {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scn = new Scanner(System.in);
		String line = scn.nextLine();
		boolean possible = false;
		while(!line.equals("End")) {
			String[] nums = line.split(" ");
			BigDecimal[] sides = new BigDecimal[nums.length];
			for (int i = 0; i < sides.length; i++) {
				sides[i] = new BigDecimal(nums[i]);				
			}
			Arrays.sort(sides);
			if (sides[0].add(sides[1]).compareTo(sides[2]) > 0) {
				System.out.printf("%.2f+%.2f>%.2f\n", sides[0], sides[1], sides[2]);
				possible = true;
			}
			line = scn.nextLine();
		}
		if (!possible) {
			System.out.println("No");
		}

	}

}
