package com;

import java.util.Scanner;

public class Ejercicio5_AJCG {

	public static void main(String[] args) {
		Scanner lector= new Scanner (System.in);
		Scanner lector2= new Scanner (System.in);
		Scanner lector3= new Scanner (System.in);
		int nota;
		int edad;
		int sexo;
		System.out.println("Ingresa los datos correspondientes");
		System.out.println("Nota: ");
		nota=lector.nextInt();
		System.out.println("Edad: ");
		edad=lector2.nextInt();
		System.out.println("Sexo: ");
		System.out.println("1=M y 2=F");
		sexo= lector3.nextInt();
		lector.close();
		lector2.close();
		lector3.close();
		if (nota>5 && edad>17 && sexo==1) {
			System.out.println("Posible");
		} else if (nota>5 && edad>17 && sexo==2) {
			System.out.println("Aceptada");
		} else if (nota<5 || edad<18) {
			System.out.println("No aceptada");
		} else if (sexo!=1 && sexo!=2) {
			System.out.println("No aceptada");
		}
	}//FIN MAIN

}//FIN CODIGO
