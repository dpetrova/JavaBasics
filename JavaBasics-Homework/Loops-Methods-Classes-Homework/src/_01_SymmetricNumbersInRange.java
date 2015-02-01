import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("start of the range (0 <= start <= end <= 999): ");
		int start = input.nextInt();
		System.out.print("end of the range (0 <= start <= end <= 999): ");
		int end = input.nextInt();
		for (int num = start; num <= end; num++) {
			if (isSymmetric(num)) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

	private static boolean isSymmetric(int num) {
		boolean isSymmetric = true;
		char[] arr = Integer.toString(num).toCharArray();
		for (int i = 0, j = 1; i <= arr.length/2; i++, j++) {
			if (arr[i] != arr[arr.length - j]) {
				isSymmetric = false;
				break;
			}
		}
		return isSymmetric;
	}
}
