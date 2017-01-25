//Aula39 - Modificadores de Acesso
//Aula40 - Métodos get() e set() Encapsulamento

package br.com.xti.logica;

import br.com.xti.poo.Funcionario;

public class FuncionarioExterno {
	
	public static void main(String[] args) {
		
//Aula39		
		Funcionario g = new Funcionario();
		
		//f.nome = "Emerson"; variavel nome=private, logo nao acessivel por outras classes

		//f.nome1 = "Emerson"; variavel nome1=package, logo nao acessivel por classes de outros pacotes
		
		g.nome2 = "Emerson"; 

		
		
//Aula40		
		/*String n = g.getNome();
		g.setNome("Emerson");*/
	}

}
