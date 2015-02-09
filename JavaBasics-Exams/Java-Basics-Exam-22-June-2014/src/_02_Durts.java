import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class _02_Durts {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int centerX = scn.nextInt();
		int centerY = scn.nextInt();
		int size = scn.nextInt();
		int countDarts = scn.nextInt();
		for (int i = 0; i < countDarts; i++) {
			int pointX = scn.nextInt();
			int pointY = scn.nextInt();
			boolean isInsideVertRect = (pointX <= centerX + size/2.0) &&
					    (pointX >= centerX - size/2.0) &&
					    (pointY <= centerY + size) &&
					    (pointY >= centerY - size);
			boolean isInsideHorizRect = (pointX <= centerX + size) &&
						(pointX >= centerX - size) &&
						(pointY <= centerY + size/2.0) &&
						(pointY >= centerY - size/2.0);
			boolean inside = isInsideVertRect || isInsideHorizRect;
			System.out.println(inside ? "yes" : "no");		
		}
		
		

	}

}
