import java.util.Arrays;
import java.util.Scanner;


public class _08_SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.nextLine();
		String[] str = new String[num];
		for (int i = 0; i < num; i++) {
			str[i] = input.nextLine();
		}
		Arrays.sort(str);
				
		for (String item : str) {
			System.out.println(item);
		}

	}

}
