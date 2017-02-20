package com.fryderyk97;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener{
	
	private Image backgroundImage;
	private Penguin ben;
	private Timer timer;
	private final int DELAY = 10;

	public Board() {
		
		initBoard();
	}
	
	private void initBoard() {
		
		ben = new Penguin();
	
		loadImage();
		
		int w = backgroundImage.getWidth(this);
		int h = backgroundImage.getHeight(this);
		setPreferredSize(new Dimension(w,h));
		
		addKeyListener(new TAdapter());
		setFocusable(true);
		
		timer = new Timer(DELAY, this);
		timer.start();
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
		
		Toolkit.getDefaultToolkit().sync();
	}
	 
	private void drawSqBoard(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;
		
		for(int i = 70; i < 401; i=i+52){
			for(int j = 70; j < 401; j=j+52){
				g2d.drawImage(new IceFlow().getImage(), i, j, this);
			}
		}
	}
	
	private void drawPenguin(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(ben.getImage(), ben.getX(), ben.getY(), this);
	}
	
	public void actionPerformed(ActionEvent e) {
		ben.move();
		repaint();
	}
	
	private class TAdapter extends KeyAdapter {
		
		public void keyReleased(KeyEvent e){
			ben.keyReleased(e);
		}
		
		public void keyPressed(KeyEvent e){
			ben.keyPressed(e);
		}
	}
}
