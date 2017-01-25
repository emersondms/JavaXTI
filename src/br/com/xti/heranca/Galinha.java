//Aula47 - Herança (extends)
//Aula48 - Heranca e Construtor (super)
//Aula49 - Polimorfismo, Sobrescrita de Métodos
//Aula50 - Polimorfismo, Classes abstract
//Aula51 - Polimorfismo, Classes final 

package br.com.xti.heranca;

public class Galinha extends Animal {
	
/* A keyword extends faz com que um objeto criado a partir
da classe Galinha possa herdar os metodos e atributos
da classe Animal */
	
	public Galinha(double peso, String comida) {
		super(peso, comida);
		/* Com a keyword super, voce esta chamando o construtor
		da classe pai(Animal) e passando os parametros dentro dos
		parenteses */
	}
	
	void fazerBarulho() {
		System.out.println("Có, Có!");
	}

}
