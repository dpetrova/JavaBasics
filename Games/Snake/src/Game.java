import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class Game extends Canvas implements Runnable{
	//създаваме си grid с 30 реда и 30 колони, като всяка клетка е с големина 20 пиксела
	public static final int ROWS = 30;
	public static final int COLS = 30;
	public static final int SIZE = 20;
	public static final int WIDTH = COLS*SIZE; //ширината на Canvas-а
	public static final int HEIGHT = ROWS*SIZE; //височината на Canvas-а

	public static Snake snake; //поле на класа Game
	public static Apple apple;
	
	
	//когато пуснем Thread може няколко неща да се изпълняват заедно
	private Thread runThread;
	public static Graphics globalGraphics;
	
	public static int threadSpeed;
	public static int score;
	
	static boolean gameRunning = false;
	
	//визуализация на графиките
	public void paint(Graphics g){
		globalGraphics = g.create();
		
		//да пуснем Thread-а
		if (runThread == null) {
			runThread = new Thread(this);
			runThread.start();
			gameRunning = true; //пусни ми играта
		}
	}
	
	public Game(){
		snake = new Snake();
		apple = new Apple();
		score = 0;
		threadSpeed = 100;
	}
	
	public void run() {
		//безкраен цикъл: докато играта върви прави някакви работи
		while (gameRunning) {
			snake.tick(); //преди да изрисуваме змията ще я тикваме (движение)
			render(globalGraphics);
			try {
				Thread.sleep(threadSpeed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.drawDeath(globalGraphics);
	}
	
	//на всеки 5 изядени ябълки увеличаваме скоростта
	public static void changeSpeed(){
		if (Game.score % 50 == 0) { 
			Game.threadSpeed -= 10;
		}
	}
		
	//с този метод ще рисуваме всички неща
	public void render(Graphics g){
		g.clearRect(0, 0, WIDTH, HEIGHT); //всеки път като се извика render-а изчиства всичко, което е било досега на полето и след това рисува на ново с новите позиции
		snake.drawSnake(g);
		apple.drawApple(g);
		this.drawScore(g);
	}
	
	//рисува точките
	public void drawScore(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0, Game.HEIGHT, Game.WIDTH, 25);
		g.setColor(Color.white);
		g.drawString("score = " + score, 10, Game.WIDTH + 15);
	}
	
	//рисува "Край на играта"
	private void drawDeath(Graphics g) {
		g.setColor(Color.white);
		g.drawString("YOU DEATH!", Game.WIDTH/2, Game.HEIGHT/2);
	}
	
	
}
