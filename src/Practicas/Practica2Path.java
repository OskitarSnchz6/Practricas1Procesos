package Practicas;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Practica2Path {		//buscar los ejecutables necesarios desde la línea de comandos
	public static void main(String[] args) {

	try {
	Path startPath = Paths.get("C:\\Users\\oskit\\OneDrive\\Escritorio\\Acceso a Datos\\AccesoADatos");
	Files.walkFileTree(startPath, new SimpleFileVisitor<Path>() {		//simple visitante de archivos
		//walkFileTree no sigue enlaces simbólicos y visita todos los niveles del árbol de archivos.
		
	    @Override
	    public FileVisitResult preVisitDirectory(Path dir,		//Se invoca para un directorio antes de visitar las entradas del directorio
	            BasicFileAttributes attrs) {	//Atributos básicos asociados con un archivo en un sistema de archivos
	        System.out.println("Dir: " + dir.toString());
	        return FileVisitResult.CONTINUE;
	    }
	
	    @Override
	    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
	        System.out.println("File: " + file.toString());    
	        return FileVisitResult.CONTINUE;
	    }
	
	    @Override
	    public FileVisitResult visitFileFailed(Path file, IOException e) {
	        return FileVisitResult.CONTINUE;
	    		}
			});
		} catch (IOException e) {
			e.printStackTrace();
			}
	}
}