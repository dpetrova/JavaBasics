import java.util.Scanner;


public class _02_PythagoreanNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nums = input.nextInt();
		int[] numbers = new int[nums];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		boolean isFound = false;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				for (int k = 0; k < numbers.length; k++) {
					if ((numbers[i] * numbers[i] + numbers[j] * numbers[j] == numbers[k] * numbers[k]) && numbers[i] <= numbers[j] ){
						System.out.printf("%1$d*%1$d + %2$d*%2$d = %3$d*%3$d\n", numbers[i], numbers[j], numbers[k]);
						isFound = true;
					}
				}
			}
		}
		if (isFound == false) {
			System.out.println("No");
		}

	}

}
