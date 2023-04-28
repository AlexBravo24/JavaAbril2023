package com; //nombre del paquete

import java.util.Scanner;

public class TiposDeDatos { //nombre de la clase  y
	//su llave de apertura 

	//comentarios de una sola linea
	
	/*Comentarios
	 * do
	 * multiples
	 * lineas
	 * 
	 */
	
	//Método main - necesario para la ejecución de código
	//escriben la palabra main + ctrl + espacio
	public static void main(String[] args) {
		
		//Dentro de el metodo principal vamos a poder 
		//escribir código para que se lleve a cabo
		//su ejecucion
		
		//Atajo para guardar cambios en la clase 
		//Ctrl + s
		
		/*TIPOS DE DATOS PRIMITIVOS 
		* NUMEROS ENTEROS
		*/
		
		//podemos declarar una variable de un tipo de dato 
		//sin asignarlo un valor aún, y podemos asignarlo
		//posteriormente
		
		byte numero; //tiene un tamaño de 8 bits o 1 byte
		numero=-128;
		
		//o podemos tambi´´én declarar las variables y asignarles 
		//el valor inmediatamente 
		
		short numeroShort=32000;
		int numeroEntero=2147483647; //32bits
		long numeroLong=2147483640l;//64 bits de memoria 
		//que necesitan utilizan y para contener ese valor necesitan 
		//de un sufijo que es la letra "l" o "L"
		
		//no se puede repetir el nombre de la variable
		//aunque sean de distinto tipó de dato
		
		//long  numeroEntero;
		
		//la variable comodin a utilizar mas comunmente
		//es la de tipo "int"
		
		
		/*TIPO DE DATOS PRIMIVIVOS
		 *  NUMÉRICOS DE COMA FLOTANTE O PUNTO DECIMAL
		 * 
		 */
		
		float numeroFloat=137878278.128989F;
		//necesitan del surtido yt y utilizan 32 bits (4bytes)
		double numeroDouble=13787278.128989;
		//utilizan 64 bits
		
		//valariable comodin de los números de como flotante
		//son los de tipos "double"
		
		/*TIPOS DE DATOS PRIMITIVOS 
		 * BOOLEANOS
		 * CARACTER
		 */
				 boolean boo = false; //solo pueden contener valores o  falso 
		//nos sirven pra evaluar expresiones o condiciones 
				 
		 char letra ='a';
		//Solo admitenun caracter y emplean
				 //una memoria de 2 bytes.
				 
				 
		/*TIPOS DE OBJETOS O ESTRUCTURADOS
		 * (TIPO DE DATO NO PERMITIVO)
		 * 
		 */
		
		 String nombre = "Yocelin Guadalupe Vazquez Caballero";
		 
		 /*TIPO DE DATO OBJETO
		  * (ENVOLTORIO)
		  * 
		  */
		 
		 Byte numeroByte = -128;
		 
		 //Brindarle una salida a los datos en consola y montrar 
		 //la  ejecucion de programa
		 
		 System.out.println("Hola Mundo");
		 
		 //Atajo para escribir el System.out.printin
		 //ayao + crtl + espacio
		 
		 System.out.println(nombre);
		 
		 System.out.println(letra);
		 
		 //Para mostrar las propiedades de Lipo envollorio
		 System.out.println(numeroByte.doubleValue());
		 
		 //Atajo para brindar formato al codigo
		 //Ctrl + shirt + +
		 
		 int prueba1 =90;
		 int prueba2= 7;
		 
		 Integer resultado = prueba1/prueba2;
		 
		 System.out.println(resultado.doubleValue());
		 //Stystem.out.println(resultado.doubleValue());
		 
		 /*Entrada de datos
		  * 
		  */
		 
		 int entradaNumeros;//Declaro una variable donde puedo guardar
		 //los datos o numeros que quiero introducir por teclado
		 
		 Scanner lector = new Scanner(System.in);
		 //Iniciamos un opbjeto de la clase Scanner, que me va a permitir
		 //Introduccir valores por teclado, ya sea, caracteres o
		 //numero, etc
		 System.out.println("introduce un número por teclado");
		 
		 entradaNumeros = lector.nextInt();
		 //El valor introducido por numero es paso temporalmente
		 //a mi variable u objeto llamado lector y posteriormente
		 //debo guardarlo en una variable, que seria entradaNumeros
		 
		
		 System.out.println("la raiz de " + entradaNumeros + " es ");
		 System.out.println(Math.sqrt(entradaNumeros));
		 
		 System.out.printf("%.3f", Math.sqrt(entradaNumeros));
		 
		 
	}//cierre del main
}//Cierrre de la clase
