 package Practicas;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica1Ping {
	

	public class Ping {

		public static void main(String[] args) throws IOException {
			
			//Realizamos un ping a google con 7 recorridos
			ProcessBuilder pb = new ProcessBuilder("ping", "-n", "7", "google.com");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(pb.start().getInputStream()));
			
			String linea;
			
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);	//Imprimimos por pantalla
			}		
		}
	}
}