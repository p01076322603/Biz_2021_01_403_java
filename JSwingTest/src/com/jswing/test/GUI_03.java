package com.jswing.test;

import javax.swing.JFrame;

public class GUI_03 extends JFrame {

	void openMainFrame() {
		setTitle("Swing 연습");
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GUI_02 mainFrame = new GUI_02();
		mainFrame.openMainFrame();
	}
	
}
