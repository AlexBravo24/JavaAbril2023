package com;

import java.util.Scanner;

public class Ejercicio3_JIMU {

	public static void main(String[] args) {
		/*3.Crea un programa que pida al usuario dos n�meros y 
		 * muestre el resultado de su divisi�n. Si el 
		segundo n�mero es 0, debe mostrar un mensaje de error.
            */
		double numeroUno;
		double numeroDos;
		double div;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un primer n�mero por teclado");
		numeroUno = entrada.nextInt();
		
		System.out.println("Introduce un segundo n�mero por teclado");
		numeroDos = entrada.nextInt();

		if (numeroDos == 0) {
			System.out.println("Error de operaci�n");
			
		}else {
		
		div= numeroUno/numeroDos;
		System.out.println("La divisi�n es " +div);
		}
		
	}

}
