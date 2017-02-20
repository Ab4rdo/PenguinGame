package com.fryderyk97;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Penguin {
	
	private int dx;
	private int dy;
	private int x;
	private int y;
	private Image pG;
	
	public Penguin() {
		
		initPenguin();
	}
	
	private void initPenguin() {
		
		ImageIcon ii = new ImageIcon("Photo//Penguin.png");
		pG = ii.getImage();
		x = 225;
		y = 225;
	}
	
	public void move() {
		x += dx;
		y += dy;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Image getImage() {
		return pG;
	}
	
	public void keyPressed(KeyEvent e){
		
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT) {
			dx = -10;
		}
		
		if (key == KeyEvent.VK_RIGHT) {
			dx = 10;
		}
		
		if (key == KeyEvent.VK_UP) {
			dy = -10;
		}
		
		if (key == KeyEvent.VK_DOWN) {
			dy = 10;
		}
	}
	
	public void keyReleased(KeyEvent e){
		
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}
		
		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
		
		if (key == KeyEvent.VK_UP) {
			dy = 0;
		}
		
		if (key == KeyEvent.VK_DOWN) {
			dy = 0;
		}
	}
	
	
	

}
