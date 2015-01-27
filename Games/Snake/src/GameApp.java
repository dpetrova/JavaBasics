import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

//GameApp ще служи за main method
public class GameApp extends Applet{
	
	//декларираме полето (понеже класа Game наследява Canvas)
	private Game game;
	InputHandler iHandler;
	
	//този метод ще инициализира полето
	public void init(){
		game = new Game(); //инициализираме нов обект от тип Game
		game.setBackground(Color.LIGHT_GRAY);
		game.setPreferredSize(new Dimension(game.WIDTH, game.HEIGHT+25)); //set-ваме размерите на полето (Canvas-a)
		game.setVisible(true); //правим го видимо
		game.setFocusable(true); //когато се появи полето фокусът ще е върху него
		this.add(game); //добавяме Game към Applet-a
		this.setVisible(true);
		iHandler = new InputHandler(game);
		
	}
	
	//метод paint, който взема като параметър Graphics g, като обекта g го ползваме. за да рисуваме по конзолата
	public void paint(Graphics g){
		this.setSize(800, 650); //set-ваме size на Applet-a
		
	}

}
