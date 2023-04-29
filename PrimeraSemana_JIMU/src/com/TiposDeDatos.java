package com; // nombre del paquete

import java.util.Scanner;

public class TiposDeDatos { //nombre de la clase y su llave de apertura

	/* comentarios de 
 * multiples
 * líneas
 */
	
	//Para le ejecución de código es necesario el método main
	// se escribe la palabra main + ctrl + espacio
	public static void main(String[] args) {
		
		/*Dentro del metodo principal main vamos a 
		 * poder escribir código para que se lleve
		 * a cabo la ejecución
		 * 
		 */
		//Atajo para guardar cambios es ctrl + S
		/*Tipos de datos PRIMITIVOS
		 *NUMÉRICOS ENTEROS
		 */
		//Podemos declarar una variables de un tipo de dato
		//y podemos asignarle un valor aún y podemos asignarle uno
		//posteriormente
		
		byte numero; //declaración de variable sin asignación de valor
		short numeroShort = 32000; //16 bits
		numero =- 128; //asignación del valor a la variable
		int numeroEntero= 34; // 32 bits
		long numeroLong=1234567898736162L; // a los números long se agrega la l o L al final
		
		/*Tipos de Datos Primitivos
		 * NUMÉRICOS DE COMA FLOTANTE O PUNTO DECIMAL
		 * 
		 */
		float numeroFloat=123459878.3214567f;
		double numeroDouble = 7854458841.214578; //double es el más utilizado en los flotantes
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANO
		 * CARACTER
		  */
		
		boolean boo = true; //solo reciben valores de tipo true o false 
		//y nos sirve para evaluar expresiones o condiciones
		
		char letra = 'i'; // solo admiten un caracter
		
		/*TIPOS DE DATOS OBJETO O ESTRUCTURADOS
		 * (TIPO DE DATO NO PRIMITIVO)
		 */
		
		String nombre= "Ivan Montero";
		
	/*TIPO DE DATO OBJETO
	 * (ENVOLTORIO)
	 * 
	 */
		
		Byte numeroByte = -128;
		
	//Brindarle una salida de datos en consola y mostrar
		//la ejecución del programa
		
		System.out.println ("Hola Mundo");
		
		//atajo para escribir System.out.println
		//syso + Ctrl + espacio
		
		System.out.println(nombre);
		System.out.println(numeroByte.doubleValue());
		
		//Atajo para brindar formato al código
		//Ctrl + shift + f
		
		/*Entrada de datos
		 * 
		 * 
		 */
		int entradaNumeros;//DEclaro una variable donde pueda guardar
		//los datos o número que quiero introducir por teclado
		
		Scanner lector = new Scanner (System.in);
		//Iniciamos un objeto de la clase scanner que me va 
		//permitir introducir valores por teclado
		//ya sean caracteres o números, etc.
		
		System.out.println("Introduce un número por teclado");
		entradaNumeros = lector.nextInt();
		//El valor introducido por teclado se pasa temporalmente
		//a mi variable u objeto llamado lector y posteriormente
		//debo guardarlo en una variable que sería entradaNumeros
		
		System.out.println("La raíz de " + entradaNumeros + " es ");
		//System.out.println(Math.sqrt(entradaNumeros));
		
		System.out.printf("%.2f", Math.sqrt(entradaNumeros));
		//El simbolo %.2f indica cuantos números mostrará después del punto
		
		
	} // cierre del main
	
} //llave de cierre de la clase
