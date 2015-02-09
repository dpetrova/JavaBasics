import java.util.Scanner;


public class _03_FireTheArrows {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		scn.nextLine();
		char[][] matrix = new char[rows][];
		for (int i = 0; i < rows; i++) {
			String input = scn.nextLine();
			matrix[i] = input.toCharArray();
		}
		
		boolean hasMoved;
        do {
            hasMoved = false;
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    switch (matrix[row][col]) {
                        case '>':
                            if (col + 1 > matrix[row].length - 1) { //if it is out of the matrix
                                break;
                            }
                            if (matrix[row][col + 1] == 'o') { //it will move only the next cell is 'o' 
                                matrix[row][col] = 'o'; //current cell become 'o'
                                matrix[row][col + 1] = '>'; //next cell become '>'
                                hasMoved = true;
                            }
                            break;
                        case '<':
                            if (col - 1 < 0) { //if it is out of the matrix
                                break;
                            }
                            if (matrix[row][col - 1] == 'o') {
                                matrix[row][col] = 'o';
                                matrix[row][col - 1] = '<';
                                hasMoved = true;
                            }
                            break;
                        case '^':
                            if (row - 1 < 0) { //if it is out of the matrix
                                break;
                            }
                            if (matrix[row - 1][col] == 'o') {
                                matrix[row][col] = 'o';
                                matrix[row - 1][col] = '^';
                                hasMoved = true;
                            }
                            break;
                        case 'v':
                            if (row + 1 > matrix.length - 1) { //if it is out of the matrix
                                break;
                            }
                            if (matrix[row + 1][col] == 'o') {
                                matrix[row][col] = 'o';
                                matrix[row + 1][col] = 'v';
                                hasMoved = true;
                            }
                            break;
                    }
                }
            }
        } while (hasMoved);
		
		//printing matrix
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[r].length; c++) {
				System.out.print(matrix[r][c]);
			}
			System.out.println();
		}

	}

}
