package id.ac.uns.vokasi.d3ti.applet;
//TID - M3119085 - TRI WULANDARI
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MateriPertama extends Applet implements KeyListener {
	Image img,img2;
	int x,y;
	
	public void init() {
		x=0;
		y=0;
		img=getImage(getDocumentBase(),"pagman.png");
		img2=getImage(getDocumentBase(),"food.png");
		addKeyListener(this);
	}
	
	public void paint(Graphics g) {
		setBackground(Color.RED);
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.drawRect(100, 100, 300, 300);
		
		g.setColor(Color.WHITE);
		g.drawLine(10, 40, 100, 40);//yg kodebawah, tampilan terdepan
		g.drawArc(30, 30, 50, 50, 0, 360);//menggambarkan lingkaran
		//start di 0, berakhir di 360*
		
		//untuk pacman
		g.drawImage(img, x, y, this);
		
//		kotaJalan(g);
//		foodJalan(g);
		
		for(int i=200;i<1500;i+=50) {
//			g.setColor(Color.YELLOW);
//			g.fillArc(i, 100, 40, 40, 0, 360);
			img2=getImage(getDocumentBase(),"food.png");
			g.drawImage(img2, i, 100, this);
		}
		
		
	}
	public void foodJalan(Graphics g) {
		//kotak berjalan
				for(int i=300; i<500; i+=50) {
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//waktu jeda
					g.drawImage(img2, i, 500, this);
					repaint();
				}
	}
	
	public void kotaJalan(Graphics g) {
		//kotak berjalan
				for(int i=0; i<50; i+=10) {
					g.setColor(Color.DARK_GRAY);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//waktu jeda
					g.fillRect(i, 30, 20, 20);
					repaint();
				}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:x=x+20;
		System.out.println("kanan");
		break;
		case KeyEvent.VK_LEFT:x=x-20;
		System.out.println("kiri");
		break;
		case KeyEvent.VK_UP:y=y-20;
		System.out.println("bawah");
		break;
		case KeyEvent.VK_DOWN:y=y+20;
		System.out.println("atas");
		break;
		
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
