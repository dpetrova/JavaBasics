import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class _04_Orders {

	public static void main(String[] args) {
		//processing data
		Scanner scn = new Scanner(System.in);
		int numberOfOrders = scn.nextInt();
		scn.nextLine();
		LinkedHashMap<String, TreeMap<String, Integer>> orders = new LinkedHashMap<>();
		
		for (int i = 0; i < numberOfOrders; i++) {
			String customer = scn.next();
			int amount = scn.nextInt();
			String product = scn.next();
			if (! orders.containsKey(product)) {
				orders.put(product, new TreeMap<String, Integer>());
			}
			
			TreeMap<String, Integer> singleOrder = orders.get(product);
			int oldAmount = 0;
			if (singleOrder.containsKey(customer)) {
				oldAmount = singleOrder.get(customer);
			}
			singleOrder.put(customer, oldAmount + amount);
		}
		
		//printing data
		for (String product : orders.keySet()) {
			System.out.print(product + ": ");
			TreeMap<String, Integer> singleOrder = orders.get(product);
			boolean first = true;
			for (Entry<String, Integer> pair : singleOrder.entrySet()) {
				if (!first) {
					System.out.print(", ");
				}
				first = false;
				String customer = pair.getKey();
				int amount = pair.getValue();
				System.out.print(customer + " " + amount);
			}
			System.out.println();
		}
	}

	}
