//Aula55 - Exception, Hierarquia das Classes 

package br.com.xti.erros;

public class SenhaInvalidaException extends Exception {
	
	public SenhaInvalidaException(String mensagem) {
		super(mensagem);
	}

}
