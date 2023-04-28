package com;

public class StringCiclos {

	public static void main(String[] args) {
		// Métodos de la clase String 
		
		String cadena = "Alejandro" ;
		
		
		//.length (Devuelve el valor numérico de la longitud de una cadena de texto 
		System.out.println(cadena.length());
		
		//.charAt (Devolver el caracter que se encuentra 
		// en la posición o índice especificada)
		System.out.println(cadena.charAt(1));
		
		//Devielve la última letra de la cadena 
		System.out.println(cadena.charAt (cadena.length ()-1)) ;
		
		//.substring (Devuelve el valor una subcadena de texto 
		// a partir del índice especificado)
		System.out.println(cadena.substring(2,7));
		
		//.toLowerCase (Convierte la cadena a minúsculas)
		System.out.println(cadena.toLowerCase());
		
		//.toUpperCase (Convierte la cadena a mayúsculas)
		System.out.println(cadena.toUpperCase());
		
		//.equals (Compara objetos, o en este caso, Strings
		// y nos devuelve un valor de True o False
		System.out.println(cadena.equals("alejandro"));
		
		//.equalsIgnoreCase (Compara los objetos, pero ignora si tiene
		//mayúsculas o minúsculas)
		System.out.println(cadena.equalsIgnoreCase("ALEJANDRO"));
		
		//Para saber si contiene un caracter en específico
		System.out.println(cadena.contains("s")) ;
		
		//cadena."ALGO" es muy extenso, sería bien identificar cómo funcionan o cuántos hay
		//el punto . es un método o alguna posibilidad
		
		
		
		
	
		//CICLOS o también llamados bucles
		//Estructuras que nos van a permitir repetir una secuencia o proceso
		
		//while (Mientras)
		//Variable que me va a servir para realizar determinada acción
		int x = 2;
		while (x<=5) { //mientras x sea menor a 5, realizar lo siguiente 
			System.out.println("Hola mundo");
			x++; //una vez ejecutada la línea de arriba incrementamos el valor de x en +1
		}
		
		
		
		//DO-WHILE	 (Nos aseguramos de que el código se ejecute por lo menos una vez y después
		//pregunta de acuerdo a la condición si el programa debe seguir ejecutándose.
		
		int y = 2 ;
		
		do {
			System.out.println("Hola mundo");
		} while (y>=5);
		
		
		
		
		//FOR (Para las siguientes condiciones o argumetos realiza x cosa)
		//"se escribe: for + ctrl + espacio"
		for (int i = 0; i < 5; i++) {
	//		System.out.println("Hola mundo");	
			System.out.println(i+1);
		}
		for (int i = 10; i < 5; i--) {
			//		System.out.println("Hola mundo");	
					System.out.println(i-1);
				}
		
		// Formas de incremento: x+=2, x++, x--
		
		
		
		
	}

}
