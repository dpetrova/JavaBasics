import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;


public class _04_OfficeStuff {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.nextLine();
		TreeMap<String, LinkedHashMap<String, Integer>> companies = new TreeMap<>();
		
		//processing data
		for (int i = 0; i < num; i++) {
			String[] input = scn.nextLine().split("[\\s|-]+");
			String company = input[1];
			int amount = Integer.parseInt(input[2]);
			String product = input[3];
			if (!companies.containsKey(company)) {
				LinkedHashMap<String, Integer> singleCompanyData = new LinkedHashMap<>();
				singleCompanyData.put(product, amount);
				companies.put(company, singleCompanyData);
			}
			else {
				LinkedHashMap<String, Integer> singleCompanyData = companies.get(company);
				int oldAmount = 0;
				if (singleCompanyData.containsKey(product)) {
					oldAmount = singleCompanyData.get(product);
				}
				singleCompanyData.put(product, oldAmount + amount);
			}
		}
		
		//printing data
		for (String company : companies.keySet()) {
			System.out.print(company + ": ");
			LinkedHashMap<String, Integer> singleCompanyData = companies.get(company);
			boolean isFirst = false;
			for (Entry<String, Integer> entry : singleCompanyData.entrySet()) {
				String product = entry.getKey();
				int amount = entry.getValue();
				if (isFirst) {
					System.out.print(", ");
				}
				System.out.printf("%s-%d", product, amount);
				isFirst = true;				
			}
			System.out.println();
		}
		
	}

}
