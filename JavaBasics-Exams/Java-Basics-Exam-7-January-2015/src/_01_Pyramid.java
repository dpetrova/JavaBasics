import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Stream;


public class _01_Pyramid {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int numOfRows = scn.nextInt();
		int nextNumber = scn.nextInt();
		//System.out.print(nextNumber);
		String output = "" + nextNumber;
		scn.nextLine();
		for (int i = 0; i < numOfRows - 1; i++) {
			String[] input = scn.nextLine().trim().split("[ ]+");
			ArrayList<Integer> nums = new ArrayList<>();
			for (int j = 0; j < input.length; j++) {
				nums.add(Integer.parseInt(input[j]));
			}
			
		//Optional<Integer> oi = nums.stream().filter(x -> x > nextNumber).findFirst();
		//System.out.println(oi.isPresent()? "Found: "+oi.get() : "Not found");
		
//		OptionalInt oi = Stream.of(scn.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .filter(x -> x > nextNumber)
//                .min();
			
			Collections.sort(nums);
			boolean isBreak = false;
			for (int j = 0; j < nums.size(); j++) {
				if (nums.get(j) > nextNumber) {
					nextNumber = nums.get(j);
					//System.out.print(", " + nextNumber);
					output += ", " + nextNumber;
					isBreak = true;
					break;
				}
			}
			if (!isBreak) {
				nextNumber++;
			}
		}
		System.out.println(output);
	}

}
