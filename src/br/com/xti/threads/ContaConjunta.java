//Aula95 - Threads, synchronized 

package br.com.xti.threads;

public class ContaConjunta {

	private int saldo = 100;
	
	public int getSaldo() {
		return saldo;
	}
	
	public synchronized void sacar(int valor, String cliente) {
		if(saldo >= valor) {
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar");
			try {
				System.out.println(cliente + " esperando");
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			saldo -= valor;
			String msg = cliente + " Sacou " + valor + " [Saldo Original = " + saldoOriginal + " Saldo Final =  " + saldo + "]";
			System.out.println(msg);
		} else {
			System.out.println("Saldo insuficiente para " + cliente);
		}
	}
	
	public static void main(String[] args) {

	}

}
