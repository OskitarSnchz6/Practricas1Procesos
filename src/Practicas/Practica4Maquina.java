package Practicas;


public class Practica4Maquina {
	public static void main(String[] args) {
		
		int numProcesadores =0;
		
		//Pedimos a la maquina en numero de procesadores
				numProcesadores = Runtime.getRuntime().availableProcessors();
				System.out.println("Numero de procesadores de la maquina: " + numProcesadores + " nucleos.");
				
				//Operador
				long Megabyte = 1024 * 1024;
				
				//Calculo Memoria total
/*				long memoriaTotal = Runtime.getRuntime().totalMemory();
				System.out.println("Memoria total: " + memoriaTotal / Megabyte + "MB");
				
				//Calculo Memoria libre
				long memoriaLibre = Runtime.getRuntime().freeMemory();
				System.out.println("Memoria libre: " + memoriaLibre / Megabyte + "MB");
				
				//Calculo Memoria ocupada
				long memoriaOcupada= (memoriaTotal/Megabyte) - (memoriaLibre/Megabyte);
				System.out.println("Memoria ocupada: " + memoriaOcupada + "MB");
*/				
		
		Runtime runtime = Runtime.getRuntime();
		   System.out.println ("Memoria total: " + runtime.totalMemory() / Megabyte + "MB");
		   System.out.println ("Memoria libre: " + runtime.freeMemory() / Megabyte + "MB");
		   System.out.println ("Memoria ocupada: " + (runtime.totalMemory() - runtime.freeMemory()) / Megabyte + "MB");
	}
}