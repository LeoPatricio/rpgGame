package rpgGame;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{
	
	public static int WIDTH = 720;
	public static int HEIGTH = 720;
	
	public Game () {
		this.setPreferredSize(new Dimension(WIDTH, HEIGTH));
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
		
	}

	@Override
	public void run() {
			
		
	}

}
