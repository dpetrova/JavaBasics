import java.awt.Color;
import java.awt.Graphics;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;


public class Melon {
	LinkedList<Box> melonBox;
	private Random randGenerator;
	
	public Melon() {
		randGenerator = new Random();
		melonBox = createRandomMelon();
	}
	
	public LinkedList<Box> createRandomMelon() {
		LinkedList<Box> melon = new LinkedList<Box>();
		int x = randGenerator.nextInt(Game.COLS-1);
		int y = randGenerator.nextInt(Game.ROWS-1);
		
		Box firstPos = new Box(x, y);
		Box secondPos = new Box(x+1, y);
		Box thirdPos = new Box(x, y+1);
		Box fourthPos = new Box(x+1, y+1);
		
		Collections.addAll(melon, firstPos, secondPos, thirdPos, fourthPos);
		for (Box box : melon) {
			if (Game.snake.body.contains(box)) {
				return createRandomMelon(); 
			}
		}
		
		return melon;
	}
	
	public void drawMelon(Graphics g) {
		g.setColor(Color.orange);
		g.fillOval(melonBox.peekFirst().x, melonBox.peekFirst().y, 
				melonBox.peekFirst().BOX_SIZE*2, melonBox.peekFirst().BOX_SIZE*2);
	}
		
	
}
