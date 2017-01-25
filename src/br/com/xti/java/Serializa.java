//Aula67 - Serialização, transient

package br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import br.com.xti.poo.Conta;

public class Serializa {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String[] nomes = {"Emerson", "Beatriz", "Sandra"};
		Conta conta1 = new Conta("Emerson", 541_254);
		Conta conta2 = new Conta("Juzé", 122_485);
		
		// Escrita de objeto
		FileOutputStream fos = new FileOutputStream("C:/Documents and Settings/EMERSON/Desktop/eclipse/WorkSpace/XTI/src/files/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.close();
		
		// Leitura de objeto
		FileInputStream fis = new FileInputStream("C:/Documents and Settings/EMERSON/Desktop/eclipse/WorkSpace/XTI/src/files/objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta c1 = (Conta) ois.readObject();
		Conta c2 = (Conta) ois.readObject();
		ois.close();
		c1.exibeSaldo();
		c2.exibeSaldo();
		
	}

}
