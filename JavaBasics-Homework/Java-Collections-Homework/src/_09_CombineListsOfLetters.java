import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] input1 = sc.nextLine().replaceAll("\\s+", "").toCharArray();
		ArrayList<Character> list1 = new ArrayList<>();
		for (int i = 0; i < input1.length; i++) {
			list1.add(input1[i]);
		}
		
		char[] input2 = sc.nextLine().replaceAll("\\s+", "").toCharArray();
		ArrayList<Character> list2 = new ArrayList<>();
		for (int i = 0; i < input2.length; i++) {
			list2.add(input2[i]);
		}
		
//		for (Character character : list2) {
//			if (! list1.contains(character)) {
//				list1.add(character);
//			}
//		}
		
		list2.removeAll(list1);
		list1.addAll(list2);
		
		//System.out.println(list1);
		for (Character character : list1) {
			System.out.print(character + " ");
		}
	}

}
