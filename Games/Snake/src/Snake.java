import java.awt.Color;
import java.awt.Graphics;
import java.util.Collections;
import java.util.LinkedList;

import javax.print.attribute.standard.MediaSize.Other;


public class Snake {
	
	public static LinkedList<Box> body; //тялото на змията
	public Box head; //главата на змията
	
	private int velX, velY; //тези полета се правят private; те са достъпни без проблем само в класа Snake,
							//от външни класовеа те се достъпват само през техните методи (getters and setters)
	
	public Snake(){
		body = new LinkedList<Box>();
		//тялото на змията, което се състои от 4 Box-a
		Collections.addAll(body, 
				new Box(1, 2),
				new Box(2, 2),
				new Box(3, 2),
				new Box(4, 2) //тази кутийка е главата
				);
		
		head = body.peekLast(); //казва вземи ми последния елемент от LinkedList, т.е тук главата
		//началната позиция и посока
		velX = 1;
		velY = 0;
	}
	
	//метод, който ще визуализира на конзолата змията
	public void drawSnake(Graphics g){
		//всеки един обект от LinkedList да го начертае на конзолата
		for (Box box : body) {
			
			//draw the body of the box
			g.setColor(Color.green);
			g.fillRect(box.x * box.BOX_SIZE, box.y * box.BOX_SIZE, box.BOX_SIZE, box.BOX_SIZE);
			
			//draw the border of each box
			g.setColor(Color.black);
			g.drawRect(box.x * box.BOX_SIZE, box.y * box.BOX_SIZE, box.BOX_SIZE, box.BOX_SIZE); //понеже координатите са в пиксели, се умножават х и у по BOX_SIZE който е 20 пиксела
					
		}
	}
	
	//метод, който да движи змията
	public void tick(){
		head = body.peekLast();
		//един нов Box, който ще е новата позиция, където трябва да отиде главата
		Box nextPos =  new Box(head.x + velX, head.y + velY);
		
		//проверка дали змията излиза извън полето
		boolean outOfBounds = 
				nextPos.x >= Game.COLS || nextPos.x < 0 ||
				nextPos.y >= Game.ROWS || nextPos.y < 0;
		
		//сравняваме дали главата е равна на ябълката и ако да все едно сме изяли ябълката и змията се увеличава с 1
		if (nextPos.equals(Game.apple.getAppleBox())) { //за всяка изядена ябълка + 10 точки
			Game.score += 10;
			body.add(Game.apple.getAppleBox());
//			if (Game.score % 40 == 0) {
//				Game.melon = new Melon();
//			}
			Game.apple = new Apple();
			Game.changeSpeed();
		}
		else if (body.contains(nextPos)) { //змията умира ако се захапе
			Game.gameRunning = false;
		}
		else if (outOfBounds) { //ако излезе от полето променя координатите си
			nextPos = changeSnakeBox();
		}
		
		//с for-цикъл минаваме през всички елементи на змията (без главата) и им променяме позициите (всеки един заема координатите на предишния)
		for (int i = 0; i < body.size()-1; i++) {
			body.set(i, body.get(i+1)); //всяка позиция е равна на следващата
		}
		
		//инициализираме отново главата
		body.set(body.size()-1, nextPos);
		
	}

	//змията да излиза през стените
	private Box changeSnakeBox() {
		Box nextPos = new Box(0, 0);
		if (velX == 1 && velY == 0) { //излизаме отдясно
			nextPos = new Box(0, head.y);
		}
		else if (velX == -1 && velY == 0) { //излиза отляво
			nextPos = new Box(Game.COLS-1, head.y);
		}
		else if (velX == 0 && velY == 1) { //излиза отдолу
			nextPos = new Box(head.x, 0);
		}
		else if (velX == 0 && velY == -1) { //излиза отгоре
			nextPos = new Box(head.x, Game.ROWS-1);
		}
		return nextPos;
		
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}
	

}
