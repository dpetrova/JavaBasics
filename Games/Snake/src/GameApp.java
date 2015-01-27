import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

//GameApp �� ����� �� main method
public class GameApp extends Applet{
	
	//����������� ������ (������ ����� Game ��������� Canvas)
	private Game game;
	InputHandler iHandler;
	
	//���� ����� �� ������������ ������
	public void init(){
		game = new Game(); //�������������� ��� ����� �� ��� Game
		game.setBackground(Color.LIGHT_GRAY);
		game.setPreferredSize(new Dimension(game.WIDTH, game.HEIGHT+25)); //set-���� ��������� �� ������ (Canvas-a)
		game.setVisible(true); //������ �� ������
		game.setFocusable(true); //������ �� ����� ������ ������� �� � ����� ����
		this.add(game); //�������� Game ��� Applet-a
		this.setVisible(true);
		iHandler = new InputHandler(game);
		
	}
	
	//����� paint, ����� ����� ���� ��������� Graphics g, ���� ������ g �� ��������. �� �� �������� �� ���������
	public void paint(Graphics g){
		this.setSize(800, 650); //set-���� size �� Applet-a
		
	}

}
