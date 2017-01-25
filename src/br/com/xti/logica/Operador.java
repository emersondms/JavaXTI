//Aula13 - Operadores
//Aula14 - Operadores Matemáticos
//Aula15 - Operadores de Comparação
//Aula16 - Operadores Lógicos
//Aula17 - Operadores de Atribuição
//Aula18 - Operadores Especiais

package br.com.xti.logica;

import java.util.Scanner;

public class Operador {

	public static void main(String[] args) {

//Aula13
		//2 + 3 operador binario
		//-2 operador unario
		//true? "Sim" : "Não" operador ternario
		
		int x = 9 + 4; // = operador de atribuicao
		System.out.println(x);
		
		String y = "9" + "4"; // + concatena strings
		System.out.println(y);
		
		double z = 7 - 4 + 3 * 2;
		System.out.println(z);
		
		z = (7 - 4 + 3) * 2;
		System.out.println(z);
		
		
		
//Aula14
		z = 7 % 3; //modulo = resto da divisao
		System.out.println(z);
		
		z = - (+ 3);
		System.out.println(z);
		z = - (- 3);
		System.out.println(z);
		
		x = 6;
		z = ++x;//pre-incremento ou decremento(--)
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		
		x = 6;
		z = x++;//pos-incremento ou decremento(--)
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		
		
		
//Aula15
		x = 6;
		//== operador de comparacao
		System.out.println(x == 6);//true
		System.out.println(x == 7);//false
		//System.out.println(x == "6");//tipos imcompativeis
		
		//!= operador de negacao
		System.out.println(x != 6);//false
		
		//<> <==> maior ou igual / menor ou igual
		System.out.println(x > 6);//false
		System.out.println(x <= 6);//true
		
		//instanceof compara tipos de objetos
		Integer x1 = 6;
		System.out.println(x1 instanceof Integer);//true
		System.out.println("Java" instanceof String);//true
		
				
		
//Aula16
		//&& and
		System.out.println((x1 >= 1) && (x <= 5));//false
		
		//|| or
		System.out.println((x1 >= 1) || (x <= 5));//true
		
		//! not
		System.out.println(!(x1 >= 1));//false
		

				
//Aula17
		x1 = 6;
		x1 = x1 + 3;
		x1 += 3;//forma simplificada de somar ou -=, *=, /=, %=
		
		
		
//Aula18
		Scanner s = new Scanner(System.in);
		int idade = 6;
		String x2 = (idade >= 18) ? "Maior de idade" : "Menor de idade";
		System.out.println(x2);
		
		String sexo = "M", pais = "Brasil";
		
		
		//Diametro : 2r
		System.out.println("Informe o raio: ");
		double raio = s.nextDouble();
		double diametro = 2 * raio;
		System.out.println("Diametro = " + diametro);
		
		//Circunferencia : 2 PI r
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		System.out.println("Circunferencia = " + circunferencia);
		
		//Area PI r2
		double area = pi * (raio * raio);
		System.out.println("Area = " + area);
	}
	

}
