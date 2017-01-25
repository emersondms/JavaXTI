//Aula25 - Desafio dos Dados

package br.com.xti.logica;

import java.util.Random;
import javax.swing.JOptionPane;

public class DesafioDado {

	public static void main(String[] args) {
		int valorUsuario;
		
		//Palpite do jogador 
		do {
			String chute = JOptionPane.showInputDialog("Chute um numero para o dado: ");
			valorUsuario = Integer.parseInt(chute);
			if(valorUsuario > 6) {
				JOptionPane.showMessageDialog(null, "É um dado jegue só tem 6 numeros");
		    }
		} while(valorUsuario > 6);
		
		//Sorteio do numero pelo computador
		int sort[] = {1, 2, 3, 4, 5, 6};
		Random r = new Random();
		int numSorteado = r.nextInt(sort.length);
		JOptionPane.showMessageDialog(null, "O numero sorteado foi: " + numSorteado);
		
		//Condicao para acerto
		if (valorUsuario == numSorteado) {
			JOptionPane.showMessageDialog(null, "Parabens voce acertou!!!");
			JOptionPane.showMessageDialog(null, "Sabe o que voce acabou de ganhar?");
			JOptionPane.showMessageDialog(null, "Absolutamente nada seu otario!!!");
		} else {
			JOptionPane.showMessageDialog(null, "Voce errou seu incompetente");
		}	
	}
}


