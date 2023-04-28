package com;

import java.util.Scanner;

public class CetecEje1 {

	public static void main(String[] args) {
 
		Scanner numero = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int num1 = numero.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = numero.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println(num1 + " y " + num2 + " son iguales");
        }
	}

}





