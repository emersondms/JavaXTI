//Aula65 - I/O, Check, Delete, Create, Copy e Move

package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/Documents and Settings/EMERSON/Desktop/eclipse/WorkSpace/XTI/src/files/fonte.txt");
		
		/*
		System.out.println(Files.exists(path));
		System.out.println(Files.isDirectory(path));
		System.out.println(Files.isRegularFile(path));
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isExecutable(path));
		System.out.println(Files.size(path));
		System.out.println(Files.getLastModifiedTime(path));
		System.out.println(Files.getOwner(path));
		System.out.println(Files.probeContentType(path));// Retorna o tipo do arquivo
		*/
		
		/* 
		Deletar
		Files.delete(path);
		Files.deleteIfExists(path);
		*/
		
		// Criar
		Files.createFile(path);
		Files.write(path, "Texto".getBytes());
		
		// Copiar
		Path copy = Paths.get("C:/Documents and Settings/EMERSON/Desktop/eclipse/WorkSpace/XTI/src/files/copia.txt");
		Files.copy(path, copy, StandardCopyOption.REPLACE_EXISTING);
		
		// Mover
		Path move = Paths.get("C:/Documents and Settings/EMERSON/Desktop/eclipse/WorkSpace/XTI/src/files/move/copia.txt");
		Files.createDirectories(move.getParent());
		Files.move(path, move, StandardCopyOption.REPLACE_EXISTING);
	}

}
