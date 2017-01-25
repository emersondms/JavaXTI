//Aula23 - if else
//Aula24 - switch
//Aula26 - for
//Aula27 - foreach
//Aula28 - while, do while
//Aula30 - Label, Break e Continue

package br.com.xti.logica;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Fluxo {

	public static void main(String[] args) {
		
//Aula23
		int numero = 10;
		
		if((numero % 2 == 0)) {
			System.out.println("O numero eh par");			
		} else {
			System.out.println("O numero eh impar");
	    }
		
		String age = JOptionPane.showInputDialog("Qual a sua idade? ");
		int idade = Integer.parseInt(age);
		
		if(idade <= 11) {
			JOptionPane.showMessageDialog(null, "Crianca");
		} else if(idade > 11 && idade <= 18) {
			JOptionPane.showMessageDialog(null, "Adolescente");
		} else if(idade > 18 && idade <= 60) {
			JOptionPane.showMessageDialog(null, "Adulto");
		} else {
			JOptionPane.showMessageDialog(null, "Melhor idade");
		}
		
		int nota = 6;
		if(nota >= 7) {
			System.out.println("Passou");
		} else {
			System.out.println("Reprovou");
			if(nota >= 6) {
				System.out.println("Mais pode ficar de recuperacao");
			}
		}
		
		
		
//Aula24	
		char sexo = 'M';		
		switch(sexo) {
		case 'M' : 
			System.out.println("Macho");
			break;
		case 'F':
			System.out.println("Femea");
			break;
		default :
			System.out.println("Hemafrodita");
			
			
		String tecnologia = "postgresql";
		switch(tecnologia){
			case "java" :
			case "c++" :
			case "cobol" :
				System.out.println("Linguagem de programacao");
				break;
			case "oracle" :
			case "sqlserver" :
			case "postgresql" :
				System.out.println("Banco de dados");
				break;
			default :
				System.out.println("Outra tecnologia");
				break;	
		    }
		}
		
		
		
//Aula26
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		
		String texto = "";
		for (int i = 10; i > 0; i--) {
			texto += i + ",";
		}
		System.out.println(texto);
		
		
		texto = "";
		for (int i = 0; i <= 20; i++) {
			if(i % 2 == 0){
			texto += i + ",";
			}
		}
		System.out.println(texto);
		
		
		int tamanho = 5;
		for (int i = 0; i < tamanho; i++) {
			for (int x = 0; x < tamanho; x++) {
			System.out.print("* ");
			}
			System.out.println();
		}		
		
		
		
//Aula27
		int[] pares = {2, 4, 6, 8};
		for(int i = 0; i < pares.length; i++) {
			int par = pares[i];
			System.out.println(par);
		}
		
		//foreach
		for(int par : pares) {
			System.out.println(par);
		}
		
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		//foreach
		for(Integer numeros : list) {
			System.out.println(numero);
		}
		
		
		
//Aula28
		int i = 0;
		while(i < 2) {
			System.out.println(i);
			i++;
		}
		
		i = 3;
		do {
			System.out.println(i);
			i++;
		} while(i < 2);
		
		ArrayList<String> produtos = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Liste seus produtos : Para sair digite fim");
		
		String produto;	
		while(!("fim".equals(produto = s.nextLine()))) {
			produtos.add(produto);
		}
		System.out.println(produtos.toString());
		
		
		
//Aula30 
		for(i = 0; i < 10; i++) {
			if(i == 5) {
				break;//fara com q imprima os numeros de 0 a 4
			}
			System.out.println(i);
		}
		
		for(i = 0; i < 10; i++) {
			if(i == 5) {
				continue;//fara com q pule do numero 4 para o 6
			}
			System.out.println(i);			
		}
		
		boolean[][] matrix = 
			{
				{false, true, false, false, false},
				{false, false, false, false, false}
			};
		
		busca:
		for(int a = 0; a < matrix.length; a++) {
			System.out.print("A ");
			for(int b = 0; b < matrix[a].length; b++) {
				if(matrix[a][b]) {
					System.out.print("true ");
					break busca;
				}
				System.out.print("B ");
			}
		}
    }
}
