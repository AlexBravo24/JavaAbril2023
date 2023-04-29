package com;

import java.util.Scanner;

public class Ejercicio9_VMGF {

	public static void main(String[] args) {
		// Realiza un programa que pida el día de la semana (del 1 al 7) 
		//y escriba el día correspondiente.
		
int dia;
		
		Scanner c=new Scanner(System.in);
		
		System.out.println("Ingresa un número ");
		dia = c.nextInt();
		
		if (dia==1) {
			System.out.println("Día lunes");
	
		} else	if (dia==2) {
				System.out.println("Día martes");
		} else	if (dia==3) {
				System.out.println("Día miercoles");				
		} else	if (dia==4) {
			    System.out.println("Día jueves");
		} else	if (dia==5) {
			    System.out.println("Día viernes");
		} else	if (dia==6) {
			    System.out.println("Día sabado");
		} else  if (dia==7) {
			    System.out.println("Día domingo");
	} else	
		System.out.println("entrada invalida");
		

	}

}
