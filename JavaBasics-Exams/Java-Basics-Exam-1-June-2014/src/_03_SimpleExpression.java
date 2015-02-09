import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class _03_SimpleExpression {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		input = input.replace(" ", "");
		String[] nums = input.split("[^0-9.]+");
		String[] operators = input.split("[0-9.]+");
		BigDecimal sum = new BigDecimal(nums[0]);
		for (int i = 1, j = 1; i < nums.length && j < operators.length; i++, j++) {
			BigDecimal number = new BigDecimal(nums[i]);
			if (operators[j].equals("+")) {
				sum = sum.add(number);
			}
			else if (operators[j].equals("-")) {
				sum = sum.subtract(number);
			}
		}
		System.out.println(sum.toPlainString());
	}

}
