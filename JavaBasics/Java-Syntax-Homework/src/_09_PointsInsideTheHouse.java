import java.util.Scanner;

public class _09_PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pointX = input.nextDouble();
		double pointY = input.nextDouble();
		//check if point is inside a triangle
		boolean toTheRightSide = ((17.5 - 12.5) * (pointY - 8.5) - 
											(3.5 - 8.5) * (pointX - 12.5)) >= 0;
		boolean toTheLeftSide = ((22.5 - 17.5) * (pointY - 3.5) - 
											(8.5 - 3.5) * (pointX - 17.5))	>= 0;								
		boolean toTheUpperSide = ((22.5 - 12.5) * (pointY - 8.5) - 
											(8.5 - 8.5) * (pointX - 12.5)) <= 0;
		boolean isInsidePartOne = toTheRightSide && toTheLeftSide && toTheUpperSide;
		//check if point is inside left square
		boolean isInsidePartTwo = (pointX >= 12.5) && 
			(pointX <= 17.5) && (pointY >= 8.5) && (pointY <= 13.5);
		//check if point is inside right rectangle
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
