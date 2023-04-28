package com; //nombre del paquete

import java.util.Scanner;

public class TiposDeDatos { // nombre de la clase y
	// su llave de apertura

	// Comentarios de una sola l�nea

	/*
	 * Comentarios de multiples lineas
	 * 
	 */

	// M�todo main - necesario para la ejecuci�n de c�digo
	// escriben la palabra main + ctrl + espacio

	public static void main(String[] args) {

		// Dentro de el metodo principal vamos a poder
		// escribir c�digo para que se lleve a cabo
		// su ejecuci�n

		// Atajo para guardar cambios en la clase
		// Ctrl + s

		/*
		 * TIPOS DE DATOS PRIMITIVOS NUM�RICOS ENTEROS
		 */

		// podemos declarar una variable de un tipo de dato
		// sin asignarle un valor a�n, y podemos asignarlo
		// posteriormente

		byte numero; // tiene un tama�o de 8 bits o 1 byte
		numero = -128;

		// o podemos tambi�n declarar las variables y asignarles
		// el valor inmediatamente

		short numeroShort = 32000; // 16bits
		int numeroEntero = 2147483647; // 32bits
		long numeroLong = 21474836491233443L;// 64 bits de memoria
		// que utilizan y para contener ese valor necesitan
		// de un sufijo que es la letra "l" o "L"

		// no se puede repetir el nombre de la variable
		// aunque sean de distinto tipo de dato

		// long numeroEntero;

		// La variable comod�n a utilizar m�s comunmente
		// es la de tipo "int"

		/*
		 * TIPOS DE DATOS PRIMITIVOS NUM�RICOS DE COMA FLOTANTE O PUNTO DECIMAL
		 * 
		 */

		float numeroFloat = 137878278.128989F;
		// necesitan del sufijo f y utilizan 32bits(4bytes)
		double numeroDouble = 137878278.128989;
		// utilizan 64 bits

		// la variable comodin de los n�mericos de coma flotante
		// son los de tipo "double"

		/*
		 * TIPOS DE DATOS PRIMITIVOS BOOLEANOS CARACTER
		 */

		boolean boo = false; // solo pueden contener valores verdadero o falso
		// nos sirve para evaluar expresiones o condiciones

		char letra = 'a';
		// Solo admiten un caracter y emplean
		// una memoria de 2 bytes.

		/*
		 * TIPOS DE DATOS OBJETO O ESTRUCTURADOS (TIPO DE DATO NO PRIMITIVO)
		 * 
		 */

		String nombre = "Jorge Alejandro Bravo Ramirez";

		/*
		 * TIPO DE DATO OBJETO (ENVOLTORIO)
		 * 
		 */

		Byte numeroByte = -128;

		// Brindarle una salida a los datos en consola y mostrar
		// la ejecuci�n del programa

		// System.out.println("Hola mundo");

		// Atajo para escribir el System.out.println
		// syso + ctrl + espacio

		// System.out.println(nombre);

		// System.out.println(letra);

		// Para mostrar las propiedades de tipo envoltorio
		//System.out.println(numeroByte.doubleValue());
		
		//Atajo para brindar formato al codigo
		//Ctrl + shift + f
		
		int prueba1 = 90;
		int prueba2 = 7;
		
		//int resultado = prueba1/prueba2;
		
		Integer resultado = prueba1/prueba2;
		
		//System.out.println(resultado.doubleValue());
		
		/*Entrada de datos
		 * 
		 */
		
		int entradaNumeros; //Declaro una variable donde pueda guardar
		//los datos o n�meros que quiero introducir por teclado
		
		Scanner lector = new Scanner(System.in);
		//Iniciamos un objeto de la clase Scanner, que me va a permitir
		//introducir valores por teclado, ya sea, caracteres o
		//n�meros, etc
		System.out.println("Introduce un n�mero por teclado");
		
		entradaNumeros = lector.nextInt();
		lector.close();
		
		//El valor introducido por teclado se pasa temporalmente
		//a mi variable u objeto llamado lector y posteriormente
		//debo guardarlo en una variable, que ser�a entradaNumeros
		
		System.out.println("La ra�z de " + entradaNumeros + " es ");
		//System.out.println(Math.sqrt(entradaNumeros));
		
		System.out.printf("%.3f", Math.sqrt(entradaNumeros));
		
		
		

	}// Cierre del main

}// Cierre de clase
