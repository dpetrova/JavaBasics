
public class _03_FullHouse {
	public static void main(String[] args) {
		String[] faces = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suits = new String[]{"♠", "♥", "♦", "♣"};
		int counter = 0;
		for (int f1 = 0; f1 < faces.length; f1++) {
			for (int f2 = 0; f2 < faces.length; f2++) {
				if (f1 == f2) {
					continue;
				}
				for (int s1 = 0; s1 < suits.length; s1++) {
					for (int s2 = s1 + 1; s2 < suits.length; s2++) {
						for (int s3 = s2 + 1; s3 < suits.length; s3++) {
							for (int s4 = 0; s4 < suits.length; s4++) {
								for (int s5 = s4 + 1; s5 < suits.length; s5++) {
									String fullHouse = "" + faces[f1] + suits[s1] + " " + faces[f1] + suits[s2] + " " + faces[f1] + suits[s3] + " " + faces[f2] + suits[s4] + " " + faces[f2] + suits[s5];
									counter++;
									System.out.printf("(%s) ", fullHouse);
								}
							}
						}
					}
				}
			}
		}
		System.out.println();
		System.out.println(counter + " full houses");
	}
}
