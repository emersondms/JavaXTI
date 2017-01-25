//Aula29 - Fibonacci

package br.com.xti.logica;

public class DesafioFibonacci {

	public static void main(String[] args) {
		
		int a = 0, b = 1, i;
	    
	    for (i = 1; b <= 50; i++){
	        b = a + b;
	        a = b - a;
	        System.out.println(b);;
	    }

	}

}
