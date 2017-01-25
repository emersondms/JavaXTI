//Aula103 - Reflection

package br.com.xti.refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflexao {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		String nome = "br.com.xti.poo.Conta";
		Class classe = Class.forName(nome);
		System.out.println(classe.getSimpleName());
				
		Field[] f = classe.getFields();
		for (Field field : f) {
			System.out.println(field);
		}
		
		Method[] m = classe.getDeclaredMethods();
		for (Method method : m) {
			System.out.println(method);
		}
		
		Constructor[] c = classe.getConstructors();
		for(Constructor constructor : c) {
			System.out.println(constructor);
		}
		
		Object o = classe.newInstance();
		Method md = classe.getMethod("deposita", double.class);
		Method me = classe.getMethod("exibeSaldo");
		md.invoke(o, 120);
		me.invoke(o);
		
		Constructor co = classe.getConstructor(String.class, double.class);
		Object obj = co.newInstance("Emerson", 212_986);
		me.invoke(obj);
	}

}
