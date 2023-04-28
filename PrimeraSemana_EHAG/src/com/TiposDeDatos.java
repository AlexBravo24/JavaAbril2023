package com;

import java.util.Scanner;

public class TiposDeDatos {
	public static void main(String[] args) {//
		
		byte numero;
		numero=-128;
		
		short numeroShort=32000;
		int numeroEntero=2147483647;
		long numeroLong=123456789878799l;
		
		
		
		float numeroFloat=21142144f;
		double numeroDouble=12443344.345554;
		
		
		boolean boo= false;
		char caracter='/';
		
		
		String nombre= "Elba Alba";
		Byte numeroByte=-128;
		//numeroByte.
		
		//System.out.println("hola mundo");
		//System.out.println(nombre);
		
			int prueba1=90;
			int prueba2=7;
			
			//integer resultado= prueba1/prueba2;
			
			 //System.out.println(resultado.doubleValue());
			
			// entrada de datos
			
			int entradaNumeros;//declaro un a bariable dobde pueda guardar 
			//los datos o numeros que quiero introducir por teclado
			
			Scanner lector = new Scanner (System.in);
			System.out.println("introduce un numero por teclado");
			 entradaNumeros= lector.nextInt();
			System.out.println("La raiz de" + entradaNumeros+"es");
			//System.out.println(Math.sqrt(entradaNumeros));
			System.out.printf("%.3f",Math.sqrt(entradaNumeros));
			
			
			
	}

}
