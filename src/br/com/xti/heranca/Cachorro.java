//Aula47 - Herança (extends)
//Aula48 - Heranca e Construtor (super)
//Aula49 - Polimorfismo, Sobrescrita de Métodos
//Aula50 - Polimorfismo, Classes abstract
//Aula51 - Polimorfismo, Classes final 

package br.com.xti.heranca;

public class Cachorro extends Animal {
	
/* A keyword extends faz com que um objeto criado a partir
da classe Cachorro possa herdar os metodos e atributos
da classe Animal */
	
	public Cachorro(double peso, String comida) {
		super(peso, comida);
		/* Com a keyword super, voce esta chamando o construtor
		da classe pai(Animal) e passando os parametros dentro dos
		parenteses */
	}
	
	void fazerBarulho() {
		System.out.println("Au, Au!");
	}
	
}
