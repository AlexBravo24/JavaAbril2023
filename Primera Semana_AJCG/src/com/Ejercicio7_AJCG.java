package com;

import java.util.Scanner;

public class Ejercicio7_AJCG {

	public static void main(String[] args) {
		Scanner lector= new Scanner (System.in);
		int alumnos;
		int precio1=65;
		int precio2=70;
		int precio3=95;
		int precio4=4000;
		System.out.println("Ingrese el número de alumnos: ");
		alumnos=lector.nextInt();
		lector.close();
		if (alumnos>=100) {
			int resultado1=alumnos*precio1;
			System.out.println("El precio es " + resultado1 + " euros" );
		} else if (alumnos>49 && alumnos<100) {
			int resultado2=alumnos*precio2;
			System.out.println("El precio es " + resultado2 + " euros");
		} else if (alumnos>29 && alumnos<50) {
			int resultado3=alumnos*precio3;
			System.out.println("El precio es " + resultado3 + " euros");
		} else if (alumnos<30 && alumnos>0) {
			System.out.println("El precio es " + precio4 + " euros");
		}

	}//FIN DE MAIN

}//FIN DE CODIGO
