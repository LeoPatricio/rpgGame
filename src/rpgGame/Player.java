package rpgGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class Player extends Rectangle {
	
	public int spd = 4;
	public boolean up, down, left, rigth;
	
	public Player(int x, int y) {
		super(x, y, 54, 54);
		
	}
	
	public void tick() {
		
		if(rigth) {
			x+=spd;
		}else if(left) {
			x-=spd;
		}
		
		if(up) {
			y-=spd;
		}else if(down) {
			y+=spd;
		}
		
		
	}
	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}
}
