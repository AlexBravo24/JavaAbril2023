package com;

import java.util.Scanner;

public class Ejercicio10_AHP {

	public static void main(String[] args) {
		/*10.Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el 
		mes correspondiente.
*/
		
		
		int mes;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el n�mero del mes (1-12): ");
		mes = input.nextInt();
		
		input.close();
       
        switch (mes) {
        case 1:
            System.out.println("El mes de Enero tiene 31 d�as");
            break;
        case 2:
            System.out.println("El mes de Febrero tiene 28 � 29 d�as");
            break;
        case 3:
            System.out.println("El mes de Marzo tiene 31 d�as");
            break;
        case 4:
            System.out.println("El mes de Abril tiene 30 d�as");
            break;
        case 5:
            System.out.println("El mes de Mayo tiene 31 d�as");
            break;
        case 6:
            System.out.println("El mes de Junio tiene 30 d�as");
            break;
        case 7:
            System.out.println("El mes de Julio tiene 31 d�as");
            break;
        case 8:
            System.out.println("El mes de Agosto tiene 31 d�as");
            break;
        case 9:
            System.out.println("El mes de Septiembre tiene 30 d�as");
            break;
        case 10:
            System.out.println("El mes de Octubre tiene 31 d�as");
            break;
        case 11:
            System.out.println("El mes de Noviembre tiene 30 d�as");
            break;
        case 12:
            System.out.println("El mes de Diciembre tiene 31 d�as");
            break;
         default:
        	 System.out.println("Error!, Introduce un valor (1-12)");
        }
		
		
	}

}
