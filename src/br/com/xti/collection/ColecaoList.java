//Aula87 - Collection List

package br.com.xti.collection;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {

		// A lista aceita elementos duplicados
		List<String> list = new ArrayList();
		list.add("Futebol");
		list.add("Basquete");
		list.add("Tenis");
		list.add("Boxe");
		list.add("Natacao");
		list.add("Futebol");
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			String letra = list.get(i);
			list.set(i, letra.toUpperCase());
		}	
		System.out.println(list);
		
		System.out.println(list.indexOf("BOXE"));
		System.out.println(list.subList(2, 5));
		list.subList(2, 5).clear();
		System.out.println(list);
		
	}

}
