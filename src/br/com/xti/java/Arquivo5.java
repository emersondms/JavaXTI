//Aula066 - I/O, Directory e Filesystem 

package br.com.xti.java;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public static void main(String[] args) throws IOException {

		// Listar diretorios
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for(Path path : dirs) {
			System.out.println(path);
		}
		
		// Listar o conteudo 
		Path dir = Paths.get("C:/Documents and Settings/EMERSON/Desktop/eclipse/WorkSpace/XTI/");
		DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
		for (Path path : stream) {
			System.out.println(path.getFileName());
		}
		
		
		// Listar as quantidades de espaco
		FileSystem fs = FileSystems.getDefault();
		for(FileStore store : fs.getFileStores()) {
			System.out.println("Unidade: " + store.toString());
			System.out.println("Total: " + store.getTotalSpace());
			System.out.println("Disponivel: " + store.getUsableSpace());
			System.out.println("Utilizada: " + (store.getTotalSpace() - store.getUsableSpace()));
		}
	}
}
