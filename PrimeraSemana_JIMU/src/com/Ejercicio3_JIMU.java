package com;

import java.util.Scanner;

public class Ejercicio3_JIMU {

	public static void main(String[] args) {
		/*3.Crea un programa que pida al usuario dos números y 
		 * muestre el resultado de su división. Si el 
		segundo número es 0, debe mostrar un mensaje de error.
            */
		double numeroUno;
		double numeroDos;
		double div;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un primer número por teclado");
		numeroUno = entrada.nextInt();
		
		System.out.println("Introduce un segundo número por teclado");
		numeroDos = entrada.nextInt();

		if (numeroDos == 0) {
			System.out.println("Error de operación");
			
		}else {
		
		div= numeroUno/numeroDos;
		System.out.println("La división es " +div);
		}
		
	}

}
