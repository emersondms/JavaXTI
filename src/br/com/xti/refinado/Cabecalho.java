//Aula102 - Annotations

package br.com.xti.refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})

@Documented

public @interface Cabecalho {

	String instituicao();
	String projeto();
	String dataCriacao();
	String criador();
	int revisao() default 1;
	
}
