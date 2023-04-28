package com;

import java.util.Scanner;

public class Ejercicio3_AHP {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división.
		// Si el segundo número es 0, debe mostrar un mensaje de error.
		
		double alfa;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un número para Alfa:");
		alfa = input.nextDouble();
		
		double bravo;
        System.out.print("Introduce un número para Bravo:");
        bravo= input.nextDouble();
        
        
        input.close();

        if(bravo == 0) {
        	System.out.println("Error! la división entre 0 no es posible");
        }else {
        	double result = alfa/bravo;
        	System.out.println("Alfa/Bravo = "+result);
        }
     
    }
	}

