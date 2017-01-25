//Aula47 - Herança (extends)
//Aula48 - Heranca e Construtor (super)
//Aula49 - Polimorfismo, Sobrescrita de Métodos
//Aula50 - Polimorfismo, Classes abstract
//Aula51 - Polimorfismo, Classes final 

package br.com.xti.heranca;

public class AnimalTest {

	// Metodo usando o polimorfismo
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}
	
	// Sem o uso de polimorfismo
	public static void barulhoSemPolimorfismo(String animal) {
		if(animal.equals("Cachorro")) {
			System.out.println("Au, Au!");
		} else if(animal.equals("Galinha")) {
			System.out.println("Có, Có!");
		}
	}
	
	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro(30, "Carne");
		toto.dormir();
		
		Galinha carijo = new Galinha(2, "Milho");
		carijo.dormir();
		
		//Animal toto2 = new Cachorro(45, "Racao");
		//Animal carijo2 = new Galinha(5, "Minhoca");
		
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
		
		//Metodos herdados da classe Object, onde todas as classes extendem ela
		System.out.println(toto.equals(carijo));
		System.out.println(toto.hashCode());
		System.out.println(toto.getClass());
		System.out.println(toto.toString());
			
		/* Animal generico = new Animal(10, "Carniça");*/
		
		toto.fazerBarulho();
		carijo.fazerBarulho();
		//generico.fazerBarulho();
		
		barulho(toto);
		barulho(carijo);
		
		barulhoSemPolimorfismo("Cachorro");
		barulhoSemPolimorfismo("Galinha");
	}
}
