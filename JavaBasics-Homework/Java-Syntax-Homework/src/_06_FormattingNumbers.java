import java.util.Locale;
import java.util.Scanner;

import org.apache.commons.lang.StringUtils;

public class _06_FormattingNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		String hex = Integer.toHexString(num1);
		String binary = StringUtils.leftPad(Integer.toBinaryString(num1), 10, '0');
		System.out.printf("|%1$-10s|%2$10s|%3$10.2f|%4$-10.3f|",
												hex, binary, num2, num3 );
	}
}
