package d3ti.tugas4;

/**
 * Copyright 2021. Adam Arthur Faizal. All Rights Reserved
 * @author Adam Arthur Faizal
 * @version 2 Maret 2021
 * */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Eren extends Applet implements KeyListener {
	private Image eren;
	private int x,y;
	Titan titan;
	Thread thtitan;
	
	private static final long serialVersionUID = -7723314800269566593L;

	@Override
	public void init() {
		this.x = 15;
		this.y = 15;
		addKeyListener(this);
		setSize(1720, 1080);
		this.titan = new Titan(this, getDocumentBase(), "titanchibi.png");
		this.eren = getImage(getDocumentBase(), "ERENN.png"); 
		this.titan.ubahX(getWidth() / 2);
		this.thtitan = new Thread(titan);
		thtitan.start();
	}
	
	@Override
	public void paint(Graphics g) {
		setBackground(Color.gray);
		g.setColor(Color.gray);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.drawImage(this.eren, this.x, this.y, this);
		g.drawImage(this.titan.getImg(),this.titan.getX(), this.titan.getY(), this);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
			case KeyEvent.VK_RIGHT: x = x + 20;
				this.repaint();
				System.out.println("kanan");
				break;
			case KeyEvent.VK_LEFT: x = x - 20;
				System.out.println("kiri");
				this.repaint();
				break;
			case KeyEvent.VK_UP: y = y - 20;
				System.out.println("bawah");
				this.repaint();
				break;
			case KeyEvent.VK_DOWN: y = y + 20;
				System.out.println("atas");
				this.repaint();
				break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
