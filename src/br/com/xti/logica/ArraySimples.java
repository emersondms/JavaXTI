//Aula20 - Array
//Aula21 - Array Multidimensional 
//Aula22 - ArrayList

package br.com.xti.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArraySimples {

	public static void main(String[] args) {

//Aula20		
		String[] paises = {"Brasil", "Russia", "India", "China"};
		System.out.println(paises[0]);		
		paises[0] = "Brazil";
		System.out.println(paises[0]);
		
		int[] impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		//Tamanho do Array
		System.out.println(paises.length);
		System.out.println(impares.length);
		
		//Listas os elementos do Array em String
		System.out.println(Arrays.toString(paises));
		
		//Procura o elemento no Array e retorna a posicao dele
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao);
		
		//Ordena os elementos a partir da posicao 0
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		//Retorna o valor double da posicao 0
		Double[] valores = {12.35, 3456.3456};
		System.out.println(valores[0].doubleValue());
		
		
		
//Aula21	
		String[] uma = {"Emerson", "Sandra"};
		String[][] duas = {{"Emerson", "M", "SP"},{"Sandra", "M", "DF"}};
		System.out.println(duas[0][0]);
		System.out.println(duas[1][0]);
		System.out.println(duas.length);
		System.out.println(duas[0].length);
		
		duas[1][0] = "SANDRA";
		System.out.println(Arrays.toString(duas[1]));
		
		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		
		Random r = new Random();
		System.out.println(r.nextInt(10));
		
		String face = faces[r.nextInt(faces.length)];
		
		String nipe = nipes[r.nextInt(nipes.length)];
			
		String carta = face + " " + nipe;
		System.out.println(carta);
		
		
		
//Aula22
		ArrayList<String> cores = new ArrayList<>();
		cores.add("Branco");
		cores.add(0, "Vermelho");//define a posicao do elemento no array
		cores.add("Azul");	
		cores.add("Amarelo");	
		System.out.println(cores.toString());
		
		System.out.println("Tamanho do array = " + cores.size());
		System.out.println("Elemento 2 = " + cores.get(2));
		System.out.println("Indice Branco = " + cores.indexOf("Branco"));
		
		cores.remove("Branco");
		
		System.out.println("Tem amarelo? " + cores.contains("Amarelo"));//retorna boolean
		System.out.println("Tem Cinza? " + cores.contains("Cinza"));
		
	}

}
