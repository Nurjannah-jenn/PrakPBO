package Laporan9;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class flowlayout extends JFrame {
	public flowlayout() {
		super("Coba FlowLayout");
		setLayout(new FlowLayout());
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void createLayout() {
		for (int i = 0; i < 20; i++)
			add(new JButton("Tombol " + i));
	}

	public static void main(String[] args) {

		new flowlayout();
	}
}