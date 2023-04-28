package com; //nombre del paquete

import java.util.Scanner;

public class TiposDeDatos { // nombre de la clase y
	// su llave de apertura

	// Comentarios de una sola línea

	/*
	 * comentarios de multiples líneas
	 */

	// Método Main para la ejecución del código

	public static void main(String[] args) {

		// Dentro del método principal vamos a poder
		// escribir código para que se lleve a cabo
		// su ejecución

		/*
		 * TIPOS DE DATOS PRIMITIVOS NÚMERICOS ENTEROS
		 */

		// podemos declarar una variable de un tipo de dato
		// sin asignarle un valor aún, y podemos asignarlo
		// posteriormente

		byte numero;
		numero = -128;

		// o podemos tambén declarar las variables y declarar
		// el valor inmediatamente
		short numeroShort = 32000; // 16bits
		int numeroEntero = 2147483647; // 32bits
		long numeroLong = 2147483647; // 64bits de memoria
		// que utiizan y para contener ese valor necesitan
		// de un sufijo que es la letra "l" o "L"

		/*
		 * TIPOS DE DATOS PRIMITIVOS NÚMERICOS DE COMA FLOTANTE O PUNTO DECIMAL
		 * 
		 */

		float numerofloat = 137878278.128989F;
		// necesitan del sufijo f y utilizan 32bits(4bytes)
		double numeroDouble = 137878278.128989;
		// utilizan 64 bits

		/*
		 * TIPOD DE DATOS PRIMITIVOS BOOLEANOS CARACTER
		 */

		boolean boo = true; // contiene valores true o false unicamente
		// nos sirven para evaluar expresiones o condiciones

		char letra = 'm'; // puedde llevar un caracter a, 1, ?, /, etc.
		// emplea una memoria de 2 bytes

		/*
		 * TIPO DE DATOS OBJETOS O ESTRUCTRADOS (TIPO DE DATO NO PRIMITIVO)
		 * 
		 */

		String nombre = "hola, Alvaro Cruz Sanchez";

		/*
		 * TIPO DE DATO OBJETO (ENVOLTORIO)
		 * 
		 */

		Byte numeroByte = -128;

		// Brindarle una salida a los datos en consola y mostrar
		// la ejecucion del programa
//		System.out.println("Hola mundo"); // atajo para escrbir la salida del mensaje con
//		// "syso Ctrl + espacio"
//		System.out.println(nombre);
//		System.out.println(letra);
//		System.out.println(numeroByte.doubleValue());

		int prueba1 = 90;
		int prueba2 = 7;

		// int resultado = prueba1/prueba2;
		Integer resultado = prueba1 / prueba2;

		// System.out.println(resultado.doubleValue());

		/*
		 * Entrada de datos
		 * 
		 */

		int entradaNumeros; // Declaro una variable donde pueda
		// guardas los datos o números que quiero introducir por el teclado

		Scanner lector = new Scanner(System.in);
		// Iniciamos un objeto de la clase Scanner que me va a permitir
		// introducir valores por teclado, ya sea, caracteres o
		// números, etc
		System.out.println("Introduce un numero: ");

		entradaNumeros = lector.nextInt();
		lector.close();
		
		
		// El valor introducido por teclado se pasa temporalmente
		// a mi variable u objeto llado lector y posteriormente
		// debo guardarlo en una variable, que seria entradaNumeros

		System.out.println("la raiz de " + entradaNumeros + " es ");
		//System.out.println(Math.sqrt(entradaNumeros));

		System.out.printf("%.2f", Math.sqrt(entradaNumeros));
	}// cierre del main

} // cierre de la clase
