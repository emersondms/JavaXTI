//Aula70 - Date, Formatação, DateFormat, format e parse

package br.com.xti.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	public static void main(String[] args) throws ParseException {

		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date data = c.getTime();
		System.out.println(data);
		
		// Formatacao de datas
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(data));
		
		// Formatacao de time
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(data));
		
		// Formatacao de data e hora
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(data));
		
		// Estilos
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(data));
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f.format(data));
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(f.format(data));
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(f.format(data));
		
		// Converter String em data
		Date data2 = f.parse("12/02/1980");
		System.out.println(data2);
		
		
		// SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println(sdf.format(data));
		System.out.println(sdf.parse("10/10/2010"));
		
	}

}
