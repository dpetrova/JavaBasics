import java.util.ArrayList;
import java.util.Scanner;


public class _01_StuckNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] numbers = new int[num];
		for (int i = 0; i < num; i++) {
			numbers[i] = scn.nextInt();
		}
		boolean isFound = false;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					continue;
				}
				for (int k = 0; k < numbers.length; k++) {
					if (numbers[k] == numbers[i] || numbers[k] == numbers[j]) {
						continue;
					}
					for (int l = 0; l < numbers.length; l++) {
						if (numbers[l] == numbers[i] || numbers[l] == numbers[j] ||
														numbers[l] == numbers[k]) {
								continue;							
						}
								String str1 = "" + numbers[i] + numbers[j];
								String str2 = "" + numbers[k] + numbers[l];
								if (str1.equals(str2)) {
									System.out.printf("%d|%d==%d|%d\n", numbers[i],
												numbers[j], numbers[k], numbers[l]);
									isFound = true;
								}
					}
				}
			}
		}
		if (! isFound) {
			System.out.println("No");
		}

	}

}
