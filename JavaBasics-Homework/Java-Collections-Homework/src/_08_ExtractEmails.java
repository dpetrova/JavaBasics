import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _08_ExtractEmails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		Pattern emailPattern = 
			Pattern.compile("[0-9a-zA-Z]+[-._0-9a-zA-Z]*[0-9a-zA-Z]+@[a-zA-Z-]+\\.[a-zA-Z.]+[a-zA-Z]+");
		Matcher match = emailPattern.matcher(text);
		while (match.find()) {
			System.out.println(match.group());
		}
	}

}
