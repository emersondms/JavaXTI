//Aula41 - Variáveis e Métodos Estáticos

package br.com.xti.poo;

public class GalinhaTest {

	public static void main(String[] args) {
		
		Galinha g1 = new Galinha();	
		/* Pode ser chamado varias vezes na mesma linha 
		porque o metodo botar() eh do tipo Galinha */
		g1.botar().botar().botar();
		
		Galinha g2 = new Galinha();
		g2.botar().botar();
				
		System.out.println(g1.ovos);
		System.out.println(g2.ovos);
		System.out.println(Galinha.ovosGranja);
		System.out.println(Galinha.mediaOvos(2));

	}

}
