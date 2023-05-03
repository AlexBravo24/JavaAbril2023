package com;

import java.util.Scanner;

public class Ejercicio1_ESJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales
		 Scanner lector = new Scanner(System.in);
		 int numero1;
		 int numero2;
		 
		    System.out.print("Introduce el primer número: ");
		    numero1 = lector.nextInt();
		    System.out.print("Introduce el segundo número: ");
		    numero2 = lector.nextInt();
		    lector.close();
	        
		    if (numero1 > numero2){
		        System.out.println("El primer número, " +numero1 + ", es mayor que el número dos," +numero2);
		    }else if (numero1 < numero2){
		        System.out.println("El segundo número, " +numero2 + ", es mayor que el primer número " +numero1);
		    }else {
		        System.out.println("Ambos números son iguales, " +numero1);
		    }
	        

	}

}
