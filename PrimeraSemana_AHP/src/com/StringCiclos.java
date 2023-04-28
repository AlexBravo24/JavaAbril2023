package com;

public class StringCiclos {

	public static void main(String[] args) {
		// M�todos de la clase String 
		
		String cadena = "Alejandro" ;
		
		
		//.length (Devuelve el valor num�rico de la longitud de una cadena de texto 
		System.out.println(cadena.length());
		
		//.charAt (Devolver el caracter que se encuentra 
		// en la posici�n o �ndice especificada)
		System.out.println(cadena.charAt(1));
		
		//Devielve la �ltima letra de la cadena 
		System.out.println(cadena.charAt (cadena.length ()-1)) ;
		
		//.substring (Devuelve el valor una subcadena de texto 
		// a partir del �ndice especificado)
		System.out.println(cadena.substring(2,7));
		
		//.toLowerCase (Convierte la cadena a min�sculas)
		System.out.println(cadena.toLowerCase());
		
		//.toUpperCase (Convierte la cadena a may�sculas)
		System.out.println(cadena.toUpperCase());
		
		//.equals (Compara objetos, o en este caso, Strings
		// y nos devuelve un valor de True o False
		System.out.println(cadena.equals("alejandro"));
		
		//.equalsIgnoreCase (Compara los objetos, pero ignora si tiene
		//may�sculas o min�sculas)
		System.out.println(cadena.equalsIgnoreCase("ALEJANDRO"));
		
		//Para saber si contiene un caracter en espec�fico
		System.out.println(cadena.contains("s")) ;
		
		//cadena."ALGO" es muy extenso, ser�a bien identificar c�mo funcionan o cu�ntos hay
		//el punto . es un m�todo o alguna posibilidad
		
		
		
		
	
		//CICLOS o tambi�n llamados bucles
		//Estructuras que nos van a permitir repetir una secuencia o proceso
		
		//while (Mientras)
		//Variable que me va a servir para realizar determinada acci�n
		int x = 2;
		while (x<=5) { //mientras x sea menor a 5, realizar lo siguiente 
			System.out.println("Hola mundo");
			x++; //una vez ejecutada la l�nea de arriba incrementamos el valor de x en +1
		}
		
		
		
		//DO-WHILE	 (Nos aseguramos de que el c�digo se ejecute por lo menos una vez y despu�s
		//pregunta de acuerdo a la condici�n si el programa debe seguir ejecut�ndose.
		
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
