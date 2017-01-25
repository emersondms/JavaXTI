//Aula39 - Modificadores de Acesso
//Aula40 - Métodos get() e set() Encapsulamento

package br.com.xti.poo;

public class Funcionario {

//Aula39
	//private permite acessar os metodos e variaveis somente na mesma classe
	private String nome;
	
	//package permite acessar os metodos e variaveis somente para as classes no mesmo pacote
	//nao precisa escrever package antes da declaracao da variavel ou metodo
	String nome1;
	
	//public permite acesso por todas as outras classes
	public String nome2;
	

	
//Aula40	
	boolean ativo;
	
	//Para obter o nome private
	public String getNome() {
		return nome;
	}
	
	//Para setar o nome private
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Para obter o valor de um boolean
	public boolean isAtivo() {
		return ativo;
	}
	
	//Para setar o valor de um boolean
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		f.nome = "Emerson";
		f.nome1 = "Emerson";
		f.nome2 = "Emerson";
		
		f.getNome();
	
	}

}
