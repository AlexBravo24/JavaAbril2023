package com;

import java.util.Scanner;

public class Ejercicio1_ESJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales
		 Scanner lector = new Scanner(System.in);
		 int numero1;
		 int numero2;
		 
		    System.out.print("Introduce el primer n�mero: ");
		    numero1 = lector.nextInt();
		    System.out.print("Introduce el segundo n�mero: ");
		    numero2 = lector.nextInt();
		    lector.close();
	        
		    if (numero1 > numero2){
		        System.out.println("El primer n�mero, " +numero1 + ", es mayor que el n�mero dos," +numero2);
		    }else if (numero1 < numero2){
		        System.out.println("El segundo n�mero, " +numero2 + ", es mayor que el primer n�mero " +numero1);
		    }else {
		        System.out.println("Ambos n�meros son iguales, " +numero1);
		    }
	        

	}

}
