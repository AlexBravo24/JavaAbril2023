package com;

import java.util.Scanner;

public class Arrays1_JCGM {
	public static void main(String[] args) {
		
//		 Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
//		 Muestra por consola el �ndice y el valor al que corresponde.
		
		
		
		Scanner leer = new Scanner (System.in);
		int x [] = new int [10];
		for(int i = 0; i < x.length; i++) {
			System.out.println("Ingresa tu valor: ");
			x[i] = leer.nextInt();
			
		}
		
		for (int i = 0; i < x.length; i++) {
            System.out.println("El n�mero en la posici�n " + i + " es " + x[i]);
        }
		
	}

}
