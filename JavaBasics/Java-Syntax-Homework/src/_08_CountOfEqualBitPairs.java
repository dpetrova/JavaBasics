import java.util.Scanner;

public class _08_CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long num = input.nextLong();
		int count = 0;
		while (num > 0) {
			if ((num & 3) == 3 || (num & 3) == 0) {
				count++;
			}
			num >>= 1;
		}
		System.out.println(count);
	}
}
