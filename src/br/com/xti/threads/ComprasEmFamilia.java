//Aula95 - Threads, synchronized 

package br.com.xti.threads;

public class ComprasEmFamilia implements Runnable {

	ContaConjunta conta = new ContaConjunta();
	
	public static void main(String[] args) {
		
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
		new Thread(irAsCompras, "Pai").start();
		new Thread(irAsCompras, "Mae").start();
		new Thread(irAsCompras, "Filha").start();
		new Thread(irAsCompras, "Baba").start();
	}
	
	public void run() {
		String cliente = Thread.currentThread().getName();
		for(int i = 0; i < 5; i++) {
			conta.sacar(20, cliente);
			if(conta.getSaldo() < 0) {
				System.out.println("Estourou");
			}
		}
	}
}
