//Aula75 - GUI, BorderLayout e FlowLayout 

package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {

	public Layouts() {
		super("Layouts");
		
		Container c = getContentPane();
		//BorderLayout border = new BorderLayout();
		FlowLayout border = new FlowLayout();
		c.setLayout(border);
		
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		
		/*c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));
		c.add(BorderLayout.CENTER, new JButton("3"));
		c.add(BorderLayout.EAST, new JButton("4"));
		c.add(BorderLayout.WEST, new JButton("5"));*/
		
		/*getContentPane().add(new JButton("1"));
		getContentPane().add(new JButton("2"));*/
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Layouts();
	}

}
