package Laporan9;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class guicoba {
	public static void main(String args[]) throws Exception {
		JFrame frame = new JFrame("Laporan 8");
		JLabel label = new JLabel("Label Percobaan");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
}