//Aula53 - Exception, try, catch e finally
//Aula54 - Exception, multi catch, stacktrace e throws

package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void dividir(Scanner s)
	throws InputMismatchException, ArithmeticException	{
		System.out.print("Numero: ");
		int a = s.nextInt();
		System.out.print("Divisor: ");
		int b = s.nextInt();				
		System.out.println(a / b);
	}
	
	public static void main(String[] args) {

		//int x = 1 / 0;
		
		Scanner s = new Scanner(System.in);
		boolean continuar = true;
		
		do {
			try {				
				dividir(s);
				continuar = false;
			} catch(InputMismatchException | ArithmeticException e1) {
				System.err.println("Numero invalido"); // o err imprimira o texto na cor vermelha
				e1.printStackTrace(); // imprime a pilha de erros
				s.nextLine(); // descarta a entrada errada e libera novamente para o usuario 
			} finally {
				System.out.println("Finally executado...");
				// finally sera executado independente de haver erros ou nao
			}
		} while (continuar);
		
	}

}
