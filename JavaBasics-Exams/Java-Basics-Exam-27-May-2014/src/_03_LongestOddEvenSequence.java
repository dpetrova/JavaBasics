import java.util.Scanner;

public class _03_LongestOddEvenSequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] input = scn.nextLine().split("\\D+");
		int[] numbers = new int[input.length - 1];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(input[i + 1]);
		}
		
		int counter = 0;
		int longestSub = 0;
		boolean shouldBeOdd = (numbers[0] % 2 != 0);
		for (int num : numbers) {
			boolean isOdd = num % 2 != 0;
			if (isOdd == shouldBeOdd || num == 0) {
				counter++;
			} else {
				shouldBeOdd = isOdd;
				counter = 1;
			}
			shouldBeOdd = !shouldBeOdd;
			if (counter > longestSub) {
				longestSub = counter;
			}
		}
//		int counter = 1;
//		int longestSub = 1;
//		for (int i = 0; i < numbers.length - 1; i++) {
//			boolean seqOddEven = (numbers[i] % 2 != 0 && numbers[i + 1] % 2 == 0)
//						|| numbers[i] == 0 || numbers[i + 1] == 0;
//			boolean seqEvenOdd = (numbers[i] % 2 == 0 && numbers[i + 1] % 2 != 0) || 
//					 numbers[i] == 0 ||	numbers[i + 1] == 0;
//			
//			if (seqEvenOdd || seqOddEven) {
//				counter++;
//				if (counter > longestSub) {
//					longestSub = counter;
//				}
//			}
//			else {
//				counter = 1;
//			}
//		}
		System.out.println(longestSub);

	}

}
