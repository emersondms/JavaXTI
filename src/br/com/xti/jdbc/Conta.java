//Aula112 - JDBC CRUD, Create, Read, Update e Delete 
//Aula113 - JDBC Transação, Commit, Rollback

package br.com.xti.jdbc;

public class Conta {
	
	int numero;
	String cliente;
	double saldo;
	
	public Conta(int numero, String cliente, double saldo) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String toString() {
		return numero + " , " + cliente + " , " + saldo;
	}
	
}
