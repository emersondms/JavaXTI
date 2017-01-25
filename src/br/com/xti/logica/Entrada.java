//Aula11 - Entrada de Dados com Scanner
//Aula12 - Entrada Gráfica de Dados com JOptionPane

package br.com.xti.logica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
		
//Aula11
		//Na chamada do programa
		//System.out.println(args[0]);
		
		//Interagindo com o usuario
		Scanner s = new Scanner(System.in);
		System.out.println("Qual o seu nome? ");
		String nome = s.nextLine();
		System.out.println("Bem vindo " + nome);
		
		
		
//Aula12
		String nome1 = JOptionPane.showInputDialog("Qual o seu nome?");
		System.out.println(nome1);
		JOptionPane.showMessageDialog(null, nome1);
		
	}

}
