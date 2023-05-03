package com;

import java.util.Scanner;

public class Ejercicio2_ESJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza un programa que pida un número por teclado y nos indique si es par o impar.

		Scanner lector = new Scanner(System.in);
		 int numero1;
		 
		    System.out.print("Introduce un número: ");
		    numero1 = lector.nextInt();
		    lector.close();
	        
		    if (numero1 % 2 ==0) {
		        System.out.println("El número: " + numero1 +", es par.");
		    }else {
		        System.out.println("El numero es: " + numero1 +  " es impar.");
		    
		    }
		
		
	}

}
