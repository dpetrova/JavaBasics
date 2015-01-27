import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



//тук ще стоят контролите, според които се движи змията
//все едно сме пуснали нов Thread, който върви паралелно с всички останали и слуша кой клавиш сме натиснали
public class InputHandler implements KeyListener{

	//конструктор
	public InputHandler(Game game) {
		game.addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode(); //на всеки клавиш отговаря някакво число
		
		if (keyCode == KeyEvent.VK_UP) { //go Up
			if(Game.snake.getVelY() != 1){ //за да не може да се връща в обратната посока
				Game.snake.setVelX(0); //достъпваме полето snake от класа Game, а snake има методите (getters and setters) с които мовем да сменяме посоката
				Game.snake.setVelY(-1);
			}
		}
		else if (keyCode == KeyEvent.VK_DOWN) { //go Down
			if(Game.snake.getVelY() != -1){
				Game.snake.setVelX(0);
				Game.snake.setVelY(1);
			}
		}
		else if (keyCode == KeyEvent.VK_RIGHT) { //go Right
			if(Game.snake.getVelX() != -1){
				Game.snake.setVelX(1);
				Game.snake.setVelY(0);
			}
		}
		else if (keyCode == KeyEvent.VK_LEFT) { //go Left
			if(Game.snake.getVelX() != 1){
				Game.snake.setVelX(-1);
				Game.snake.setVelY(0);
			}
		}
		
		if (keyCode == KeyEvent.VK_ESCAPE) { //като натиснем Escape да можем да излизаме от играта
			System.exit(0);
		}
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
