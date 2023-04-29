package com;

public class StrigCiclos {

	public static void main(String[] args) {
		// metodo de la clase string
		//.lenght devuelve el valor numerico de la 
		//longitud de un texto

		String cadena = "Victor";
		System.out.println(cadena.length());
		
		//.charAt devolver el caracter que se encuentra en 
		//la posicion o indice especificado
		
		System.out.println(cadena.charAt(1));
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//valor completo char-1
		
		//.substring devuelve el valor de una subcadena texto
		//a partir del indice especificado
		
		System.out.println(cadena.substring(2));
		
		// resultado ctor de victor
		
		System.out.println(cadena.substring(2,4));
		//resultado ct de victor
		
		//.tolowerCase convierte la cadena a minusculas
		//.toupperCase                       mayusculas
		System.out.println(cadena.toLowerCase()); 
		System.out.println(cadena.toUpperCase());
		
		//.equals compara objetos e strings y nos devuelve
		//el valor true o false
		
		System.out.println(cadena.equals("Victor")); //False
		
		//.equalsIgnoreCase ignora si tienes may o min
		
		//System.out.println(cadena.equalsIgnoreCase("Victor");
		
		System.out.println(cadena.contains("V")); //contiene V may

		//CICLOS o bucles
		//estructuras que permiten repetir secuencia o proceso
		
		//while mientras
		//variable para realizar una accion
		int x =2;
	while(x<5) {//mientras x menor a 5 ejecuta
			System.out.println("hola mundo");
			x++;//incrementamos x en una unidad
		}
		
		//do while nos aseguramos de que el codigo se ejecute
		//una vz y pregunta segun la condicion si continua el prog
		
		do {
			System.out.println("hola mundo");
		}while(x>5);
		
		//for para 
		for (int i =2; i < 5; i++) {
			//System.out.println("hi world");
			System.out.println(i+1);
			
		
			
			
		}
		
	}

}
