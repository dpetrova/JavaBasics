import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



//��� �� ����� ����������, ������ ����� �� ����� ������
//��� ���� ��� ������� ��� Thread, ����� ����� ��������� � ������ �������� � ����� ��� ������ ��� ���������
public class InputHandler implements KeyListener{

	//�����������
	public InputHandler(Game game) {
		game.addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode(); //�� ����� ������ �������� ������� �����
		
		if (keyCode == KeyEvent.VK_UP) { //go Up
			if(Game.snake.getVelY() != 1){ //�� �� �� ���� �� �� ����� � ��������� ������
				Game.snake.setVelX(0); //���������� ������ snake �� ����� Game, � snake ��� �������� (getters and setters) � ����� ����� �� ������� ��������
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
		
		if (keyCode == KeyEvent.VK_ESCAPE) { //���� �������� Escape �� ����� �� �������� �� ������
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
