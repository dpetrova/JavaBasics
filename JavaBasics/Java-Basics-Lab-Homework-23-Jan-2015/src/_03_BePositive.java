import java.util.ArrayList;
import java.util.Scanner;

public class _03_BePositive {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		int countSequences = scn.nextInt();
		scn.nextLine();
		
		for (int i = 0; i < countSequences; i++) {
			String[] input = scn.nextLine().trim().split("\\s+");
			ArrayList<Integer> numbers = new ArrayList<>();
			
			for (int j = 0; j < input.length; j++) {
				numbers.add(Integer.parseInt(input[j]));									
			}
			
			boolean found = false;
			
			for (int j = 0; j < numbers.size(); j++) {				
				int currentNum = numbers.get(j);
				if (currentNum >= 0) {
					System.out.printf("%d%s", currentNum, j != numbers.size() - 1 ? " " : "\n");
					found = true;
				}
				else {
					if (j < numbers.size() - 1) {
						currentNum += numbers.get(j + 1);					
						if (currentNum >= 0) {
							System.out.printf("%d%s", currentNum, j != numbers.size() - 1 ? " " : "\n");
							found = true;
						}
					}
					j++;
				}
			}
						
			if (!found) {
				System.out.println("(empty)");
			} 	
			
		}
		
	}
}
