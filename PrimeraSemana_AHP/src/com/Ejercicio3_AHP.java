package com;

import java.util.Scanner;

public class Ejercicio3_AHP {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n.
		// Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
		double alfa;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un n�mero para Alfa:");
		alfa = input.nextDouble();
		
		double bravo;
        System.out.print("Introduce un n�mero para Bravo:");
        bravo= input.nextDouble();
        
        
        input.close();

        if(bravo == 0) {
        	System.out.println("Error! la divisi�n entre 0 no es posible");
        }else {
        	double result = alfa/bravo;
        	System.out.println("Alfa/Bravo = "+result);
        }
     
    }
	}

