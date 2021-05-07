package vokasi.d3ti.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Mahasiswa extends JFrame implements ActionListener, ChangeListener{

	private static final long serialVersionUID = 1L;
	public ButtonGroup buttonGroup;
	public JRadioButton radioButton1, radioButton2;
	public JComboBox<?> comboBox;
	public JButton jbutton;
	public final String[] jenis = {"Laki-laki", "Perempuan"};
	public JMenuBar menuBar;
	public JMenu jmenu;
	
	public Mahasiswa() {
		super("Mahasiswa");
		this.setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());
		this.menuBar = new JMenuBar();
		this.menuBar.add(this.jmenu = new JMenu("Exit"));
		this.jmenu.addChangeListener((ChangeListener) this);
		this.setJMenuBar(menuBar);
		container.add(radioButton1 = new JRadioButton("Laki-laki"));
		container.add(radioButton2 = new JRadioButton("Perempuan"));
		this.buttonGroup = new ButtonGroup();
		this.buttonGroup.add(radioButton1);
		this.buttonGroup.add(radioButton2);
		container.add(this.comboBox = new JComboBox<String>(jenis));
		container.add(this.jbutton = new JButton("Simpan"));
		this.setVisible(true);
		this.jbutton.addActionListener((ActionListener) this);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.jmenu) {
			System.exit(0);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.jbutton) {
			String radio = null;
			if (this.radioButton1.isSelected()) {
				radio = this.radioButton1.getText().toString();
			} else {
				radio = this.radioButton2.getText().toString();
			}
			System.out.printf("Radio Button memilih %s\n", radio);
			String combo = this.comboBox.getSelectedItem().toString();
			System.out.printf("ComboBox memilih %s\n", combo);
			
		}
	}
	
	public static void main(String[] args) {
		new Mahasiswa();
	}

}
