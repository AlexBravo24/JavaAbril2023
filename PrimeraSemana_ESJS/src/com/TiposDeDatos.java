package com;

import java.util.Scanner;

public class TiposDeDatos {// nombre de la clase
	// y su llave de apertura

	// comentarios de una sola linea

	/*
	 * Comentarios de multiples lineas
	 */

	// Metodo maun - necesario para la ejecucion de codigo
	// escriben la palabra main + ctrl + espacio

	public static void main(String[] args) {

		// Dentro de el metodo principal vamos a poder
		// escribir codigo para que se lleve a cabo
		// su ejecicion

		// Atajo para guardar cambios en la clase
		// Ctrl + s

		/*
		 * TIPOS DE DATOS PRIMITIVOS NUMERICOS ENTEROS
		 */

		// Podemos declarar una variable de un tipo de dato
		// sin asignarle un valor aun, y podemos asignarlo
		// posteriormente

		byte numero; // tiene un tamaño de 8 bits o 1 byte
		numero = -128;

		// o podemos tambien declarar las variables y asignarle
		// el valor inmediatamente

		short numeroShort = 32000; // 16 bits
		int numeroEntero = 2147483647; // 32 bits
		long numeroLong = 21474836491233443l; // 64 bits de memoria
		// que utilizan y para contener ese valor necesitan
		// de un sufijo que es la letra "l" o "L"

		// La variable comodin a utilizar mas comunmente
		// en la de tipo "int"

		/*
		 * TIPOS DE DATOS PRIMITIVOS NUMERICOS DE COMA FLOTANTE O PUNTO DECIMAL
		 */

		float numeroFloat = 123456789.123456F;
		// necesitan del sufijo f y utilizan 32 bits (4 bytes)
		double numeroDouble = 123456789.123456;
		// utilizan 64 bits

		// La variable comodin de los numericos de coma flotante
		// son los de tipo "double"

		/*
		 * TIPOS DE DATOS PRIMITIVOS BOOLEANOS CARACTER
		 */

		boolean boo = false; // solo pueden contener valores verdadero o
		// nos sirve para evaluar expresiones o condiciones

		char letra = '/';
		// solo admiten un caracter y emplean
		// una memoria de 2 bytes

		/*
		 * TIPOS DE DATOS OBJETO O eSTRUCTURADOS (TIPO DE DATO NO PRIMITIVO)
		 *
		 */

		String nombre = "Erick Sebastian Jaime Salamanca";

		/*
		 * TIPO DE DATO OBJETO (ENVOLTORIO)
		 * 
		 */

		Byte numeroByte = -128;

		// Brindarle una salida a los datos en consola y mostrar
		// la ejecucion del programa

		//System.out.println("Hola mundo");

		// atajo para escribir System.out.println();
		// syso + ctrl + espacio

		//System.out.println(nombre);

		//System.out.println(letra);

		// para mostrar las propiedades de tipo envoltorio
		//System.out.println(numeroByte.doubleValue());
		
		//Atajo para brindar formato al codigo
		//Ctrl + shift + f
		
	    int prueba1 = 90;
	    int prueba2 = 7;
	    
	    //int resultado = prueba1/prueba2;
	    
	    //System.out.println(resultado);
	    
	    
        Integer resultado = prueba1/prueba2;
	    
	    //System.out.println(resultado.doubleValue());
        
        /*Entrada de datos
         * 
         */
        
        int entradaNumeros; // Declaro una variable donde pueda guardar
        //los datos o numero que quiero introducir por el teclado
        
        Scanner lector = new Scanner(System.in);
        // Iniciamos un objeto de la clase Scanner, que me va a permitir
        //introducir valores por teclado, ya sea, caracteres o
        //numero, etc.
        
        System.out.println("Introduce el número por teclado");
        
        entradaNumeros = lector.nextInt();
        lector.close();
        
        //El valor introducido por teclado se pasa temporalmente
        //a mi variable u objeto llamado lector y posteriormente
        //debo guardarlo en una variable, que seria entradaNumeros
        
        System.out.println("La raíz de " + entradaNumeros + " es ");
        System.out.println(Math.sqrt(entradaNumeros));
        
        System.out.printf("%.3f", Math.sqrt(entradaNumeros));
        
	    
	    

	}// Cierre de main

}// llave de cierre o cierre de la clase
