package com; //Nombre del paquete

import java.util.Scanner;

public class TiposDeDatos {// Nombre de la clase y su llave de apertura

	// Comentarios de una sola linea

	/*
	 * Comentarios de multiples lineas
	 */

	// Método Main- necesrio para la ejecución de código
	// Escribir la palabra main + ctrl + espacio
	public static void main(String[] args) {

		// Dentro de el metodo principal vamos
		// escribir el código para que se lleve a cabo
		// su ejecución

		// Atajo para guardar cambios en la clase
		// ctrl + s

		/*
		 * TIPOS DE DATOS PRIMITIVOS NUMÉRICOS ENTEROS
		 */

		// podemos declarar una variable de un tipo
		// sin asignarle un valor aún, y podemos asignarlo
		// posteriormente

		byte b; // tiene un tamaño de 8 biteso 1 byte
		b = -128;

		// o podemos también declarar las variables y asignarles
		// el valor inmediatamente

		short bshort = 32000; // 16bits
		int bEntero = 2147483647; // 32bits
		long blong = 2147483649l;// 64bits de memoria
		// que utilizan y para contener ese valor necesitan
		// de un sufijo que es la letra"l" o "L"

		// no s puede repetir el nombre de la variable
		// aunque sean de distinto tipo de dato

		// La variable comodin a utilizar más comunmente
		// es la de tipo"int"

		/*
		 * TIPOS DE DATOS PRIMITIVOS NUMÉRICOS DE COMA FLOTANTE O PUNTO DECIMAL
		 * 
		 */

		float bfloat = 137878278.128989f;
		// necesitan del sufijo f y utilizan 32bits dememoria(4bytes)
		double bdouble = 137878278.128989;
		// utilizan 64 bits

		// La variable comodín de los numéricos de coma flotante
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

		String nombre = "José Guadalupe Garibo Gervacio";

		/*
		 * TIPO DE DATO OBJETO (ENVOLTORIO)
		 * 
		 */

		Byte numeroByte = -128;

		// Brindarle una salida a los datos en consola y mostrar
		// La ejecución del programa

		//System.out.println("Hola mundo");

		// Atajo para escribir el System.Out.println);//syso + ctrl +espacio

		//System.out.println(nombre);

		//System.out.println(letra);

		// ´Para motrar las propiedades de tipo envoltorio
		//System.out.println(numeroByte.doubleValue());
		
		//Ataajo para brindar formato al código
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
		//números, etc.
		System.out.println("Introduce un número por teclado");
		
		entradaNumeros =lector.nextInt();
		lector.close();
		//El valor introducido por teclado se pasa temporalmente
		//a mi variable u objeto llamado lector y posteriormente
		//debo guardarlo en una vriable, que sería entradaNumeros
		
		System.out.println("La raíz de " + entradaNumeros + " es ");
		//System.out.println(Math.sqrt(entradaNumeros));
		
	    System.out.printf("%.3f", Math.sqrt(entradaNumeros));
		

	} // Llave del cierre de main

} // Cierre de la clase
