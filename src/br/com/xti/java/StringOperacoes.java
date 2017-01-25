//Aula58 - String, Principais Operações

package br.com.xti.java;

public class StringOperacoes {

	public static void main(String[] args) {
		
		// Maneiras de inicializar uma String
		String s1 = "Write Once";
		String s2 = s1 + " Run Anywhere";
		String s3 = new String("Java Virtual Machine");
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		
		// Operacoes
		int tamanho = s1.length();
		char letra = s1.charAt(0); // Retorna o charactere que esta na posicao 0
		String texto = s1.toString();
		
		// Localizacao
		int posicao = s3.indexOf("Virtual"); // Retorna o indice de onde comeca a String
		s3.lastIndexOf('a'); // Retorna a posicao do ultimo charactere a
		boolean vazia = s3.isEmpty(); // Retorna true se a String for vazia
		
		// Comparacao
		String xti = "XTI";
		boolean x = xti.equals("xti");
		boolean y = xti.equalsIgnoreCase("xti");
		boolean x1 = xti.startsWith("TI");
		boolean y1 = xti.endsWith("TI");
		int a = "amor".compareTo("bola"); // Vai retornar um numero menor que 0 se a primeira letra da palavra amor vier antes da primeira letra da palavra bola
		int b = "123".compareTo("234");
		String so = "Olhe, olhe";
		boolean o = so.regionMatches(true, 6, "Olhe", 0, 0); // Metodo para verificar se apartir da posicao 6 da String so tem a palavra Olhe. O parametro true faz o metodo ignorar as maiusculas ou minusculas
		String l = "O Brasil eh uma bosta";
		String sl = l.substring(9); // Ira atribuir para a String sl, a String l apartir da posicao 9
		sl = l.substring(2, 8); // Comecando na pos. 2 e terminando na 8
		sl = l.concat(" ,tchau to indo embora");
		
		// Modificacao
		sl = l.replace('s', 'z');
		sl = l.replaceFirst(" ", "_"); // Ira substituir o primeiro espaco em branco da Stirng por _
		sl = l.replaceAll(" ", "_"); // Ira substituir todos os espacos em branco da Stirng por _
		sl = l.toUpperCase();
		sl = l.toLowerCase();
		System.out.println("	espacos		".trim()); // O trim() remove os espacos de antes e depois da String
		
	}

}
