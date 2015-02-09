import java.util.ArrayList;
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
			String input = scn.nextLine().trim();
			firstBlock[i] = input.toCharArray();
		}
		for (int i = 0; i < rows; i++) {
			String input = scn.nextLine().trim();
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

		//check fitting
		boolean isFit = false;
		for (int i = 0; i < rows - 1; i++) {
			if (firstBlock[i].length + secondBlock[i].length == 
								firstBlock[i + 1].length + secondBlock[i + 1].length) {
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
				String str1 = String.valueOf(firstBlock[i]).replace(" ", "");
				String str2 = String.valueOf(secondBlock[i]).replace(" ", "");
				char[] concatStr = (str1 + str2).toCharArray();
				ArrayList<Character> result = new ArrayList<Character>();
				for (int j = 0; j < concatStr.length; j++) {
					result.add(concatStr[j]);
				}
				System.out.println(result);
			}
		}
		else {
			int totalNumberOfCells = 0;
			for (int i = 0; i < firstBlock.length; i++) {
				totalNumberOfCells += (firstBlock[i].length/2) + 1 + (secondBlock[i].length/ 2) + 1;
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
