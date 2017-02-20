package com.fryderyk97;

import java.awt.Image;

import javax.swing.ImageIcon;

public class IceFlow extends Sprite{
	
	private int x;
	private int y;
	private Image img;
	
	public IceFlow() {
		initIceFlow();
	}
	
	private void initIceFlow() {
		
		ImageIcon ii = new ImageIcon("Photo//IceFlow.png");
		img = ii.getImage();
		this.x = 100;
		this.y = 100;
		
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public Image getImage() {
		return this.img;
	}

}
