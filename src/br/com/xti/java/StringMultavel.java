//Aula60 - Stringbuffer e Stringbuilder 

package br.com.xti.java;

public class StringMultavel {

	public static void main(String[] args) {
		
		/* A unica diferen�a entre StringBuilder e StringBuffer � que os metodos 
		do StringBuilder n�o s�o sincronizados ou seja n�o s�o confiaveis se 
		estiverem usando thread. A Sun recomenda usar o StringBuilder sempre que
		possivel ao inves do StringBuffer. Alem disso as duas classes s�o identicas.*/
		
		StringBuffer s = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		
		// Metodo para verificar qual a capacidade de armazenamento da String sem alocar mais memoria
		System.out.println(s1.capacity());
		
		// Fara a String ficar de tras para frente
		System.out.println(s1.reverse());
		
		// Metodo para concatenacao
		s1.append(" Trabalhando ");
		char[] c = {'c', 'o', 'm'};
		s1.append(c).append(" Textos.");
		System.out.println(s1);
		
		// Deletar desde a posicao 0 ate a 4
		StringBuilder url = new StringBuilder("www.xti.com.br").delete(0, 4);
		System.out.println(url);

	}
}
