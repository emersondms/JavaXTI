//Aula 108 - System, Runtime, Properties e Console

package br.com.xti.java;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Sistemas {

	public static void main(String[] args) throws IOException {
		
		Properties p = System.getProperties();
		System.out.println(p.getProperty("java.version"));
		p.setProperty("xti.curso.java.version", "1.0.0");
		
		Set<Object> pk = p.keySet();
		for (Object key : pk) {
			System.out.println(key + " = " + p.get(key));
		}
		
		/*Console c = System.console();
		System.out.println("Usuario: ");
		String user = c.readLine();
		System.out.println("Senha: ");
		char[] pass = c.readPassword();
		System.out.println("Usuario: " + user + " Senha: " + new String(pass));*/
		
		Runtime.getRuntime().exec("notepad");
		
	}
}
