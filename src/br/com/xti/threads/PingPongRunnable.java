//Aula94 - Threads, runnable 

package br.com.xti.threads;

public class PingPongRunnable implements Runnable {
	
	String palavra;
	long tempo;
	public PingPongRunnable(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}

	public void run() {
		try {
			for(int i = 0; i < 100; i++) {
				System.out.println(palavra);
				Thread.sleep(tempo);
		    } 
		} catch (InterruptedException e) {
			return;
		}
	}
	
	
	public static void main(String[] args) {
		
		
		Runnable ping = new PingPongRunnable("Ping", 1500);
		Runnable pong = new PingPongRunnable("Pong", 2000);
		
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
		
	}

}
