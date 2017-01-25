//Aula71 - Date, Internacionalização, Locale

package br.com.xti.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date data = c.getTime();
		
		Locale padrao = Locale.getDefault();
		Locale brasil = new Locale("pt", "BR");
		Locale india = new Locale("hi", "IN");
		Locale usa = Locale.US;
		Locale japao = Locale.JAPAN;
		Locale italia = Locale.ITALY;
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println(f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, india);
		System.out.println(f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, usa);
		System.out.println(f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, japao);
		System.out.println(f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, italia);
		System.out.println(f.format(data));

	}

}
