package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite_ESJS {

	public static void main(String[] args) {
		//Clase File -  Representacion del archivo en memoria.
		//Puede ubicar el archivo por medio de la ruta en la que
		//se encuentra
		
		//Clase FileReader - A esta clase asignamos elvalor del archivo
		//para que podamos leer el archivo 
		
		//Clase BufferedReader - Con esta clase se puede leer y cargar 
		//el contenido del archivo para visualizarlo aqui en Java
		
		//Lectura de archivos
		
//		String linea; //aqui vamos a guardar la linea que queremos
//		//leer de nuestro archivo
//		
//		try {//intentar ejecutar lo siguiente
//			
//			File archivo = new File("C:\\Users\\CapsuleCorp\\Desktop\\fichero.txt");
//			FileReader fr = new FileReader(archivo); // sabe leer el archivo
//			BufferedReader buffer = new BufferedReader(fr); //lee el contenido
//			
//			//Iteramo sobre el valor de las lineas que puede leer buffer y
//			//las vamos guardando en nuestro String linea
//			
//			while ((linea = buffer.readLine()) !=null) {
//				System.out.println("Linea: " + linea);
//			}
//			
//		} catch (Exception ex) {// si algo no se uede ejecutar, se atrapa
//			//aqui y se lanza una excepcion pero el programa
//			//se sigue ejecutando
//			//ex.printStackTrace();
//			
//			System.out.println("No se encontro el archivo");
//		}

		// clase FileWriter - Nos permite escribir contenido en los archivos
		
		String abc = "abcdefghi\n";
		
		try{
			File archivo = new File("C:\\Users\\CapsuleCorp\\Desktop\\fichero.txt");
			FileWriter line = new FileWriter(archivo, true); // con el bbolean true,
			//conservamos el contenido del archivo, si lo tiene 
			
			for (int i=0; i<abc.length();i++) {
				line.write(abc.charAt(i) + "\n");
			}
			line.close();
			
		}catch(Exception ex) {
			System.out.println("Nose encontro el archivo");
		}
		
		
		
	}

}
