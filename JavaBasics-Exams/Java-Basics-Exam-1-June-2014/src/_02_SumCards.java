import java.util.Scanner;


public class _02_SumCards {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] cards = scn.nextLine().split("[ SHDC]+");
		
		int value;
		int sum = 0;
		int counter = 1;
		for (int i = 0; i < cards.length; i+= counter) {
			counter = 1;
			int tempSum = 0;
			for (int j = i + 1; j < cards.length; j++) {
				if (cards[i].equals(cards[j])) {
					counter++;
				}
				else {
					break;
				}
			}
			switch (cards[i]) {
				case "J": 	value = 12;		break;
				case "Q":	value = 13;		break;
				case "K":	value = 14;		break;
				case "A":	value = 15;		break;
				default:	value = Integer.parseInt(cards[i]);		break;
			}
			tempSum = value * counter;
			if (counter > 1) {
				tempSum *= 2;
			}
			sum += tempSum;
			
		}
		System.out.println(sum);

	}

}
