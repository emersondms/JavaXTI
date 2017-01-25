//Aula78 - GUI, Jlabel e ImageIcon 

package br.com.xti.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {

	public ControleLabel(){
		super("Label");
		
		JLabel simples = new JLabel("Label Simples");
		simples.setToolTipText("Meu tooltip");// Frase que aparece quando a seta do mouse esta em cima do texto do label
		
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28);
		JLabel label = new JLabel("Label Simples");
		label.setFont(fonte);
		label.setForeground(Color.BLUE);
		
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/spider.png"));
		JLabel imagem = new JLabel(icon);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simples);
		c.add(label);
		c.add(imagem);
		
		setSize(300, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ControleLabel();
	}

}
