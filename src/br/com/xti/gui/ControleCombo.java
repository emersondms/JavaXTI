//Aula82 - GUI, JComboBox e Álbum de Fotos

package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener {

	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/01.jpg")),
			new ImageIcon(getClass().getResource("fotos/02.jpg")),
			new ImageIcon(getClass().getResource("fotos/03.jpg")),
			new ImageIcon(getClass().getResource("fotos/04.jpg"))
	};
	
	public ControleCombo() {
		super("Album de Fotos");
		
		Container c = getContentPane();
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.PLAIN, 26));
		combo.addItem("Spider Man");
		combo.addItem("Hulk");
		combo.addItem("Iron Man");
		combo.addItem("Wolverine");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		setSize(300, 530);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ControleCombo();
	}

	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED){
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
	}

}
