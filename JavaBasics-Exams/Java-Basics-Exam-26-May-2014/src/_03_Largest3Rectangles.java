import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class _03_Largest3Rectangles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] str = input.split("\\D+");
		ArrayList<Integer> areas = new ArrayList<Integer>();
		for (int i = 1; i < str.length - 1; i+=2) {
			int sideA = Integer.parseInt(str[i]);
			int sideB = Integer.parseInt(str[i + 1]);
			int rectArea = sideA * sideB;
			areas.add(rectArea);
		}
		int totalArea = 0;
		int maxTotalArea = 0;
		for (int i = 0; i < areas.size() - 2; i++) {
			totalArea = areas.get(i) + areas.get(i + 1) + areas.get(i + 2);
			if (totalArea > maxTotalArea) {
				maxTotalArea = totalArea;
			}
		}
		System.out.println(maxTotalArea);	
	}
}

