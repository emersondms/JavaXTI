//Aula31 - AutoBoxing

package br.com.xti.logica;

public class AutoBox {

	public static void main(String[] args) {
		
		//da quinta versao do java pra tras
		Integer x = new Integer(555);//empacotado
		int a = x.intValue();//desempacotado
		a++;
		x = new Integer(a);//re-empacotar
		System.out.println(x.intValue());
		
		//da sexta versao em diante
		Integer y = 555;
		y++;
		System.out.println(y);
		System.out.println(y.intValue());
		
		Boolean v = new Boolean("true");
		if(v) {
			System.out.println(v);
		}
	}
}
