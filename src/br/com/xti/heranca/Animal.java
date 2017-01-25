//Aula47 - Herança (extends)
//Aula48 - Heranca e Construtor (super)
//Aula49 - Polimorfismo, Sobrescrita de Métodos
//Aula50 - Polimorfismo, Classes abstract
//Aula51 - Polimorfismo, Classes final 

package br.com.xti.heranca;

//Super classe para as classes galinha e cachorro:

public abstract class Animal { 
	
	 /* Com o modificador abstract, as subclasses da classe animal sao obrigadas a usar
	 todos os metodos da super classe que tambem sao abstract(a nao ser subclasses que 
	 tambem sejam abstratas), nesse caso o metodo fazer barulho(). Ele nao tem chaves depois do ; */
	 /* Se uma classe eh abstrata, ela nao pode ser instanciada, ou seja, nao se pode criar 
	 objetos a partir dela */

	protected int serial;//O modificador protected faz com que o atributo seja visivel apenas pelas subclasses
	double peso;
	String comida;
	
	public Animal(double peso, String comida){
		this.peso = peso;
		this.comida = comida;
	}
	
	void dormir(){
		System.out.println("Dormiu");
	}
	
	abstract void fazerBarulho();
}

	 /* O USO DO FINAL*/

	 /* O modificador final ao ser colocado em uma classe
	 * faz com que as outras classes nao possam extender
	 * dela, e quando colocado em metodos, faz com que nao
	 * possa ser usado o polimorfismo, ou seja, a sobrescrita
	 * de metodos */



