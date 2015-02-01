import java.util.Scanner;

public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long num = input.nextLong();
		String hex = Long.toHexString(num);
		System.out.println(hex);
	}
}
