package com;

import java.util.Scanner;

public class Ejercicio2_VMGF {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
		
int n1;

Scanner lec1 = new Scanner(System.in);
System.out.println("Introduce un n�mero");
n1 = lec1.nextInt();


if (n1%2==0) {
	System.out.println("El numero es par");
}
else {
	System.out.println("El n�mero es impar");
}
			
}

}
