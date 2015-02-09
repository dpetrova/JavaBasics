import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class _04_Nuts {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.nextLine();
		
		//processing data
		TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();
		for (int i = 0; i < num; i++) {
			String[] input = scn.nextLine().split(" ");
			String company = input[0];
			String nuts = input[1];
			int amount = Integer.parseInt(input[2].substring(0, input[2].length() - 2));
			if (!data.containsKey(company)) {
				LinkedHashMap<String, Integer> nutsAndAmount = new LinkedHashMap<>();
				nutsAndAmount.put(nuts, amount);
				data.put(company, nutsAndAmount);
			}
			else {
				LinkedHashMap<String, Integer> nutsAndAmount = data.get(company);
				int oldAmount = 0;
				if (nutsAndAmount.containsKey(nuts)) {
					oldAmount = nutsAndAmount.get(nuts);
				}
				nutsAndAmount.put(nuts, oldAmount + amount);
			}
		}
		
		//printing data
		for (String company : data.keySet()) {
			System.out.print(company + ": ");
			LinkedHashMap<String, Integer> nutsAndAmount = data.get(company);
			boolean isFirst = true;
			for (Entry<String, Integer> entry : nutsAndAmount.entrySet()) {
				if (!isFirst) {
					System.out.print(", ");
				}
				System.out.print(entry.getKey() + "-" + entry.getValue() + "kg");
				isFirst = false;
			}
			System.out.println();
		}

	}

}
