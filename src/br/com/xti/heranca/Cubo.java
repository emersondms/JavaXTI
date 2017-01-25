//Aula52 - Polimorfismo, Interfaces

package br.com.xti.heranca;

public class Cubo implements VolumeCalculavel, AreaCalculavel {
// Voce pode implementar mais de uma interface, usando a heranca multipla

	double lado;
	public Cubo(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaVolume() {
		return 6 * lado * lado;
	}

	@Override
	public double calculaArea() {
		return lado * lado * lado;
	}

}
