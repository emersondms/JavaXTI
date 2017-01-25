//Aula19 - Desafio do Cálculo do IMC

/**
 * Calcular o Imc
 * Imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
 */

package br.com.xti.logica;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Qual o seu peso?");
		String altura = JOptionPane.showInputDialog("Qual a sua altura?");
		double pesoKg = Double.parseDouble(peso);
		double alturaM = Double.parseDouble(altura);
		double imc = pesoKg / (alturaM * alturaM);	
				
		String msg = (imc >= 20 && imc <=25) ? "Peso Ideal" : "Fora do peso";
		msg = "IMC = " + imc + "\n" + msg;
		JOptionPane.showMessageDialog(null, msg);
	}

}
