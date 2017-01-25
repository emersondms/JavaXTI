//Aula89 - Collection Set

package br.com.xti.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		String[] cores = {"Verde", "Amarelo", "Azul", "Branco", "Azul", "Amarelo"};
		List<String> list = Arrays.asList(cores);
		System.out.println(list);
		
		// A set nao aceita elementos duplicados
		Set<String> set = new HashSet<>(list);
		System.out.println(set);

	}

}
