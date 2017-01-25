//Aula104 - Socket e SocketServer 

package br.com.xti.redes;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("201.43.168.123", 5000);
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println("Mensagem: " + s.nextLine());
		s.close();

	}

}
