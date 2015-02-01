import java.util.Scanner;

public class _03_PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pointX = input.nextDouble();
		double pointY = input.nextDouble();
		boolean isInsidePartOne = (pointX >= 12.5) && 
			(pointX <= 22.5) && (pointY >= 6) && (pointY <= 8.5); 
		boolean isInsidePartTwo = (pointX >= 12.5) && 
			(pointX <= 17.5) && (pointY >= 8.5) && (pointY <= 13.5);
		boolean isInsidePartThree = (pointX >= 20) && 
			(pointX <= 22.5) && (pointY >= 8.5) && (pointY <= 13.5);
		if (isInsidePartOne || isInsidePartTwo || isInsidePartThree) {
			System.out.println("Inside");
		} 
		else {
			System.out.println("Outside");
		}
	}
}
