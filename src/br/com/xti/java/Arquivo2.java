//Aula63 - I/O, Hierarquia, Buffer, try, Closable Interface

package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/Documents and Settings/EMERSON/Desktop/eclipse/WorkSpace/XTI//src/files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		
		// Escrita
		/*BufferedWriter w = null;
		try{
			w = Files.newBufferedWriter(path, utf8);
			w.write("Texto\n");
			w.write("Texto");
			w.flush();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(w != null){
				w.close();
			}
		}*/
		
		
		// A partir do Java 7 nao precisa fechar a conexao
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			w.write("Texto\n");
			w.write("Texto");
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		// Leitura
		try(BufferedReader r = Files.newBufferedReader(path, utf8)) {
			String line = null;
			while((line = r.readLine()) != null){
				System.out.println(line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
