//Aula96 - Threads, wait e notifyAll

package br.com.xti.threads;

public class PonteTest {

	public static void main(String[] args) {

		Ponte ponte = new PonteNaoSincronizada();
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();
		
	}

}
