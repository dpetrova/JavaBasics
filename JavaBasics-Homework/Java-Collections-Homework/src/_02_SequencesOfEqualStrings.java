import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] elements = input.nextLine().split(" ");
		for (int i = 0; i < elements.length - 1; i++) {
			if (! elements[i].equals(elements[i + 1])) {
				System.out.println(elements[i]);
			}
			else {
				System.out.print(elements[i] + " ");
			}
		}
		System.out.println(elements[elements.length - 1]);
	}
}
