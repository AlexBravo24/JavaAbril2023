package com;

import java.util.Scanner;

public class TiposDeDatos { //nombre de la clase y
     // su llave de apertura
	//comentarios de una sola linea
	
	/*comentarios
	 * de
	 * multiples
	 * lineas
	 * 
	 */
	
	//Método main necesario para la ejecución de código
	//escriben la palabra main +ctrl+espacio
	public static void main(String[] args) {
		
		//dentro del metodo principal vamos a poder
		//escribir código para que se lleve a cabo
		//su ejecución
		
		//atajo para guardar cambios en la clase
		//ctrl+s
		
		/*Tipos de datos primitivos
		 * NUMERICOS ENTEROS
		 */
		//podemos declarar una varible de un tipo de dato
		//sin asignarle un valor aún y podemos asignarlo
		//posteriormente
		
		byte numero; //tamaño de 8 bits o 1 byte
		numero=-128;
		
		//se puede declarar las variables y asignarles
		//el valor inmediatamente
		
		short numeroShort=32000; //16 bits
		int numeroEntero= 214748364; //32 bits
		long numeroLong= 214748364245876l; //64 bits de memoria
		//que utilizan y para ontener ese valor necesitan
		//de un sufijo que es a letra "l" o "L"
		
		//no se pueden repetir nombre de variables
		//aunque sean de distinto tipo de dato
		
		//La variable comodin a utilizar más comunmente 
		//es la de tipo "int"
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS DE COMA FLOTANTE O PUNTO DECIMAL
		 */
		
		float numeroFloat= 137878278.128989f;
		//necesitan del sufijo f y utilizan 32 bits(4 bytes)
		double numeroDouble= 137878278.128989; 
		//utilizan 64 bits
		
		//la variable comodin de los numericos de coma flotante
		//son los tipo "double"
		
		/* IIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
		
		boolean boo=true;//solo puede tener verdadero o falso
		//nos sirve para evaluar expresiones o condiciones
		
		char letra= 'a'; //solo admiten un cararter 
		//emplean una memoria de 2 bytes
		
		/*TIPOS DE DATOS OBJETO O ESTRUCTURADOS
		 * (TIPO NO PRIMITIVOS)
		 */
		String nombre="Alam de Jesus Cordoba Guevara";
		
		/*TIPO DE DATO OBJETO
		 * (ENVOLTORIO)
		 * 
		 */
		
		Byte numeroByte=-128; 
		
		//Brindarle una salida a los datos en consola y mostrar
		//la ejecución del programa
		
		//System.out.println("Hola mundo");
		
		//Atajo para escribir el System.out.println
		//syso+ctrl+espacio
		
		//System.out.println(nombre);
		//System.out.println(letra);
		
		//Para mostrar las propiedades de tipo envoltorio
		//System.out.println(numeroByte.doubleValue());
		
		//Atajo para brindar formato al codigo
		//ctrl+shift+f
		
		int prueba1=90; 
		int prueba2=7;
		
		//int resultado=prueba1/prueba2;
		Integer resultado= prueba1/prueba2;
		//System.out.println(resultado.doubleValue());
		
		int entradaNumeros; //declaro una variable donde pueda
		//guardar los datos o numeros que quiero introducir
		//por teclado
		
		Scanner lector= new Scanner(System.in);
		//Iniciamos un objeto de la clase scanner, que me permite
		//introducir valores por teclado, como caracteres,numeros
		//etc
		System.out.println("Introduce un numero por teclado");
		
		entradaNumeros=lector.nextInt();
		//El valor introducido por teclado se pasa temporalmente
		//a mi variable u objeto llamado lector y porsteriormente
		//debo guardarlo en una variable, que sería entradaNumeros
		
		System.out.println("La raíz de " + entradaNumeros + " es ");
		//System.out.println(Math.sqrt(entradaNumeros));
		
		System.out.printf("%.3f", Math.sqrt(entradaNumeros));
		
		
		
		
		
	}//cierre del main
	

}
