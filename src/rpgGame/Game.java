package rpgGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Game extends Canvas implements Runnable{
	
	public static int WIDTH = 720;
	public static int HEIGTH = 720;
	
	public Player player;
	
	public Game () {
		this.setPreferredSize(new Dimension(WIDTH, HEIGTH));
		player = new Player(0, 0);
	}
	
	public void tick() {
		player.tick();
		
	}
	
	public void render() {
		
		BufferStrategy bs = this.getBufferStrategy();
		
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGTH);
		
		player.render(g);
		
		bs.show();
	}
	
	
	public static void main (String[] args){
		
		Game game = new Game();
		JFrame frame = new JFrame();
		
		frame.add(game);
		frame.setTitle("rpg_Game");
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		new Thread(game).start();
		
	}

	@Override
	public void run() {
		
		while(true) {
			System.out.println("Game looping!");
			
			tick();
			render();
			
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
		
	}

}
