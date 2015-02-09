import java.util.ArrayList;
import java.util.Scanner;


public class _01_MirrorNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] nums = new int[num];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scn.nextInt();
		}
		boolean found = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				String numAsString1 = new StringBuilder(Integer.toString(nums[i]))
																		.toString();
				String numAsString2 = new StringBuilder(Integer.toString(nums[j]))
																.reverse().toString();
				if (numAsString1.equals(numAsString2)) {
					System.out.printf("%d<!>%d\n", nums[i], nums[j]);
					found = true;
				}
			
			}
		}
		if (!found) {
			System.out.println("No");
		}

	}

}
