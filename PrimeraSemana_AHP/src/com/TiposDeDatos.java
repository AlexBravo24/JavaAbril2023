package com; //Nombre del paquete

import java.util.Scanner;

public class TiposDeDatos { // Nombre de la clase y su llave de apertura
	// Comentarios de una sola línea

	/*
	 * Comentarios de múltiples líneas entonces puede escribir hasta donde quieras
	 */

	// Método main para la ejecución de código

	// Se escriba la palabra "main" + Ctr + Espacio

	public static void main(String[] args) {

		/*
		 * Dentro del método principal vamos a poder escribir código para que se lleve a
		 * cabo su ejecución.
		 */

		// Atajo para guardar la clase CTR + S

		/*
		 * Tipos de datos primitivos Numericos enteros
		 */

		// Podemos declarar una variable de un tipo de dato
		// sin asignarle un valor aún y podemos hacerlo posteriormente

		byte numero; // 8bits
		numero = -128;

		// o podemos declarar las variables
		// y asignarles el valor inmediatamente

		short numeroShort = 32000; // 16 bits
		int numeroEnter = 2147483647; // 32 bits
		long numeroLong = 2147483650L; // Se debe agregar la letra "L" al final 64 bits

		// No se puede repetir el nombre de la variable aunque sea de distinto tipo de
		// dato

		// La variable más empleada para enteros es "int"

		/*
		 * Tipos de datos primitivos numéricos de coma flotante o punto decimal
		 */

		float numeroFloat = 3.141516F; // Requiere de un sufico para más de un orden de magnitud en decimal 32 bits
		double numeroDouble = 3.1415169845168461; // No requiere del sufijo e utiliza 64 bits

		// La variable comodín de los numéricos de coma flotante
		// Son los de tipo "double"
		// Se recomienda entonces usar "int" y "double"

		/*
		 * Tipos de datos primitivos a parte de los tipos de datos numéricos se tienen
		 * los boolean o los caraccter
		 *
		 */

		boolean boo = true;
		boolean boo1 = false;

		// Sirve para evaluar condiciones o expresiones

		char letra = '/'; // Solo admite 1 caracter 2 bytes

		/*
		 * Tipos de datos objeto o estricturados Tipos de datos no primitivo
		 */

		String nombre = "Adrian Hidalgo Paz";

		// Tipos de datos objeto envoltorio

		Byte numeroByte = -128;
		// numeroByte el wrap permite agregar o juntar 2 cosas
		// Bridar salida a los datos en consola y mostrar la ejecución del problema

		System.out.println("Hola mundo");
		System.out.println("mi nombre es " + nombre); // Atajo syso + ctrl + espacio
		// System.out.println(letra);
		// System.out.println(numeroByte);
		// System.out.println(numeroByte.doubleValue()); // Para mostrar las propiedades
		// tipo envoltorio

		// Atajo para alinear el código ctrl+shift+F

		int prueba1 = 90;
		int prueba2 = 7;

		int resultado = prueba1 / prueba2;
		// System.out.println(resultado);

		Integer resultado1 = prueba1 / prueba2;
		// System.out.println(resultado1.doubleValue());

		/*
		 * Entrada de datos
		 * 
		 */

		int entradaNumeros; // Declaro una variable donde pueda guardar
		// los datos o número que queiro introducir por teclado

		Scanner lector = new Scanner(System.in);
		// Iniciamos un objeto de la clase Scanner, que permite introducir valores por
		// teclado,
		// ya sean caracteres o números, etc
		System.out.println("Introduce un número por teclado:");
		entradaNumeros = lector.nextInt();
		// El valor introducido por teclado se pasa temporalmente
		// a mi variable u objeto llamado lector
		// Posteriormente debo guardarlo en una variable, que sería "entradaNumeros"

		System.out.println("La raíz de " + entradaNumeros + " es: ");
		// System.out.println(Math.sqrt(entradaNumeros));

		// System.out.println("Intoduce otro número ");
		// entradaNumeros = lector.nextInt();
		// System.out.println("El cuadrado de " + entradaNumeros + " es: ");
		// System.out.println(Math.sqrt(entradaNumeros));

		System.out.printf("%.3f", Math.sqrt(entradaNumeros));
		lector.close();

	}// cierre del main
} // Llave de cierre o cierre de la clase
