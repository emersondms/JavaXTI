//AulaString, split(), Tokens e Delimitadores

package br.com.xti.java;

public class StringToken {

	public static void main(String[] args) {
		
		String s = "XHTML; CSS; JavaScript; JQuery; Java";
		String[] tokens = s.split(";");
		System.out.println(tokens.length + " tokens");
		for (String token : tokens) {
			System.out.println(token);
		}
		
		String s1 = "Venha trabalhar na XTI";
		String[] tokens1 = s1.split(" ");
		System.out.println(tokens1.length + " tokens");
		for (String token1 : tokens1) {
			System.out.println(token1);
		}
		
	}

}
