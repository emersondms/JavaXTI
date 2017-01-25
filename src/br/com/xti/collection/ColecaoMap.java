//Aula91 - Collection Map

package br.com.xti.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {

		/*Os dois paramentros de tipo que map recebe sao o tipo da 
		chave e o do elemento relacionado com a chave*/
		Map<String, String> paises = new HashMap<>();
		paises.put("BR", "Brasil");
		paises.put("RU", "Russia");
		paises.put("IN", "India");
		paises.put("CN", "China");
		System.out.println(paises);
		
		System.out.println(paises.containsKey("US"));
		System.out.println(paises.containsValue("India"));
		System.out.println(paises.get("CN"));// Retorna o conteudo da chave
		paises.remove("RU");
		System.out.println(paises);
		
		/* Esse metodo retorna todas as chaves dentro do Map.
		Porem como eh do tipo Set, nao retornara os elementos duplicados */
		Set<String> keys = paises.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + paises.get(key));
		}
				
	}

}
