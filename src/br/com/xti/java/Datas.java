//Aula69 - Date, Calendar, get, set, clear, add e roll

package br.com.xti.java;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {

		//01 jan 1970 : Data 0
		
		// Quantos milisegundos se passaram desde a data 0
		System.out.println(System.currentTimeMillis());
		
		Date atual = new Date();
		System.out.println(atual);
		
		Date data = new Date(1365175761140L);
		// Retornara a data em funcao dos milisegundos
		System.out.println(data);
		
		data.getTime();
		data.setTime(1_000_000);
		System.out.println(data.compareTo(atual));// -1 menor, 0 iguais, 1 maior
		
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		c.set(Calendar.YEAR, 1972);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.DAY_OF_MONTH, 25);
		System.out.println(c.getTime());
		
		c.clear(Calendar.MINUTE);
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.YEAR, 1);
		System.out.println(c.getTime());
		
		// O roll aumenta a unidade mas nao altera a unidade superior(nesse caso aumenta os dias e quando passar de 30 volta pro zero sem ir pro proximo mes)
		c.roll(Calendar.DAY_OF_MONTH, 20);
		System.out.println(c.getTime());
		
		// Saudacao com Bom dia, Boa tarde, Boa noite
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		if(hora <= 12) {
			System.out.println("Bom dia");
		} else if(hora > 12 && hora < 18) {
			System.out.println("Boa tarde");
		}else{
			System.out.println("Boa noite");
		}
	
	}

}
