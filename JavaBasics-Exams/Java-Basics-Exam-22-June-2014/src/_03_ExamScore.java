import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class _03_ExamScore {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scn = new Scanner (System.in);
		// Skip the first 3 lines
		scn.nextLine();
		scn.nextLine();
		scn.nextLine();
		TreeMap<Integer, TreeMap<String, Double>> results = new TreeMap<>();
		while (true) {
			String[] input = scn.nextLine().split("[ |]+");
			if (input.length < 4) {
				// The footer line is reached
				break;
			}
			String student = input[1] + " " + input[2];
			int score = Integer.parseInt(input[3]);
			double grade = Double.parseDouble(input[4]);
			if (!results.containsKey(score)) {
				results.put(score, new TreeMap<>());
			}
			results.get(score).put(student, grade);			
		}
		
		// Print the output
		for (Integer score : results.keySet()) { 
			System.out.print(score + " -> "); // Loop by key and print it
			System.out.print(results.get(score).keySet()); // print keys of inner map (names)
			double sum = 0;
			// Loop through the values of the inner map and calculate the average
			for (double grade : results.get(score).values()) { 
				sum += grade;
			}
			double avg = sum / results.get(score).values().size();
			System.out.printf("; avg=%.2f\n", avg);
		}
	}

}

