//Aula68 - Serialização de Contas

package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

public class Serializa2 {

	public void armazenaContas(ArrayList<Conta> contas) throws IOException {	
		try(FileOutputStream fos = new FileOutputStream("C:/Documents and Settings/EMERSON/Desktop/eclipse/WorkSpace/XTI/src/files/contas.ser")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(contas);
			}
		}
	}
	
	
	public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException {
		try(FileInputStream fis = new FileInputStream("C:/Documents and Settings/EMERSON/Desktop/eclipse/WorkSpace/XTI/src/files/contas.ser")) {
			try(ObjectInputStream ois = new ObjectInputStream(fis)) {
				return (ArrayList<Conta>)ois.readObject();
			}
		}
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Emerson", 12000));
		contas.add(new Conta("Chico Tripa", 10000));
		contas.add(new Conta("Malandrao", 8000));
		contas.add(new Conta("Malandrona", 15000));
		
		Serializa2 operacao = new Serializa2();
		operacao.armazenaContas(contas);
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for(Conta conta : contas2) {
			conta.exibeSaldo();
		}

	}

}
