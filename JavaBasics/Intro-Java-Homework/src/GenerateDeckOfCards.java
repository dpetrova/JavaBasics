import javax.swing.*;

public class GenerateDeckOfCards {

	public static void main(String[] args) {
		String[] face = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String spade = "♠";
		String heart = "♥";
		String diamond = "♦";
		String club = "♣";
		String[] suit = new String[]{spade, heart, diamond, club};
		String card = "";
		for (int i = 0; i < face.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				card = face[i] + suit[j];
				System.out.print(card);
			}
			System.out.println();
		}
	}

}
