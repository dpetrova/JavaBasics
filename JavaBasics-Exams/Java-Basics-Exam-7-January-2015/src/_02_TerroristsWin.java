import java.util.Scanner;


public class _02_TerroristsWin {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder input = new StringBuilder(scn.nextLine());
		int currentIndex = 0;
		int bombStartIndex = 0;
		int bombEndIndex = 0;
		while ((bombStartIndex = input.indexOf("|", currentIndex)) != -1){
			bombStartIndex = input.indexOf("|");
			bombEndIndex = input.indexOf("|", bombStartIndex + 1);
			int sum = 0;
			for (int j = bombStartIndex + 1; j <= bombEndIndex - 1; j++) {
				sum += input.charAt(j);
			}
			int power = sum % 10;
			int start = Math.max(0, bombStartIndex - power);
			int end = Math.min(input.length() - 1, bombEndIndex + power);
			for (int j = start; j <= end; j++) {
				input.setCharAt(j, '.');
			}
			currentIndex = bombEndIndex + 1;
		}
		System.out.println(input);

	}

}
