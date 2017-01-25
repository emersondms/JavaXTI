//Aula37 - Métodos com Retorno
//Aula38 - Desafio Raiz Quadra com Equação Pell 
//Aula42 - VarArgs Argumentos Variáveis
//Aula43 - Métodos Sobrecarregados

package br.com.xti.poo;

public class MatematicaTest {

	public static void main(String[] args) {

//Aula37 		
		Matematica m = new Matematica();
		int ma = m.maior(10, 20);
		System.out.println("O maior eh: " + ma);
		
		double so = m.soma(10, 20);
		System.out.println("A soma eh: " + so);
		
		double som = m.soma(m.maior(2, 4), m.maior(3, 5));
		System.out.println("Ah soma eh: " + som);

		
		
//Aula38 
		int raiz = m.raiz(49);
		System.out.println("A raiz eh: " + raiz);

		
		
//Aula42
		double s = m.soma1(12, 45, 29, 55, 92);
		System.out.println("A soma eh: " + s);
		
		
		
//Aula43
		System.out.println("m.media(int x, int y) " + m.media(5, 3));
		System.out.println("m.media(String x, String y) " + m.media("50", "30"));
		System.out.println("m.media(double ... numeros) " + m.media(5, 3, 8, 2, 14));
	}

}
