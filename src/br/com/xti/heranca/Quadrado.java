//Aula52 - Polimorfismo, Interfaces

package br.com.xti.heranca;

public class Quadrado implements AreaCalculavel {
// Para herdar de interfaces, em vez do extends usa-se o implements
	
	
	double lado;
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		return lado * lado;
	}

}
