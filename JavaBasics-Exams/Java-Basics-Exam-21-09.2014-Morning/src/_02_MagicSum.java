import java.util.ArrayList;
import java.util.Scanner;


public class _02_MagicSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int divider = input.nextInt();
		int biggestMagicSum = Integer.MIN_VALUE;
		int fisrtNum = 0;
		int secondNum = 0;
		int thirdNum = 0;
		boolean found = false;
		ArrayList<Integer> nums = new ArrayList<>();
		
		while (input.hasNextInt()) {
			int number = input.nextInt();
			nums.add(number);
		}
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				for (int k = j + 1; k < nums.size(); k++) {
					if ((nums.get(i) + nums.get(j) + nums.get(k)) % divider == 0) {
						int magicSum = nums.get(i) + nums.get(j) + nums.get(k);
						found = true;
						if (magicSum > biggestMagicSum) {
							biggestMagicSum = magicSum;
							fisrtNum = nums.get(i);
							secondNum = nums.get(j);
							thirdNum = nums.get(k);
						}
					}
				}
			}
		}
		if (found) {
			System.out.printf("(%d + %d + %d) %% %d = 0", fisrtNum, secondNum, thirdNum, divider);
		}
		else {
			System.out.println("No");
		}
		

	}

}
