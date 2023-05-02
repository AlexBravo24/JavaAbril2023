package com;

public class StringsCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Método de la clase String
		
		
		//.length (Devuelve el valor numerico de la longitud
		//texto
		
		String cadena = "Hoy es 26 de Abril de 2023";
		System.out.println(cadena.length());
		
		//.charAt (Devuelve el caracter que se encuentra
		//en la posición o indice especificado)
		
		System.out.println(cadena.charAt(4));
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring (Devuelve el valor de una subcadena de texto
		//a partir del indice especificado)
		System.out.println(cadena.substring(2,20));
		
		//.tolowerCase (Convierte la cadena a minusculas)
		//.toUppercase (Convierte la cadena a mayusculas)
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals (Compara objetos, o en este caso, strings
		//y nos devuelve un valor true o false
		System.out.println(cadena.equals("Hoy es 26 de Abril de 2023"));
		
		//.equalsignoreCase (Compara los objetos, pero
		//ignora si tiene mayusculas o minusculas)
		System.out.println(cadena.equalsIgnoreCase("hoy es 26 de abril de 2023"));
		
		System.out.println(cadena.contains("b"));
		
		
		//CICLOS o también llamados BUCLES
		//Estructuras que nos van a permitir
		//repetir una secuencia o proceso
		
		//while (Mientras)
		
		//Variable que me va a servir para realizar determinada acción
		int x = 2;
		while (x<=5) { //Mientras xsea menor a 5, realiza lo siguiente
			System.out.println("Hola mundo");
			x++; //Una vez ejecutada la linea de arriba
			//incrementamos el valor de x en 1 +

		}

		//DO-WHILE (Nos aseguramos de que el codigo se ejecute por lo 
		//menos una vez, y después pregunta de acuerdo a la condición
		//si el programa debe seguir ejecutandose
		do {
			System.out.println("Hola mundo");
			
		}while (x> 5);
		
	
	//for (para las siguientes condiciones o argumentos , realizan x cosa)		
		for ( int i = 2; i <5; i++) {
			System.out.println("Hola mundo");
			System.out.println(i + 1);
		}
	}

}
