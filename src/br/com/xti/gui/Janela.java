//Aula74 - GUI, Introdução JFrame

package br.com.xti.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {

	public Janela(){
		super("Minha Janela");
		//JFrame frame = new JFrame();
		JButton botao = new JButton("Click");
		getContentPane().add(botao);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Janela();
	}

}
