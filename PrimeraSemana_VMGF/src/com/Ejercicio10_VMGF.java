package com;

import java.util.Scanner;

public class Ejercicio10_VMGF {

	public static void main(String[] args) {
		// mes y dias 
		
int mes;
		
		Scanner c=new Scanner(System.in);
		
		System.out.println("Ingresa un n�mero ");
		mes = c.nextInt();
		
		if (mes==1) {
			System.out.println("Enero 31 d�as");
	
		} else	if (mes==2) {
				System.out.println(" Febrero 28 D�as");
		} else	if (mes==3) {
				System.out.println(" Marzo 31 D�as");				
		} else	if (mes==4) {
			    System.out.println(" Abril 30 D�as");
		} else	if (mes==5) {
			    System.out.println(" Mayo 31 D�as");
		} else	if (mes==6) {
			    System.out.println(" Junio 30 D�as");
		} else  if (mes==7) {
			    System.out.println(" Julio 31 D�as");
		} else  if (mes==8) {
		        System.out.println(" Agosto 31 D�as");	  
		} else  if (mes==9) {
		        System.out.println(" Septiembre 30 D�as");
		} else  if (mes==10) {
		        System.out.println(" Octubre 31 D�as");
		} else  if (mes==11) {
		        System.out.println(" Noviembre 30 Dias");
		} else  if (mes==12) {
		        System.out.println(" Diciembre 31 D�as");
	} else	
		System.out.println("entrada invalida");
		
	}

}
