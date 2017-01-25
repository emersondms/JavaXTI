//Aula41 - Variáveis e Métodos Estáticos

package br.com.xti.poo;

public class Galinha {
	
	/* Variavel global, ou seja pertence 
	a classe e nao ao objeto. Para usar
	esse tipo de variavel, eh preciso
	usar o modificador static */
	public static int ovosGranja; 

	public int ovos; // total de ovos do objeto galinha
	
	// Adiciona um ovo para o objeto galinha
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosGranja++;
		return this;
	}
	
	/* Para metodos estaticos nao e possivel usar 
 	o this para se referir a objetos*/
	public static double mediaOvos(int galinhas) {
		return Galinha.ovosGranja / galinhas;
	}
}
