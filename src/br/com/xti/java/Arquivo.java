//Aula62 - I/O, Path, Leitura e Escrita

package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {

		// Classe Path a partir fo Java 7
		Path path = Paths.get("C:/Documents and Settings/EMERSON/Desktop/eclipse/WorkSpace/XTI//src/files/texto.txt");
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());
		
		// Criacao de diretorios
		Files.createDirectories(path.getParent());	
		
		// Escrever e ler arquivos
		byte[] bytes = "Meu Texto".getBytes();
		Files.write(path, bytes);
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));
	}

}
