package com; // nombre del paquete

import java.util.Scanner;

public class TiposDeDatos {//nombre de la clase y llave de apertura
	
	//Comentarios de una sola línea
	
	/*comentarios de
	 * varias
	 * lineas
	 */
	
	//método main - necesario para la ejecución del código
//escriben main + ctrl+ espacio
	public static void main(String[] args) {
	
		//atajopara guardar cambios ctrl+s
		
		/*tipos de datos primitivos
		 * numeros enteros
		 * 
		 * podemos declarar y nombrarla despues
		 */
		byte numero; // tamaño 8bits o 1 byte
		numero=-128;
		
		//o podemos tambien declarar las variables 
		//y asignar el valor inmendiatamente
		short numeroShort=32000;// 16 bites
		int numeroEntero=2147483647;//32 bites
		long numeroLong=2147483649l;//64 bites de mem para contener el
		//valor necesita letra "l" o "L"
		
		//la variable comodín comunmente es "int"
		/*tipos de datos primitivos
		 * numericos de coma flotante o punto decimal
		 */
		
		float numeroFloat=137878278.128989F;
		//necesitan el sufijo "F" usan 32bits (4bytes)
		double numeroDouble=137878278.128989;
		//usan 64 bits
		
		//variable comodín de coma flotante 
		// son los tipo double
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * booleanos
		 * caracter
		 */
		
		boolean boo = false;//solo pueden contener valores verdadero o falso
		//nos sirve para evaluar expresiones o condiciones
		
		char caracter = '/';
		//solo admiten un caracter y emplean una
		//memoria de 2 bytes
		
		//TIPOS DE DATOS DE OBJETO O ESTRUCTURADOS
		//(TIPO DE DATO NO PRIMITIVO)
		
		String  nombre = "Victor Manuel García Fernandez";
		
		//TIPOS DE DATO OBJETO ENVOLTORIO
		
		
		Byte numeroByte=-128;
		
		//Brindarle una salida de datos a consola y mostrar 
		//la ejecución del programa
		
		//System.out.println("Hola mundo");
		
		//Atajo impresión en pantalla syso + ctrl + espacio
		
		//System.out.println(nombre);
		//System.out.println(letra);
		//para mostrar las propiedades de tipo envoltorio
		//System.out.println(numeroByte.doubleValue());
		//Atajo para dar formato al codigo
		//ctrl+shift+f
		
		int prueba1 = 90;
		int prueba2 = 7;
		
		Integer resultado = prueba1/prueba2;
		//System.out.println(resultado.doubleValue());
		/*Entrada de datos
		 * 
		 */
		int entradaNumeros;//Declaro una variable
		//por medio del teclado
		
		Scanner lector = new Scanner(System.in);
		//Iniciamos un objeto de clase scanner que permite
		//introducir valores por teclado, caracteres, numeros, etc.
		
		System.out.println("Introduce un número por teclado");
		
		entradaNumeros = lector.nextInt();
		//El valor introducido por teclado se pasa temporalmente 
		//a mi variable u objeto llamado lector y posteriormente 
		//debo guardarlo en una variable que sería entradaNumeros
		
		System.out.println("La raiz de "  + entradaNumeros +  " es ");
		//System.out.println(Math.sqrt(entradaNumeros));
		
		System.out.printf("%.3f", Math.sqrt(entradaNumeros));
		//función para ajustar el formato de decimales, 2, 3, 4, despues del punto
		
		
		
		
	}//cierre del main
	
}//cierre de clase
