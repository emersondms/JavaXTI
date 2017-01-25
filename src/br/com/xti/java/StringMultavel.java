//Aula60 - Stringbuffer e Stringbuilder 

package br.com.xti.java;

public class StringMultavel {

	public static void main(String[] args) {
		
		/* A unica diferença entre StringBuilder e StringBuffer é que os metodos 
		do StringBuilder não são sincronizados ou seja não são confiaveis se 
		estiverem usando thread. A Sun recomenda usar o StringBuilder sempre que
		possivel ao inves do StringBuffer. Alem disso as duas classes são identicas.*/
		
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
