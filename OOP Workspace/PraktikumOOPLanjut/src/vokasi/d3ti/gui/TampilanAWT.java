package vokasi.d3ti.gui;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("deprecation")
public class TampilanAWT extends Frame implements WindowListener {
	private static final long serialVersionUID = 1L;
	public String nim, nama, jenis_kelamin, tempat_lahir, tanggal_lahir;
	public TextField field_nim, field_nama, field_tempat_lahir, field_tanggal_lahir;
	public Choice pilihan;
	public TextArea alamat;
	public Button b;
	
	public TampilanAWT() {
		super("Data Diisi");
		Panel p = new Panel();
//		add(p);
		p.setSize(250, 300);
		
		p.setLayout(new GridLayout(100,200));
		
		p.add(new Label("nim"));
		p.add(this.field_nim = new TextField());
		
		p.add(new Label("nama"));
		p.add(this.field_nama = new TextField());
		
		p.add(new Label("jenis kelamin"));
		pilihan = new Choice();
		pilihan.add("Laki-laki");
		pilihan.add("Perempuan");
		p.add(pilihan);
		
		p.add(new Label("tanggal lahir"));
		p.add(this.field_tanggal_lahir = new TextField());
	
		
//		p.add(new Label(""))
		p.add(new Button("submit"));
		
		setVisible(true);
		addWindowListener(this);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(ABORT);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
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
	
	public boolean action(Event e, Object obj) {
		return false;
		
	}
}
