package com;

import java.util.Scanner;

public class Ejercicio9_VMGF {

	public static void main(String[] args) {
		// Realiza un programa que pida el d�a de la semana (del 1 al 7) 
		//y escriba el d�a correspondiente.
		
int dia;
		
		Scanner c=new Scanner(System.in);
		
		System.out.println("Ingresa un n�mero ");
		dia = c.nextInt();
		
		if (dia==1) {
			System.out.println("D�a lunes");
	
		} else	if (dia==2) {
				System.out.println("D�a martes");
		} else	if (dia==3) {
				System.out.println("D�a miercoles");				
		} else	if (dia==4) {
			    System.out.println("D�a jueves");
		} else	if (dia==5) {
			    System.out.println("D�a viernes");
		} else	if (dia==6) {
			    System.out.println("D�a sabado");
		} else  if (dia==7) {
			    System.out.println("D�a domingo");
	} else	
		System.out.println("entrada invalida");
		

	}

}
