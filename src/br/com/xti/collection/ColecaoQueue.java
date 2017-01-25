//Aula90 - Collection Queue

package br.com.xti.collection;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		fila.add("Emerson");
		fila.add("Kaue");
		fila.add("Beatriz");
		System.out.println(fila);
		
		System.out.println(fila.peek());// Retorna o proximo da fila
		System.out.println(fila.poll());// Remove o elemento do inicio da fila
		System.out.println(fila);
		
		LinkedList<String> f = (LinkedList<String>) fila;// Cast
		f.addFirst("Caio");// Coloca no inicio da fila
		f.addLast("Juliana");// Coloca no fim da fila
		System.out.println(fila);
		
		System.out.println(f.peekFirst());// Retorna o primeiro da fila
		System.out.println(f.peekLast());// Retorna o ultimo da fila
		
		f.pollFirst();// Remove primeiro elemento da fila
		f.pollLast();// Remove o ultimo elemento da fila
		
	}

}
