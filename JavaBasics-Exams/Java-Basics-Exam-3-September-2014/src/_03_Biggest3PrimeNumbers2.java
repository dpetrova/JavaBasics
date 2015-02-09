import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


public class _03_Biggest3PrimeNumbers2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] input = scn.nextLine().split("[ ()]+");
		TreeSet<Integer> nums = new TreeSet<>(Collections.reverseOrder());
		for (int i = 1; i < input.length; i++) {
			int number = Integer.parseInt(input[i]);
			if (isPrime(number)) {
				nums.add(number);
			}
		}
		if (nums.size() >= 3) {
			int count = 0;
			int sum = 0;
			for (Integer number : nums) {
				sum += number;
				count++;
				if (count == 3) {
					break;
				}
			}
			System.out.println(sum);
		}
		else {
			System.out.println("No");
		}

	}
	
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		else {
			for (int i = 2; i <= (int)Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
		
	}

}
