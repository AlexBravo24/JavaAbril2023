package com;

import java.util.Scanner;

public class Arrays1_EHAG {

	public static void main(String[] args) {
		int[] numeros = new int[10];
        Scanner valor= new Scanner(System.in);

        // Pedimos al usuario que ingrese los n�meros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el n�mero para la posici�n " + i + ": ");
            numeros[i] = valor.nextInt();
        }

        // Mostramos por consola el �ndice y el valor correspondiente
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("En la posici�n " + i + " se encuentra el valor " + numeros[i]);
        }

	}

}
