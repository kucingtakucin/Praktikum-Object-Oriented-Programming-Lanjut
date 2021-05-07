package vokasi.d3ti.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PilihBarang extends JFrame implements ActionListener, ChangeListener{

	private static final long serialVersionUID = 1L;
	public JButton tombol_kalkulasi;
	public JRadioButton jenis_beli1, jenis_beli2;
	public final String[] barang = {"PC", "Laptop", "Monitor"};
	public DefaultListModel<?> listModel;	
	public JList<?> pilih_barang;
	public JTextField jumlahBeli;
	public Container container;
	public JLabel label_pilih_barang, label_jenis_beli, label_jumlah_beli;
	public ButtonGroup buttonGroup;
	
	public PilihBarang() {
		this.setTitle("Pilih Barang");
		this.setSize(150, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.container = this.getContentPane();
		this.container.setLayout(new FlowLayout());
		this.container.add(this.label_pilih_barang = new JLabel("Pilih Barang"));
		this.container.add(this.pilih_barang = new JList<String>(this.barang));
		this.container.add(this.label_jenis_beli = new JLabel("Jenis Pembelian"));
		this.container.add(this.jenis_beli1 = new JRadioButton("Member"));
		this.container.add(this.jenis_beli2 = new JRadioButton("Non-Member"));
		this.buttonGroup = new ButtonGroup();
		this.buttonGroup.add(this.jenis_beli1);
		this.buttonGroup.add(this.jenis_beli2);
		this.container.add(this.label_jumlah_beli = new JLabel("Jumlah Pembelian"));
		this.container.add(this.jumlahBeli = new JTextField());
		this.container.add(this.tombol_kalkulasi = new JButton("Kalkulasi"));
		this.setVisible(true);
		this.tombol_kalkulasi.addActionListener((ActionListener) this);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new PilihBarang();
	}

}
