import java.util.Scanner;
import java.util.TreeMap;


public class _04_ActivityTracker {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		//create the construct to hold the data
		TreeMap<Integer, TreeMap<String,Long>> data = new TreeMap<>();
		
		//populate the data in the construct
		for (int i = 0; i < num; i++) {
			String date = scn.next("[0-9]{2}/[0-9]{2}/[0-9]{4}");
			int month = Integer.parseInt(date.substring(3, 5));
			String user = scn.next();
			long distance = scn.nextLong();
			//check if the month is already present or not and act accordingly
			if (!data.containsKey(month)) {
				TreeMap<String, Long> users = new TreeMap<String, Long>();
				users.put(user, distance);
				data.put(month, users);
			}
			else {
				TreeMap<String, Long> users = data.get(month);
				//check if the user is already present or not and act accordingly
				if (!users.containsKey(user)) {
					users.put(user, distance);
				}
				else {
					long oldDistance = users.get(user);
					users.put(user, oldDistance + distance);
				}
				data.put(month, users);
			}
		}
		
		//print the output
		for (Integer month : data.keySet()) {
			System.out.print(month + ": ");
			TreeMap<String, Long> users = data.get(month);
			boolean first = true;
			for (String singleUser : users.keySet()) {
				long totalDistance = users.get(singleUser);
				if (!first) {
					System.out.print(", ");					
				}
				first = false;
				System.out.printf("%s(%d)", singleUser, totalDistance);
			}
			System.out.println();
		}
	}
}
