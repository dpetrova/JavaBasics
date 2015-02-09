import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;


public class _04_LogsAggregator {

	public static void main(String[] args) {
		
		//processing data
		Scanner scn = new Scanner(System.in);
		int numberOfLogs = scn.nextInt();
		scn.nextLine();
		TreeMap<String, Integer> durations = new TreeMap<>();
		HashMap<String, TreeSet<String>> IPs = new HashMap<>();
		
		for (int i = 0; i < numberOfLogs; i++) {
			String[] input = scn.nextLine().split(" ");
			String IP = input[0];
			String user = input[1];
			int duration = Integer.parseInt(input[2]);
			
			// Aggregate the user's sessions durations
			int oldDuration = 0;
			if (durations.containsKey(user)) {
				oldDuration = durations.get(user);
			}
			durations.put(user, oldDuration + duration);
			
			// Collect the IP addresses for the user
			TreeSet<String> IPset = IPs.get(user);
			if (IPset == null) {
				IPset = new TreeSet<String>();
			}
			IPset.add(IP);
			IPs.put(user, IPset);
		}
		
		//printing data
		for (Entry<String, Integer> userAndDuration : durations.entrySet()) {
			String user = userAndDuration.getKey();
			int duration = userAndDuration.getValue();
			TreeSet<String> IPset = IPs.get(user);
			System.out.println(user + ": " + duration + " " + IPset);
		}

	}

}
