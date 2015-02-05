import java.util.Arrays;
import java.util.Scanner;


public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfElements = input.nextInt();
		int[] numbers = new int[numberOfElements];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		Arrays.sort(numbers);
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}

}
