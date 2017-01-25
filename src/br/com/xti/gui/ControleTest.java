//Aula79 - GUI, JTextField, JPasswordField e InnerClass

package br.com.xti.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleTest extends JFrame implements ActionListener {

	JButton ok;
	JButton cancel;
	JTextField login;
	JPasswordField senha;
	
	public ControleTest() {
		super("Textos e Senhas");
		
		ok = new JButton("Ok");
		ok.addActionListener(new BotaoOkListener());
		cancel = new JButton("Cancel");
		cancel.addActionListener(new BotaoCancelListener());
		login = new JTextField();
		
		senha = new JPasswordField();
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new JLabel("Login:"));
		c.add(login);
		c.add(new JLabel("Senha:"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);
		
		setSize(300, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ControleTest();
	}

	
	class BotaoOkListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String s = "Login: " + login.getText() + " | Senha: " + new String(senha.getPassword());
			JOptionPane.showMessageDialog(null, s);
		}
		
	}
	
	class BotaoCancelListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			login.setText("");
			senha.setText("");
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		/*if(e.getSource() == ok){// O getSource() ira pegar a origem do evento
			
		}else if(e.getSource() == cancel){
			
		}*/
	}

}
