import java.util.Scanner;


public class _02_AddingAngles {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] numbers = new int[num];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scn.nextInt();
		}
		boolean found = false;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				for (int k = j + 1; k < numbers.length; k++) {
					int sumOfDegrees = numbers[i] + numbers[j] + numbers[k];
					if (sumOfDegrees % 360 == 0) {
						System.out.printf("%d + %d + %d = %d degrees\n", 
								numbers[i], numbers[j], numbers[k], sumOfDegrees);
						found = true;
					}
				}
			}
		}
		if (!found) {
			System.out.println("No");
		}

	}

}
