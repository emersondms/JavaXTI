//Aula44 - Construtores
//Aula45 - Relacionamento tem-um, Composição

package br.com.xti.poo;

public class CarroTest {

	public static void main(String[] args) {

//Aula44
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		
		/* Com o uso de construtores(que foram criados na classe Carros), 
		os atributos do objeto podem ser definidos dentro dos parenteses 
		na inicializacao */
		Carro k = new Carro("Koenigsegg CCXR", 430, 3.1);
		System.out.println(k.modelo);
		System.out.println(k.velocidadeMaxima);
		System.out.println(k.segundosZeroACem);
		
		
		
//Aula45
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12; // adiciona o motor ao carro
		
		Motor v8 = new Motor("V8", 1018);
		k.motor = v8;
		System.out.println(k.motor.potencia);
		
		/* Inclusive inicializar um objeto dentro do outro */
		Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("W16", 1200));
		System.out.println(bugatti.motor.potencia);
		System.out.println(bugatti.motor.tipo);
	
	}

}
