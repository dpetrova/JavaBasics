import java.util.HashSet;
import java.util.Set;


public class _04_FullHouseWithJokers {

	public static void main(String[] args) {
		String[] faces = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] suits = new char[]{'♠', '♥', '♦', '♣'};
		char joker = '*';
		String[] fullHouse = new String[5];
		Set<String> setOfFullHouses = new HashSet<String>();
		for (int f1 = 0; f1 < faces.length; f1++) { // first three cards
			for (int f2 = 0; f2 < faces.length; f2++) { // last two cards
				if (f1 == f2) { // avoid repetition between first 3 cards and second 2 cards
					continue;
				}
				for (int s1 = 0; s1 < suits.length; s1++) { // suit for first card
					for (int s2 = s1 + 1; s2 < suits.length; s2++) { // suit for second card
						for (int s3 = s2 + 1; s3 < suits.length; s3++) { // suit for third card
							for (int s4 = 0; s4 < suits.length; s4++) { // suit for fourth card
								for (int s5 = s4 + 1; s5 < suits.length; s5++) { // suit for fifth card
									for (int num = 0; num <= 31; num++) { // numbers from 0 (00000 as binary) to 31 (11111 as binary) are all possible combinations of 0 and 1 and may be used for generate fullHouses with jokers
										fullHouse[0] = faces[f1] + suits[s1];
										fullHouse[1] = faces[f1] + suits[s2];
										fullHouse[2] = faces[f1] + suits[s3];
										fullHouse[3] = faces[f2] + suits[s4];
										fullHouse[4] = faces[f2] + suits[s5];
										for (int pos = 0; pos < 5; pos++) { // all positions with bits == 1 are replaced with jokers
											if (((num >> pos) & 1) == 1) {
											fullHouse[(fullHouse.length - 1) - pos] = Character.toString(joker);
											}
										}
										setOfFullHouses.add("(" + fullHouse[0] + fullHouse[1]
													+ fullHouse[2] + fullHouse[3] + fullHouse[4] + ")"); // add fullHouse to Set
									}
								}
							}
						}
					}
				}
			}
		}
		for (String fullsHouses : setOfFullHouses) {
            System.out.print(fullsHouses + " ");
		}
		System.out.println();
		System.out.println(setOfFullHouses.size() + " full houses");
	
	}
}
