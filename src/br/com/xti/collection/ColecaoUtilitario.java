//Aula88 - Collection Utilitário Collections

package br.com.xti.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Guarana");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("Acai");
		list.add("Banana");
		System.out.println(list.toString());
		
		Collections.sort(list);// Ordem alfabetica
		System.out.println(list.toString());
		
		Collections.reverse(list);// Inverte a ordem
		System.out.println(list.toString());
		
		Collections.shuffle(list);// Ordem aleatoria
		System.out.println(list.toString());
		
		Collections.addAll(list, "Cupuaçu", "Laranja", "Laranja");
		System.out.println(list.toString());
		
		System.out.println(Collections.frequency(list, "Laranja"));// Quantas vezes a palavra aparece na lista
		
		List<String> list2 = Arrays.asList("Acerola", "Graviola");
		
		boolean d = Collections.disjoint(list, list2);// Verifica se os elementos de uma lista estao contidos em outra
		
		Collections.sort(list);
		int indice = Collections.binarySearch(list, "Guarana");// Indice do elemento no Array
		System.out.println(indice);
		
		Collections.fill(list, "Acai");// Preenchera a lista com o elemento Acai
		
		Collection<String> constante = Collections.unmodifiableCollection(list);

	}

}
