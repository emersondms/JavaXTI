//Aula80 - Desafio Calculadora

package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	JTextField numeros;
	JButton zero;	
	JButton um;
	JButton dois;	
	JButton tres;	
	JButton quatro;	
	JButton cinco;	
	JButton seis;	
	JButton sete;
	JButton oito;
	JButton nove;	
	JButton barra;	
	JButton mult;	
	JButton menos;	
	JButton mais;	
	JButton igual;	
	JButton ponto;
	
	public Calculadora() {
		super("Calculadora");
		
		JTextField numeros = new JTextField();
		Font f = new Font("serif", Font.BOLD, 28);
		numeros.setFont(f);
		JButton zero = new JButton("0");
		JButton um = new JButton("1");		
		JButton dois = new JButton("2");		
		JButton tres = new JButton("3");		
		JButton quatro = new JButton("4");		
		JButton cinco = new JButton("5");		
		JButton seis = new JButton("6");		
		JButton sete = new JButton("7");		
		JButton oito = new JButton("8");	
		JButton nove = new JButton("9");		
		JButton barra = new JButton("/");		
		JButton mult = new JButton("*");		
		JButton menos = new JButton("-");		
		JButton mais = new JButton("+");		
		JButton igual = new JButton("=");		
		JButton ponto = new JButton(".");
		
		Container c = new JPanel();	
		c.setLayout(new GridLayout(4, 4, 5, 5));		
		c.add(sete);
		c.add(oito);
		c.add(nove);
		c.add(barra);
		c.add(quatro);
		c.add(cinco);
		c.add(seis);
		c.add(mult);
		c.add(um);
		c.add(dois);
		c.add(tres);
		c.add(menos);
		c.add(zero);
		c.add(ponto);
		c.add(igual);
		c.add(mais);
	
		Container c2 = getContentPane();
		c2.setLayout(new BorderLayout());		
		c2.add(BorderLayout.NORTH, numeros);
		c2.add(BorderLayout.CENTER, c);

		setSize(300, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		new Calculadora();		
	}

}
