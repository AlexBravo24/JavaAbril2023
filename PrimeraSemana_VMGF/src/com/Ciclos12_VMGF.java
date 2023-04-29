package com;

import java.util.Scanner;

public class Ciclos12_VMGF {

	public static void main(String[] args) {
		// edades
		
		int promedio;
		int edad;
		int contador = 0;
		int suma = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		do {
			System.out.println("Ingresa una edad");
			edad=entrada.nextInt();
			suma=suma+edad; //Sumar las edades
			contador++; //Lleva la cuenta de cuantos datos o edades hemos ingresado
			promedio=suma/contador;
			System.out.println("El promedio es " + promedio);
			if (promedio>25) {
				break;
			}
			
		}while (edad>0); //mientras la edad sea mayor a 0

		System.out.println("La suma de las edades es :" + suma + "\nLa cantidad de edades ingresadas fueron " + contador);
		System.out.println("El promedio es igual a: " + promedio);


	}

}
