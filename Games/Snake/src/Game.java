import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class Game extends Canvas implements Runnable{
	//��������� �� grid � 30 ���� � 30 ������, ���� ����� ������ � � �������� 20 �������
	public static final int ROWS = 30;
	public static final int COLS = 30;
	public static final int SIZE = 20;
	public static final int WIDTH = COLS*SIZE; //�������� �� Canvas-�
	public static final int HEIGHT = ROWS*SIZE; //���������� �� Canvas-�

	public static Snake snake; //���� �� ����� Game
	public static Apple apple;
	
	
	//������ ������ Thread ���� ������� ���� �� �� ���������� ������
	private Thread runThread;
	public static Graphics globalGraphics;
	
	public static int threadSpeed;
	public static int score;
	
	static boolean gameRunning = false;
	
	//������������ �� ���������
	public void paint(Graphics g){
		globalGraphics = g.create();
		
		//�� ������ Thread-�
		if (runThread == null) {
			runThread = new Thread(this);
			runThread.start();
			gameRunning = true; //����� �� ������
		}
	}
	
	public Game(){
		snake = new Snake();
		apple = new Apple();
		score = 0;
		threadSpeed = 100;
	}
	
	public void run() {
		//�������� �����: ������ ������ ����� ����� ������� ������
		while (gameRunning) {
			snake.tick(); //����� �� ���������� ������ �� � ������� (��������)
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
	
	//�� ����� 5 ������� ������ ����������� ���������
	public static void changeSpeed(){
		if (Game.score % 50 == 0) { 
			Game.threadSpeed -= 10;
		}
	}
		
	//� ���� ����� �� �������� ������ ����
	public void render(Graphics g){
		g.clearRect(0, 0, WIDTH, HEIGHT); //����� ��� ���� �� ������ render-� �������� ������, ����� � ���� ������ �� ������ � ���� ���� ������ �� ���� � ������ �������
		snake.drawSnake(g);
		apple.drawApple(g);
		this.drawScore(g);
	}
	
	//������ �������
	public void drawScore(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0, Game.HEIGHT, Game.WIDTH, 25);
		g.setColor(Color.white);
		g.drawString("score = " + score, 10, Game.WIDTH + 15);
	}
	
	//������ "���� �� ������"
	private void drawDeath(Graphics g) {
		g.setColor(Color.white);
		g.drawString("YOU DEATH!", Game.WIDTH/2, Game.HEIGHT/2);
	}
	
	
}
