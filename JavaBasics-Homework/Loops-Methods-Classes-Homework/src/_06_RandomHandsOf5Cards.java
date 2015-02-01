import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOf5Cards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfHands = input.nextInt();
		String[] faces = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] suits = new char[]{'♠', '♥', '♦', '♣'};
		List<String> cards = new ArrayList<String>();
		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cards.add(faces[i] + suits[j]);
			}
		}
		Random rnd = new Random();
		for (int i = 0; i < numberOfHands; i++) {
			for (int j = 0; j < 5; j++) {
				int randomNumber = rnd.nextInt(cards.size());
				System.out.print(cards.get(randomNumber) + " ");
				cards.remove(randomNumber); //to avoid repetition of cards
			}
			System.out.println();
		}

	}

}
