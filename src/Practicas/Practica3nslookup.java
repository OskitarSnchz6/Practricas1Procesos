package Practicas;

import java.net.*;
import java.io.*;


public class Practica3nslookup {
	public static void main(String[] args) {

		
		//COMANDO
		 if (args.length > 0) { 
		 for (int i = 0; i < args.length; i++) {
			 System.out.println(lookup(args[i]));
		 		}
		 	}
		 
		 else {
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 
			 	System.out.println("Escribe una direccion para buscar su IP. Escribe \"salir\" para cerrar el programa.");
		 try {
		 
			 while (true) {
				 String host = br.readLine( );
				 if (host.equalsIgnoreCase("salir") || host.equalsIgnoreCase("exit")) {		//Compara dos strings para ver si son iguales ignorando las diferencias entre mayúsculas y minúsculas.
					 break;
				 }
				 System.out.println(lookup(host));
			 }
		 	}
		 	catch (IOException ex) {
		 		System.err.println(ex);
		 		}
		 	}
		 } //Fin del main
	
		 private static String lookup(String host) {		//localiza un objeto
			 
			 InetAddress node;			//Resuelve nombres de dominio mediante la configuración de la máquina local o los servicios de nombres de red
			 
		 // Obtener los bytes de la IP
			 try {
				 node = InetAddress.getByName(host);
			 }
			 catch (UnknownHostException ex) {	//indicar que la dirección IP de un host no se pudo determinar
				 return "No se ha podido encontrar el host " + host;
			 	}
			 if (isHostname(host)) {
				 return node.getHostAddress( );
			 	}
			 else { // La IP
				 return node.getHostName( );
			 	}
		 	} //Fin del lookup
		 
		 private static boolean isHostname(String host) {		//mostrar el nombre actual del sistema
		
			 if (host.indexOf(':') != -1) 
				 return false;
			 
			 char[] ca = host.toCharArray( );

		 	for (int i = 0; i < ca.length; i++) {
		 		if (!Character.isDigit(ca[i])) {
		 			if (ca[i] != '.') 
		 				return true;
		 	}
		 } return false;
	} 
} 