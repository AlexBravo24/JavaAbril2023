package com;

import java.util.Scanner;

public class Ejercicio2_ciclos {

	public static void main(String[] args) {
Scanner multiplicar = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        int numero = multiplicar.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        multiplicar.close();

	}

}
