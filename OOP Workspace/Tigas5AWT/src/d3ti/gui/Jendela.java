package d3ti.gui;
/**
 * @author Adam Arthur Faizal
 * @version 9 April 2021
 * Copyright 2020. Adam Arthur Faizal. All Rights Reserved
 * */


import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Jendela extends Frame implements WindowListener, ActionListener{

	private static final long serialVersionUID = 6519067431398480348L;
	public String timer;
	public TextField field_timer;
	public Label start;
	public Button tombol;

	public Jendela() {
		super("INI ADALAH TIMER");
		this.field_timer = new TextField();
		this.field_timer.setBounds(20, 50, 80, 20);
		this.tombol = new Button("Mundur!");
		this.tombol.setBounds(120, 50, 100, 20);
		this.tombol.addActionListener(this);
		this.start = new Label("Start");
		this.start.setBounds(20, 80, 80, 20);
		this.add(this.field_timer);
		this.add(this.tombol);
		this.add(this.start);
		this.setSize(300, 150);
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Jendela();
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Jendela Opened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Jendela Closing");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Jendela Closed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		Integer angka = 10;
		while(angka > 0) {			
			try {
				Thread.sleep(1000);
				this.start.setText(angka.toString());
				angka--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
