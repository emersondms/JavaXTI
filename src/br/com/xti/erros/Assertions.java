package br.com.xti.erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com um numero de 0 a 10");
		int numero = s.nextInt();
		
		assert (numero >= 0 && numero <= 10) : "Numero invalido " + numero;
		System.out.println("Voce entrou com " + numero);
		
		/* 
			Para habilitar as assertion no cmd, depois do comando
			java , -ea (enable assertions), para desabilitar -da 
			
			No eclipse: RunConfigurations\Arguments\VMArguments:-ea 
			
			Para habilitar em um pacote especifico: -ea: endereco
			do pacote... 
		*/

	}

}
