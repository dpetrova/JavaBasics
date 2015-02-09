import java.util.Scanner;


public class _01_GandalfStash {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int initialPoints = scn.nextInt();
		scn.nextLine();
		String[] input = scn.nextLine().toLowerCase().split("\\W+");
		int sumOfPoints = 0;
		for (int i = 0; i < input.length; i++) {
			String food = input[i];
			switch (food) {
			case "cram":	sumOfPoints += 2;	break;
			case "lembas":	sumOfPoints += 3;	break;
			case "apple": 	sumOfPoints += 1;	break;
			case "melon": 	sumOfPoints += 1;	break;
			case "honeycake":	sumOfPoints += 5; break;
			case "mushrooms": sumOfPoints -= 10;	break;
			default: sumOfPoints -= 1;	break;
			}
		}
		int endPoints = initialPoints + sumOfPoints;
		String changedMood = "";
		if (endPoints < -5) {
			changedMood = "Angry";
		}
		else if (endPoints >= -5 && sumOfPoints < 0) {
			changedMood = "Sad";
		}
		else if (endPoints >= 0 && sumOfPoints <= 15) {
			changedMood = "Happy";
		}
		else if (endPoints > 15) {
			changedMood = "Special JavaScript mood";
		}
		System.out.println(endPoints);
		System.out.println(changedMood);
	}

}
