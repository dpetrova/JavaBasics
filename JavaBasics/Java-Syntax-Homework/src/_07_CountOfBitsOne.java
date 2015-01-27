import java.util.Scanner;

public class _07_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long num = input.nextLong();
		int count = Long.bitCount(num);
		System.out.println(count);
	}
}
