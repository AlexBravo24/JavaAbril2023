package com;

import java.util.Scanner;

public class Ejercicio3_ESJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error.
		Scanner lector = new Scanner(System.in);
		 double num1;
		 double num2;
		 
		 
		    System.out.print("Introduce el primer número: ");
		    num1 = lector.nextDouble();
		    System.out.print("Introduce el segundo número: ");
		    num2 = lector.nextDouble();
		    lector.close();
		    
		    double resultado = num1/num2;
	        
		    if (num2==0){
		        System.out.println("Error");
		    }else{
		        System.out.println("El resultado es: " +resultado);
		    }

	}

}
