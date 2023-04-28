package com;

public class StringCiclos {

	public static void main(String[] args) {
		
//		//Métodos de la clase String
//		
//		//.length (Devuelve el valor numérico de la longitud de una cadena
//		//de texto
//		
//		String cadena = "Alejandro";
//		
//		System.out.println(cadena.length());
//		
//		//.charAt (Devolver el caracter que se encuentra
//		//en la posición o índice especificado)
//		System.out.println(cadena.charAt(1));
//		
//		System.out.println(cadena.charAt(cadena.length()-1));
//		
//		//.substring (Devuelve el valor de una subcadena de texto
//		//a partir del indice especificado)
//		System.out.println(cadena.substring(2,7));
//		
//		//.toLowerCase (Convierte la cadena a minusculas)
//		//.toUpperCase (Convierte la cadena a mayúsculas)
//		System.out.println(cadena.toLowerCase());
//		System.out.println(cadena.toUpperCase());
//		
//		//.equals (Compara objetos, o en este caso, Strings
//		//y nos devuelve un valor true o false
//		System.out.println(cadena.equals("Alejandro"));
//		
//		//.equalsIgnoreCase (Compara los objetos, pero
//		//ignora si tiene mayusculas o minusculas)
//		System.out.println(cadena.equalsIgnoreCase("alejandro"));
//		
//		System.out.println(cadena.contains("j"));
		
	
		
		//CICLOS o también llamados bucles
		//Estructuras que nos van a permitir
		//repetir una secuencia o proceso
		
		//while (Mientras)
		
		//Variable que me va a servir para realizar determina acción
//		int x = 2;
//		
//		while (x<5) { //Mientras x sea menor a 5, realiza lo siguiente
//			System.out.println("Hola mundo");
//			x=x+3; //Una vez ejecutada la linea de arriba
//			//incrementamos el valor de x en 1 +
//		}
		
		//DO-WHILE (Nos aseguramos de que el codigo se ejecute por lo
		//menos una vez, y después pregunta de acuerdo a la condicion
		//si el programa debe seguir ejecutandose
		
//		do {
//			System.out.println("Hola mundo");
//		}while(x>5);
		
		//FOR (Para las siguientes condiciones o argumentos, realiza x cosa)
		
		for (int i = 0; i < 5; i+=3) {
		System.out.println("Hola mundo");
//			System.out.println(i+1);
		}

	}

}
