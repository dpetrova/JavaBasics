import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;


public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] elements = input.nextLine().split(" ");
		int[] nums = new int[elements.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(elements[i]);
		}
		
		int firstIndex = 0;
		int maxLength = 1;
		int currentIndex = 0;
		int count = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i + 1]) {
				System.out.print(nums[i] + " ");
				count++;
			}
			else {
				System.out.println(nums[i]);
				currentIndex = i + 1;
				count = 1;
			}
			if (count > maxLength) {
				maxLength = count;
				firstIndex = currentIndex;
			}
		}
		System.out.println(nums[nums.length - 1]);
			
		System.out.print("Longest: ");
		for (int i = firstIndex; i < firstIndex + maxLength; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		
	}
}
