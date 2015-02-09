import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class _04_SchoolSystem {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.nextLine();
		TreeMap<String, TreeMap<String, ArrayList<Integer>>> data = new TreeMap<>();
		for (int i = 0; i < num; i++) {
			String[] input = scn.nextLine().split(" ");
			String name = input[0] + " " + input[1];
			String subject = input[2];
			int grade = Integer.parseInt(input[3]);
			if (!data.containsKey(name)) {
				TreeMap<String,  ArrayList<Integer>> student = new TreeMap<>();
				ArrayList<Integer> grades =  new ArrayList<>();
				grades.add(grade);
				student.put(subject, grades);
				data.put(name, student);
			}
			else {
				TreeMap<String,  ArrayList<Integer>> student = data.get(name);
				if (!student.containsKey(subject)) {
					ArrayList<Integer> grades =  new ArrayList<>();
					grades.add(grade);
					student.put(subject, grades);
				}
				else {
					ArrayList<Integer> grades =  student.get(subject);
					grades.add(grade);
					student.put(subject, grades);
				}
			}
		}
		
		//printing data
		for (String name : data.keySet()) {
			//System.out.print(name + ": [");
			String output  = name + ": [";
			TreeMap<String, ArrayList<Integer>> student = data.get(name);
			for (Entry<String, ArrayList<Integer>> entry : student.entrySet()) {
				String subject = entry.getKey();
				ArrayList<Integer> grades = entry.getValue();
				int sum = 0;
				for (int i = 0; i < grades.size(); i++) {
					sum += grades.get(i);
				}
				double average = (double)sum / grades.size();
				//System.out.printf("%s - %.2f, ", subject, average);
				 output += subject + " - " + String.format("%.2f", average) + ", ";
			}
			output = output.substring(0, output.length() - 2) + "]";
			System.out.println(output);
		}

	}

}
