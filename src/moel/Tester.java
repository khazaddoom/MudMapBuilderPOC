package moel;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tester extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
	      f.setSize(400, 400);
	      f.add(new Tester());
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setVisible(true);
		
	}
	
	public void paint(Graphics g) {
	      g.fillRect (5, 15, 50, 75);   
	   }

}
