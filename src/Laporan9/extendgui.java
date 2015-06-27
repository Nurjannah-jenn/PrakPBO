package Laporan9;

import javax.swing.JFrame;
import javax.swing.JButton;

public class extendgui extends JFrame {
	JButton button;

	public extendgui() {
		super("Hallo");
		button = new JButton("Button Coba");
		add(button);
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	static extendgui gui;

	public static void main(String args[]) {
		gui = new extendgui();
	}
}