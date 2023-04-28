package com;

import java.util.Scanner;

public class Ejercicio3_MVNO {
	public static void main(String[] args) {
		/*Crea un programa que pida al usuario dos números y muestre el resultado de su división.
		 *  Si el segundo número es 0, debe mostrar un mensaje de error.*/
	Scanner leer=new Scanner(System.in);
		
		
		System.out.println("ingresa un numero");
	    int num=leer.nextInt();
	    System.out.println("ingresa otro numero:");
	    int num1=leer.nextInt();
	    
	    if(num > 0) {
	    	int Di=num/num1;
	    	System.out.println("El resultado de su division es " + Di);
	    	}
	    if(num1 == 0 ) {
	    	System.out.println("Error de division ");
	    }
	}
}
