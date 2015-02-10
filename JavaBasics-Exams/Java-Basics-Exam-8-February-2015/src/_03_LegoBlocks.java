import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class _03_LegoBlocks {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//processing the input data
		int rows = scn.nextInt();
		scn.nextLine();
		char[][] firstBlock = new char[rows][];
		char[][] secondBlock = new char[rows][];
		for (int i = 0; i < rows; i++) {
			String input = scn.nextLine().trim().replace(" ", "");
			firstBlock[i] = input.toCharArray();
		}
		for (int i = 0; i < rows; i++) {
			String input = scn.nextLine().trim().replace(" ", "");
			secondBlock[i] = input.toCharArray();
		}
		
		//reverse the second block
		for (int i = 0; i < secondBlock.length; i++) {
			for (int j = 0; j < secondBlock[i].length/2; j++) {
				char temp = secondBlock[i][j];
				secondBlock[i][j] = secondBlock[i][secondBlock[i].length - 1 - j];
				secondBlock[i][secondBlock[i].length - 1 - j] = temp;
			}
		}
		
		//merge matricies
		for (int i = 0; i < firstBlock.length; i++) {
			Arrays.asList(firstBlock[i]).addAll(Arrays.asList(secondBlock[i]));			
		}

		//check fitting
		boolean isFit = false;
		for (int i = 0; i < rows - 1; i++) {
			if (firstBlock[i].length == 
								firstBlock[i + 1].length) {
				isFit = true;
				continue;
			}
			else {
				isFit = false;
				break;
			}
		}
		
		if (isFit) {
			for (int i = 0; i < firstBlock.length; i++) {
				System.out.println(firstBlock[i]);
			}
		}
		else {
			int totalNumberOfCells = 0;
			for (int i = 0; i < rows; i++) {
				String str1 = String.valueOf(firstBlock[i]).replace(" ", "");
				String str2 = String.valueOf(secondBlock[i]).replace(" ", "");
				totalNumberOfCells += str1.length() + str2.length();				
			}
			System.out.println("The total number of cells is: " + totalNumberOfCells);
		}
	
		
		//printing matrix
//		for (int i = 0; i < secondBlock.length; i++) {
//			for (int j = 0; j < secondBlock[i].length; j++) {
//				System.out.print(secondBlock[i][j]);
//			}
//			System.out.println();
//		}

	}

}
