//Aula96 - Threads, wait e notifyAll
//Aula101 - Documentação, javadoc e marcas 

package br.com.xti.threads;

/**
 * Uma <code>Ponte</code> representa o elo de
 * ligacao entre objetos Produtores e Consumidores
 * de Informacoes. Os <i>Produtores</i> utilizam as
 * Pontes para gravar informacoes e compartilham
 * essas informacoes com os Consumidores que leem
 * esses dados da Ponte para fazer o processamento
 * 
 * @author EMERSON DELMONDES
 * @version 2.0
 * @since 1.0
 * 
 * @see PonteNaoSincrozinada
 * @see PonteSincronizada
 */

public interface Ponte {

	/**
	 * Armazena o valor informado na ponte.
	 * Geralmente sera chamado pelas classes produtoras de dados.
	 * @param valor
	 * @throws InterruptedException
	 */
	public void set(int valor) throws InterruptedException;
	
	/**
	 * Recupera a informacao armazenada na ponte.
	 * Geralmente sera chamado pelas classes consumidoras de dados.
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;
}
