//Aula92 - Genéricos

package br.com.xti.collection;

import java.util.ArrayList;

public class Generico<E> {

	E elemento;
	public void setElemento(E elemento) {
		this.elemento = elemento;
	}
	public E getElemento() {
		return elemento;
	}
	
	/*O <? extends Number> indica que a lista so aceitara numeros do 
	tipo number ou qualquer outro que extenda da classe dele*/
	public double soma(ArrayList<? extends Number> lista) {
		double total = 0;
		for(Number number : lista) {
			total += number.doubleValue();
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		Generico<String> g = new Generico<>();
		g.setElemento("Lago Paranoa");
		//g.setElemento(541235);
		//String e = (String) g.getElemento();
		g.getElemento().toUpperCase();

	}

}
