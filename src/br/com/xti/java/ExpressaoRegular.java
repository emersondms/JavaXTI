//Aula61 - Regular Expression (regex) Expressão Regular 

package br.com.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {

		boolean b = "Java".matches("java"); // false
		System.out.println(b);
		
		 /*    Modificadores
		(?i), Ignora maiuscula e minuscula
		(?x), Comentarios
		(?m), Multilinhas
		(?s), Dottal */
		
		b = "Java".matches("(?i)java"); // true
		System.out.println(b);
		
		/* Metacaracteres
		.  qualquer caracter
		\d digitos [0 - 9]
		\D nao eh digito [^0 - 9]
		\s espacos [\t\n\x0B\f\r]
		\S nao eh espaco[^\s]
		\w letra [a-zA-Z_0_9]
		\W nao eh letra */
		
		// Procurar apenas 1 digito
		b = "@".matches("."); // true
		b = "2".matches("\\d"); // true
		b = "a".matches("\\d"); // false
		b = "b".matches("\\w"); // true
		b = "#".matches("\\w"); // false
		b = " ".matches("\\s"); // true
		
		// Mais de 1 digito
		b = "PI".matches(".."); // true
		b = "PIX".matches("..."); // true
		b = "14".matches("\\d\\d"); // true
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "70294-070".matches(cep); // true
		
		/*     Quantificadores
		X{n}   X, exatamente n vezes
		X{n,}  X, pelo menos n vezes
		X{n,m} X, pelo menos n mas nao mais do que m vezes
		X?     X, 0 ou 1 vez
		X*     X, 0 ou + vezes
		X+     X, 1 ou + vezes */
		
		b = "21".matches("\\d{2}"); // true
		b = "214".matches("\\d{2,}"); // true
		b = "214356".matches("\\d{2,5}"); // false
		b = "aa".matches(".?"); // false
		b = "aa".matches(".*"); // true
		b = "123".matches(".+"); // true
		b = "05823-070".matches("\\d{5}-\\{d}{3}");
		b = "02/04/2013".matches("\\d{2}/\\{d}{2}/\\d{4}"); //true
		
		/* Metacaracter de fronteira
		^  inicia
		$  finaliza
		|  ou */
		
		b = "Pier21".matches("^Pier.*"); // true
		b = "Pier21".matches(".*21$"); // true
		b = "Tem java aqui".matches(".*java.*"); // true
		b = "Tem java aqui".matches("^Tem.*aqui$"); // true
		b = "sim".matches("sim | nao"); // true
		
		/* Agrupadores
		[...]          agrupamento
		[a-z]          alcance
		[a-e][i-u]     uniao
		[a-z&&[aeiou]] intersecao
		[^abc]         excecao
		[a-z&&[^m-p]]  subtracao
		\x             fuga literal */
		
		b = "x".matches("[a-z]"); // true
		b = "2".matches("[a-z]"); // false
		b = "A".matches("[a-z]"); // false
		b = "3".matches("[0-9]"); // true
		b = "True".matches("[tT]rue"); // true
		b = "yes".matches("[tT]rue | [Yy]es"); // true
		b = "Emerson".matches("[A-Z][a-z]*"); // true
		b = "olho".matches("[^abc]lho"); // true
		b = "emersondms@gmail.com".matches("\\w+@\\w+\\.\\w{2,3}"); // true
		
		String doce = "Qual eh o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);// O compile fara a palavra doce ter um padrao que retorna a palavra tanto com maiusculas quanto minusculas 
		while (matcher.find()){ // matcher.find() = boolean, ou seja, quantas vezes a palavra doce for true dentro da String
			System.out.println(matcher.group());// O group() ira retornar as ocorrencias da palavra doce encontradas na String
		}
		
		// Substituicoes
		String r = doce.replaceAll("(?i)doce", "Docinho");
		System.out.println(r);
		
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "XX");
		System.out.println(r);
		
		r = "Tabular  o texto".replaceAll("\\s", "\t");
		System.out.println(r);
		
		
		String url = "www.xti.com.br/clientes-2011.html";
		// //http://www.xti.com.br/2011/clientes.jsp
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);
		System.out.println(b);
		
		re = "(www.xti.com.br)(\\w{2,})-(\\d{4}).html"; // Com o uso dos () o que esta dentro deles vira uma variavel
		r = url.replaceAll(re, "http://$1/$3/$2.jsp"); // O $ seguido do numero indica a posicao que as variaveis acima estao
		System.out.println(r);
	}

}
