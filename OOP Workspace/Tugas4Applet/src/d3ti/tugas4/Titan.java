package d3ti.tugas4;

/**
 * Copyright 2021. Adam Arthur Faizal. All Rights Reserved
 * @author Adam Arthur Faizal
 * @version 2 Maret 2021
 * */

import java.awt.Image;
import java.net.URL;

public class Titan implements Runnable{

	int x,y;
	Image img;
	Eren eren;
	
	public Titan(Eren yeager, URL p, String img) {
		this.eren = yeager;
		this.x = yeager.getWidth();
		this.y = 0;
		this.img = yeager.getImage(p, img);
		
	}

	public void ubahX(int ubah) {
		this.x = ubah;
	}
	
	public Image getImg() {
		return this.img;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean kiri = true;
		boolean kanan = false;
		boolean atas = false;
		boolean bawah = true;
		while(x > 0) {
			try {
				Thread.sleep(500);
				if (kiri) {
					x -= 50;
					if (this.x < 0) {
//						this.x = this.pacman.getWidth();
						kiri = false;
						kanan = true;
						if (atas) {
							y -= 100;
						}
						if (bawah) {
							y += 100;
						}
					}
				}
				if (kanan) {
					x += 50;
					if (this.x > this.eren.getWidth()) {
						kiri = true;
						kanan = false;
						if (atas) {
							y -= 100;
						}
						if (bawah) {
							y += 100;
						}
					}
				}
				this.eren.repaint();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}
