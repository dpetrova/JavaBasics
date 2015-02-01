import java.util.Arrays;
import java.util.Scanner;

public class _04_TheSmallestOf3Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] arr = new double[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
		}
		Arrays.sort(arr);
		double min = arr[0];
		double max = arr[arr.length -1];
		System.out.println(min); 
	}
}
