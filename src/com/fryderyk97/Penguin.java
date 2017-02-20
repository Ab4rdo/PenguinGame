package com.fryderyk97;

import java.awt.Image;

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

	public int getDx() {
		return dx;
	}

	public int getDy() {
		return dy;
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
	
	
	
	
	

}
