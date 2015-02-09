import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _03_ValidUsernames {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] names = scn.nextLine().split("[\\s()/\\\\]+");
		ArrayList<String> validnames = new ArrayList<>();
		Pattern namepattern = Pattern.compile("\\b[a-zA-Z][\\w_]{2,25}\\b");
		for (String name : names) {
			Matcher matcher = namepattern.matcher(name);
			if (matcher.find()) {
				validnames.add(name);
			}
		}
	
//		for (int i = 0; i < names.length; i++) {
//			Matcher matcher = namepattern.matcher(names[i]);
//			if (names[i].length() > 4 && names[i].length() < 25 && matcher.find()) {
//				validnames.add(matcher.group());
//			}
//		}
		int maxSumLenghts = 0;
		String firstElement = "";
		String secondElement = "";
		for (int i = 0; i < validnames.size() - 1; i++) {
			int sumLenghts = validnames.get(i).length() + validnames.get(i + 1).length();
			if (sumLenghts > maxSumLenghts) {
				maxSumLenghts = sumLenghts;
				firstElement = validnames.get(i);
				secondElement = validnames.get(i + 1);
			}
		}
		System.out.println(firstElement);
		System.out.println(secondElement);
	}

}
