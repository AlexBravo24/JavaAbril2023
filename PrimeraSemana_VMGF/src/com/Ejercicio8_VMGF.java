package com;

import java.util.Scanner;

public class Ejercicio8_VMGF {

	public static void main(String[] args) {
		// DADO
		
int cara;
		
		Scanner c=new Scanner(System.in);
		
		System.out.println("Ingresa el resultado del dado: ");
		cara = c.nextInt();
		
		if (cara==1) {
			System.out.println("La cara opuesta de 1 es: SEIS");
	
		} else	if (cara==2) {
				System.out.println("La cara opuesta de 2 es: 5");
		} else	if (cara==3) {
				System.out.println("La cara opuesta de 3 es: 4");				
		} else	if (cara==6) {
			    System.out.println("La cara opuesta de 6 es: 1");
		} else	if (cara==5) {
			    System.out.println("La cara opuesta de 5 es: 2");
		} else	if (cara==4) {
			    System.out.println("La cara opuesta de 4 es: 3");
	} else	
		System.out.println("entrada invalida");
	}
}
