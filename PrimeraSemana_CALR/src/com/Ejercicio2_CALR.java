package com;

import java.util.Scanner;

public class Ejercicio2_CALR {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("ingresa un numero");
        int numero = Integer.parseInt(escaner.nextLine());
        
        if (numero % 2 == 0) {
        	System.out.println("el numero es par");
        } else {
        	System.out.println("el numero es impar");
        }

	}

}
