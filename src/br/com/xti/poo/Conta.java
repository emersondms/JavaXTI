//Aula36 - Métodos com Parâmetros
//Aula64 - Desafio I/O Armazenar Contas em Arquivo Sequencial
//Aula67 - Serialização, transient

package br.com.xti.poo;

import java.io.Serializable;

public class Conta implements Serializable {
	
	String cliente;
    /*transient*/ double saldo;
    // O modificador transient faz com que o atributo nao possa ser serializado
	
	public Conta(){}
	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public String getCliente() {
		return cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void exibeSaldo() {
		System.out.println(cliente + " seu saldo eh " + saldo);
	}
	
	public void saca(double valor) {
		saldo -= valor;
	}
	
	public void deposita(double valor) {
		saldo += valor;
	}

	public void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}
}
