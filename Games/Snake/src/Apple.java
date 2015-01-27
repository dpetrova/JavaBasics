import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Apple {
	private Random randGenerator;
	private Box appleBox;
	
	public Apple(){
		appleBox = createApple(Game.snake);
	}
	
	//генерира ябълки
	private  Box createApple(Snake s) { //този метод звема като параметър Snake, за да проверяваме дали ябълката не се генерира върху змията
		randGenerator = new Random();
		int x = randGenerator.nextInt(Game.COLS);
		int y = randGenerator.nextInt(Game.ROWS);
		
		Box b = new Box(x, y);
		//рекурсия: ако ябълката се намира върху змията отново се извиква метода createApple, иначе генерира ябълка (return b)
		if (s.body.contains(b)) {
			return createApple(s); 
		}
		return b;
	}
	
	//метод който рисува ябълката
	public void drawApple(Graphics g) {
		int boxSize = appleBox.BOX_SIZE;
		g.setColor(Color.red);
		g.fillOval(appleBox.x*boxSize, appleBox.y*boxSize, boxSize, boxSize);
	}
	
	public Box getAppleBox(){
		return appleBox;
	}

}
