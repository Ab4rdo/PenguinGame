package com.fryderyk97;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel{
	
	private Image backgroundImage;
	private Penguin ben;

	public Board() {
		
		initBoard();
	}
	
	private void initBoard() {
		
		ben = new Penguin();
	
		loadImage();
		
		int w = backgroundImage.getWidth(this);
		int h = backgroundImage.getHeight(this);
		setPreferredSize(new Dimension(w,h));
	}
	
	private void loadImage() {
		ImageIcon ii = new ImageIcon("Photo//background.png");
		backgroundImage = ii.getImage();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, null);
		drawSqBoard(g);
		drawPenguin(g);
	}
	 
	private void drawSqBoard(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;
		
		for(int i = 70; i < 401; i=i+52){
			for(int j = 70; j < 401; j=j+52){
				g2d.drawImage(new IceFlow().getImage(), i, j, null);
			}
		}
		
	}
	
	private void drawPenguin(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(ben.getImage(), ben.getX(), ben.getY(), null);
		
		
	}
	
	
}
