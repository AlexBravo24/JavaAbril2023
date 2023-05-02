package com; //Nombre del paquete

import java.util.Scanner;

public class TiposDeDatos {// Nombre de la clase y su llave de apertura

	// Comentarios de una sola linea

	/*
	 * Comentarios de multiples lineas
	 */

	// M�todo Main- necesrio para la ejecuci�n de c�digo
	// Escribir la palabra main + ctrl + espacio
	public static void main(String[] args) {

		// Dentro de el metodo principal vamos
		// escribir el c�digo para que se lleve a cabo
		// su ejecuci�n

		// Atajo para guardar cambios en la clase
		// ctrl + s

		/*
		 * TIPOS DE DATOS PRIMITIVOS NUM�RICOS ENTEROS
		 */

		// podemos declarar una variable de un tipo
		// sin asignarle un valor a�n, y podemos asignarlo
		// posteriormente

		byte b; // tiene un tama�o de 8 biteso 1 byte
		b = -128;

		// o podemos tambi�n declarar las variables y asignarles
		// el valor inmediatamente

		short bshort = 32000; // 16bits
		int bEntero = 2147483647; // 32bits
		long blong = 2147483649l;// 64bits de memoria
		// que utilizan y para contener ese valor necesitan
		// de un sufijo que es la letra"l" o "L"

		// no s puede repetir el nombre de la variable
		// aunque sean de distinto tipo de dato

		// La variable comodin a utilizar m�s comunmente
		// es la de tipo"int"

		/*
		 * TIPOS DE DATOS PRIMITIVOS NUM�RICOS DE COMA FLOTANTE O PUNTO DECIMAL
		 * 
		 */

		float bfloat = 137878278.128989f;
		// necesitan del sufijo f y utilizan 32bits dememoria(4bytes)
		double bdouble = 137878278.128989;
		// utilizan 64 bits

		// La variable comod�n de los num�ricos de coma flotante
		// son los de tipo"double"

		/*
		 * TIPOS DE DATOS PRIMITIVOS BOOLEANOS CARACTER
		 */

		boolean boo = false; // solo pueden contener valores verdaderos o falsos
		// nos sirven para ebvaluar expresiones o condiciones

		char letra = '/';
		// Solo admite un caracter y emplean
		// una memoria de 2bytes.

		/*
		 * TIPOS DE DATOS OBJETO O ESTRUCTURADO (TIPO DE DATO NO PRIMITIVO)
		 * 
		 */

		String nombre = "Jos� Guadalupe Garibo Gervacio";

		/*
		 * TIPO DE DATO OBJETO (ENVOLTORIO)
		 * 
		 */

		Byte numeroByte = -128;

		// Brindarle una salida a los datos en consola y mostrar
		// La ejecuci�n del programa

		//System.out.println("Hola mundo");

		// Atajo para escribir el System.Out.println);//syso + ctrl +espacio

		//System.out.println(nombre);

		//System.out.println(letra);

		// �Para motrar las propiedades de tipo envoltorio
		//System.out.println(numeroByte.doubleValue());
		
		//Ataajo para brindar formato al c�digo
		//Ctrl + shitf + f
		
		int prueba1 = 90;
		int prueba2 = 7;
		
		//int resultado = prueba1/prueba2;
		
		
		Integer resultado = prueba1/prueba2;	
		
		//System.out.println(resultado.doubleValue());
		
		/*Entrada de datos
		 * 
		 */
		
		int entradaNumeros;//Declaro una variable donde pueda guardar
		//los datos o numeros que quiero introducir por teclado
		
		Scanner lector = new Scanner (System.in);
		//Iniciamos un objeto de la clase Scanner, que me va a permitir
		//introducir valores por teclado, ya sea, caracteres o 
		//n�meros, etc.
		System.out.println("Introduce un n�mero por teclado");
		
		entradaNumeros =lector.nextInt();
		lector.close();
		//El valor introducido por teclado se pasa temporalmente
		//a mi variable u objeto llamado lector y posteriormente
		//debo guardarlo en una vriable, que ser�a entradaNumeros
		
		System.out.println("La ra�z de " + entradaNumeros + " es ");
		//System.out.println(Math.sqrt(entradaNumeros));
		
	    System.out.printf("%.3f", Math.sqrt(entradaNumeros));
		

	} // Llave del cierre de main

} // Cierre de la clase
