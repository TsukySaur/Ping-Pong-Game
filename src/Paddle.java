import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class Paddle extends Rectangle {

	int id;
	int yVelocity; // how fasst paddle will be moving when key is pressed up or down
	int speed = 10;
	
	Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT,int id) {
		super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
		this.id=id;
		
	}
	
	public void keyPressed(KeyEvent e) {
		switch(id) {
		case 1: // paddle 1
			if(e.getKeyCode()==KeyEvent.VK_W) { // w - up
				setYDirection(-speed);
				move();
				
			}
			if(e.getKeyCode()==KeyEvent.VK_S) { // s - down
				setYDirection(speed);
				move();
				
			}
			break;
		case 2: // paddle 1
			if(e.getKeyCode()==KeyEvent.VK_UP) { // w - up
				setYDirection(-speed);
				move();
				
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) { // s - down
				setYDirection(speed);
				move();
			}
			break;
		}
	}
	public void keyReleased(KeyEvent e) {
		switch(id) {
		case 1: // paddle 1
			if(e.getKeyCode()==KeyEvent.VK_W) { // w - up
				setYDirection(0);
				move();
				
			}
			if(e.getKeyCode()==KeyEvent.VK_S) { // s - down
				setYDirection(0);
				move();
				
			}
			break;
		case 2: // paddle 1
			if(e.getKeyCode()==KeyEvent.VK_UP) { // w - up
				setYDirection(0);
				move();
				
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) { // s - down
				setYDirection(0);
				move();
			}
			break;
		}
	}
	public void setYDirection(int yDirection) {
		yVelocity = yDirection;
	}
	public void move() {
		y= y +yVelocity;
	}
	public void draw(Graphics g) {
		if(id==1)
			g.setColor(new Color(244, 171, 196));
		else
			g.setColor(new Color(6, 9, 48));
			g.fillRect(x, y, width, height);
		
	}
	
}
