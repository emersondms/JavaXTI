//Aula06 - Variaveis e Sintaxe
//Aula07 - Tipos Primitivos
//Aula08 - Introducao ao Garbage Collector
//Aula09 - Constantes e Modificador Final
//Aula10 - Wrapper Classes (Envólucros de Tipos Primitivos)

/**
 * Apresentar os conceitos de variavel
 * @author Emerson Delmondes
 */

package br.com.xti.logica;

public class Variavel {

	public static void main(String[] args) {
		
//Aula06
		String nome = "Emerson";
		String nome1, segundoNome, terceiroNome; 
		int idade = 19;
		boolean casado = false;
		System.out.println(nome);
		
		
//Aula07
		int idade_ = 31;
		double preco = 12.45;
		char sexo = 'M';
		boolean casado_ = false;
		byte b = 127; //ate 127
		short s = 32000; //ate 32mil
		int i = 2_000_000_000; //ate 2bilhoes
		long l = 9_000_000;//... //ate 9quintilhoes
		double d = 1.7976931348623157E+308; //IEEE 754
		float f = 123F;
		
		i = s; //cast implicito
		System.out.println(s);
		System.out.println(i);
		
		i = (int) l; //cast explicito
		System.out.println(s);
		System.out.println(i);
		
		byte bb = 0b01010101; //8bits (1byte)
		short ss = 0b0101010101010101; //16bits (2bytes)
		int ii = 0b01010101010101010101010101010101; //32bits (4bytes)
		System.out.println(ii);
		
		
//Aula08
		//variavel primitiva
		int x = 7;
		x = 9;
		
		//variavel de referencia
		String y = "XTI";
		y = "xti.com.br";
		y = null;

		
//Aula09
		final double PI = 3.14159265358979323846;
		//PI = 942 => Erro(o valor de final nao pode ser alterado)
		final char SEXO_MASCULINO = 'M';
		final char SEXO_FEMININO = 'F';
		/* constantes devem ser declaradas com uppercase
		e nomes compostos separados por underline */
		
		
//Aula10
		Double preco_ = new Double("12.45");
		double d_ = preco_.doubleValue();
		int i_ = preco_.intValue();
		byte b_ = preco_.byteValue();
		Boolean casado_1 = new Boolean("true");
		
		//Conversao estatica
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");
		int i2 = Integer.valueOf("101011", 2); //O n2 eh pq a conversao eh de base binaria
		System.out.println(i2);
	}

}
