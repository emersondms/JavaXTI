//Aula98 - Classes Aninhadas e Anônimas

package br.com.xti.refinado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Aninhamento extends JFrame {

	JButton botao;
	
	public Aninhamento() {
		super("Aninhamento");
		
		botao = new JButton("Ok");
		botao.addActionListener(new ListenerAninhado());
		
		// Classe anonima
		botao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Classe anonima executa " + botao.getText());
			}
		});
					
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
		
	// Classe Aninhada
	public class ListenerAninhado implements ActionListener {

		public void actionPerformed(ActionEvent e) {		
			System.out.println("Classe aninhada executa " + botao.getText());
		}
		
	}
	
	public static void main(String[] args) {
		
		Aninhamento janela = new Aninhamento();

		// Instanciando um objeto da classe Listener Aninhado
		Aninhamento.ListenerAninhado listener = janela.new ListenerAninhado();
	}

}
