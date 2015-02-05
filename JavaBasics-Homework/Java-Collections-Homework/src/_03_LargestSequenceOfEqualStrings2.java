import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;


public class _03_LargestSequenceOfEqualStrings2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] elements = input.nextLine().split(" ");
		Map<String, Integer> sequences = new HashMap<>();
		for (String element : elements) {
			Integer count = sequences.get(element);
			if (count == null) {
				count = 0;
			}
			sequences.put(element, count + 1);
		}
		
		Integer maxValueInMap = Collections.max(sequences.values());  // This will return max value in the Hashmap
        for (Entry<String, Integer> entry : sequences.entrySet()) {  // Iterate through hashmap
            if (entry.getValue() == maxValueInMap) {
                for (int i = 0; i < maxValueInMap; i++) {
                	System.out.print(entry.getKey() + " ");     // Print the key with max value
				}
            	return;
            }
        }
		
	}
}

