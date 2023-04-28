package com;

public class StringCiclos {

	public static void main(String[] args) {
		
//		//Métodos de la clase String
//		
//		//.lenght (Devuelve el valor numerico de la longitud 
//		//de una cadena de texto
//		
//		String cadena="Alejandro";
//		System.out.println(cadena.length());
//		
//		//.charAt (Devolver el carater que se encuentra
//		//en la posicion o indice especificado
//		System.out.println(cadena.charAt(1));
//		
//		System.out.println(cadena.charAt(cadena.length()-1));
//		
//		//.substring (Devuelve el valor de una subcadena de texto
//		//a partir del indice especificado)
//		
//		System.out.println(cadena.substring(2, 7));
//		
//		//.toLowerCase (Convierte la cadena a minusculas)
//		//.toUpperCase (Convierte la cadena a mayusculas)
//		
//		System.out.println(cadena.toLowerCase());
//		System.out.println(cadena.toUpperCase());
//		
//		//.equals (Compara objetos, en este caso, strings
//		//y nos devuelve un valor verdadero o falso
//		
//		System.out.println(cadena.equals("alejandro"));
//		
//		//.equalsIsIgnoreCase (compara los objetoos, pero
//		//ignora si tiene mayusculas o minusculas
//		
//		System.out.println(cadena.equalsIgnoreCase("Alejandra"));
//		
//		System.out.println(cadena.contains("A"));
		
		//CICLOS o también llamados bucles
		//Estructuras que nos permites repetir
		//repetir una secuencia o progreso
		
		//While (Mientras)
		
		//Variable que me va a servir pararealizar dterminada accion
		
		int x=2;
		
//		while  (x<=5) { //Mientras x sea menor a 5, realiza lo siguiente
//			System.out.println("Hola mundo");
//			x++; //Una vez ejecutada la linea de arriba
//			//incrementamos el valor de x en 1+
//		}	
		
		//DO-WHILE (nos aseguramos de que el codigo se ejecute por lo
		//menos una vez, y después pregunta de acuerod a la condicion
		//si el programa debe seguir ejecutandose
		
//		do { 
//			System.out.println("Hola mundo");
//		} while (x>5) ;
//		
		//FOR
		
		for (int i=0; i<5; i+=2) {
			System.out.println("Hola mundo");
		}
		
		
	}//FIN DE MAIN

}//FIN CODIGO
