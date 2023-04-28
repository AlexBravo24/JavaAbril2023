package com;

import java.util.Scanner;

public class Ciclos12_DCC {

	public static void main(String[] args) {
		// .Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
		//  cuando el promedio de las edades sea superior a 25.
		
		double edad;
		double promedio = 0.0;
		int contador = 0;
		double suma = 0;
		int i = 0;
		boolean check = true;
		
		Scanner lector = new Scanner(System.in);
		
		/*for(int i = 0; i <= 5; i++ ) {
			System.out.println("Ingrese una edad - ciclo" + i);
			edad = lector.nextInt();
			suma += edad;
			promedio = suma/i;  
			//contador = i;
			//System.out.println(promedio);
			if(promedio >= 25.0) {
				break;
			}
		}*/
		
		while(check) {
			System.out.println("Ingrese una edad - ciclo " + i);
			edad = lector.nextInt();
			i++;
			suma += edad;
			promedio = suma/i;
			if(promedio >= 25.0) {
				System.out.println("El promedio es: " + promedio);
				check = false;
			}
		}

	}

}
