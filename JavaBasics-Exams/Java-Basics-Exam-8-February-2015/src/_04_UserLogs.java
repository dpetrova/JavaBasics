import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class _04_UserLogs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		TreeMap<String, LinkedHashMap<String, ArrayList<String>>> data = new TreeMap<>();
		while (!input.equals("end")) {
			String[] tokens = input.split(" ");
			String IP = tokens[0].substring(3, tokens[0].length());
			String message = tokens[1];
			String user = tokens[2].substring(5, tokens[2].length());
			if (!data.containsKey(user)) {
				LinkedHashMap<String, ArrayList<String>> singleUser = new LinkedHashMap<>();
				ArrayList<String> messages = new ArrayList<String>();
				messages.add(message);
				singleUser.put(IP, messages);
				data.put(user, singleUser);
			}
			else {
				LinkedHashMap<String, ArrayList<String>> singleUser = data.get(user);
				if (!singleUser.containsKey(IP)) {
					ArrayList<String> messages = new ArrayList<String>();
					messages.add(message);
					singleUser.put(IP, messages);
				}
				else {
					ArrayList<String> messages = singleUser.get(IP);
					messages.add(message);
					singleUser.put(IP, messages);
				}
				
			}
			input = scn.nextLine();
		}
		
		//printing data
		for (String user : data.keySet()) {
			String output = user + ":\n";
			LinkedHashMap<String, ArrayList<String>> singleUser = data.get(user);
			for (Entry<String, ArrayList<String>> entry : singleUser.entrySet()) {
				String IP = entry.getKey();
				ArrayList<String> messages = entry.getValue();
				output += IP + " => " + messages.size() + ", ";
			}
			output = output.substring(0, output.length() - 2);
			output += ".";
			System.out.println(output);
		}

	}

}
