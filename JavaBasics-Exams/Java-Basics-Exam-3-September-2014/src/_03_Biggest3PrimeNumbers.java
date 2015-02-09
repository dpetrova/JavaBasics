import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


public class _03_Biggest3PrimeNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] input = scn.nextLine().split("[ ()]+");
		ArrayList<Integer> nums =  new ArrayList<>();
		for (int i = 1; i < input.length; i++) {
			int number = Integer.parseInt(input[i]);
			if (!nums.contains(number) && isPrime(number)) {
				nums.add(number);
			}
		}
		Collections.sort(nums);
		if (nums.size() >= 3) {
			int sum = 0;
			for (int i = nums.size() - 1; i > nums.size() - 4; i--) {
				sum += nums.get(i);
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
