import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class _04_StraightFlush {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] input = scn.nextLine().split("[ ,]+");
		HashSet<String> cards = new HashSet<>();
		cards.addAll(Arrays.asList(input));
		ArrayList<Integer> spades = new ArrayList<>();
		ArrayList<Integer> hearts = new ArrayList<>();
		ArrayList<Integer> diamonds = new ArrayList<>();
		ArrayList<Integer> clubs = new ArrayList<>();
		for (String card : cards) {
			String face = card.substring(0, card.length() - 1);
			String suit = card.substring(card.length() - 1, card.length());
			int faceWeight;
			switch (face) {
				case "J":	faceWeight = 11;	break;
				case "Q":	faceWeight = 12;	break;
				case "K":	faceWeight = 13;	break;
				case "A":	faceWeight = 14;	break;
				default: faceWeight = Integer.parseInt(face);	break;
			}
			if (suit.equals("S")) {
				spades.add(faceWeight);
			}
			else if (suit.equals("H")) {
				hearts.add(faceWeight);
			}
			else if (suit.equals("D")) {
				diamonds.add(faceWeight);
			}
			else if (suit.equals("C")) {
				clubs.add(faceWeight);
			}
		}
		Collections.sort(spades);
		Collections.sort(diamonds);
		Collections.sort(hearts);
		Collections.sort(clubs);
		
		boolean isFound = false;
		
		if (spades.size() >= 5) {
			for (int i = 0; i < spades.size() - 4; i++) {
				if (spades.get(i) == (spades.get(i + 1) - 1) &&
					spades.get(i) == (spades.get(i + 2) - 2) &&
					spades.get(i) == (spades.get(i + 3) - 3) &&
					spades.get(i) == (spades.get(i + 4) - 4)) {
					String straight = "" + "[" + spades.get(i) + "S, " + spades.get(i + 1) + "S, " + spades.get(i + 2) + "S, " + spades.get(i + 3) + "S, " + spades.get(i + 4) + "S]";
					straight = straight.replace("11", "J");
					straight = straight.replace("12", "Q");
					straight = straight.replace("13", "K");
					straight = straight.replace("14", "A");
					System.out.println(straight);
					isFound = true;					
				}
			}
		}
		
		if (diamonds.size() >= 5) {
			for (int i = 0; i < diamonds.size() - 4; i++) {
				if (diamonds.get(i) == (diamonds.get(i + 1) - 1) &&
					diamonds.get(i) == (diamonds.get(i + 2) - 2) &&
					diamonds.get(i) == (diamonds.get(i + 3) - 3) &&
					diamonds.get(i) == (diamonds.get(i + 4) - 4)) {
					String straight = "" + "[" + diamonds.get(i) + "D, " + diamonds.get(i + 1) + "D, " + diamonds.get(i + 2) + "D, " + diamonds.get(i + 3) + "D, " + diamonds.get(i + 4) + "D]";
					straight = straight.replace("11", "J");
					straight = straight.replace("12", "Q");
					straight = straight.replace("13", "K");
					straight = straight.replace("14", "A");
					System.out.println(straight);
					isFound = true;				
				}
			}
		}
		
		if (hearts.size() >= 5) {
			for (int i = 0; i < hearts.size() - 4; i++) {
				if (hearts.get(i) == (hearts.get(i + 1) - 1) &&
					hearts.get(i) == (hearts.get(i + 2) - 2) &&
					hearts.get(i) == (hearts.get(i + 3) - 3) &&
					hearts.get(i) == (hearts.get(i + 4) - 4)) {
					String straight = "" + "[" + hearts.get(i) + "H, " + hearts.get(i + 1) + "H, " + hearts.get(i + 2) + "H, " + hearts.get(i + 3) + "H, " + hearts.get(i + 4) + "H]";
					straight = straight.replace("11", "J");
					straight = straight.replace("12", "Q");
					straight = straight.replace("13", "K");
					straight = straight.replace("14", "A");
					System.out.println(straight);
					isFound = true;				
				}
			}
		}
		
		if (clubs.size() >= 5) {
			for (int i = 0; i < clubs.size() - 4; i++) {
				if (clubs.get(i) == (clubs.get(i + 1) - 1) &&
					clubs.get(i) == (clubs.get(i + 2) - 2) &&
					clubs.get(i) == (clubs.get(i + 3) - 3) &&
					clubs.get(i) == (clubs.get(i + 4) - 4)) {
					String straight = "" + "[" + clubs.get(i) + "C, " + clubs.get(i + 1) + "C, " + clubs.get(i + 2) + "C, " + clubs.get(i + 3) + "C, " + clubs.get(i + 4) + "C]";
					straight = straight.replace("11", "J");
					straight = straight.replace("12", "Q");
					straight = straight.replace("13", "K");
					straight = straight.replace("14", "A");
					System.out.println(straight);
					isFound = true;					
				}
			}
		}
		
		if (! isFound) {
			System.out.println("No Straight Flushes");
		}

	}

}
