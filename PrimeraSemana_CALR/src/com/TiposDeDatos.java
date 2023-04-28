package com;

import java.util.Scanner;

public class TiposDeDatos {
	// comentario de una linea
	/*
	 * comentario de varias lineas
	 */
	public static void main(String[] args) {

		/*short numeroCorto = 32000; // 16 bits
		int numeroEntero = 2147483647; // 32 bits
		long numeroLargo = 2147483649123L; // 64 bits

		// datos de tipo flotante
		// flot y double
		float numeroFlotante = 47364829.258F;
		double numeroDoble = 4736482.452;

		// dato valor booleano, sirve para las condicionales o verificar los valores
		// verdadero o falso
		boolean boo = false;
		boolean lean = true;

		char letra = 'c';
		// solo pueden contener un caracter,
		// emplean 2 bytes en memoria

		String nombre = "Carlos Reducindo";

		System.out.println("el nombre es " + nombre);
		
		int prueba1 = 90;
		int prueba2 = 7;
		int resultado = prueba1/prueba2;
		System.out.println(resultado);	*/
		
		int entradaNumeros;
		Scanner lector = new Scanner (System.in);
		System.out.println("ingresa un numero");
		entradaNumeros = lector.nextInt();
		//System.out.println("el numero es " + entradaNumeros);
		System.out.println("la raiz de " + entradaNumeros + " es ");
		//System.out.println(Math.sqrt(entradaNumeros));
		
		System.out.printf("%.3f ", Math.sqrt(entradaNumeros));
	}

}
