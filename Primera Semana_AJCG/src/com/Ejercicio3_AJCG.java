package com;

import java.util.Scanner;

public class Ejercicio3_AJCG {

	public static void main(String[] args) {
		Scanner lector= new Scanner (System.in);
		double numerador;
		System.out.println("Ingresa el númerador ");
		numerador= lector.nextInt();
		Scanner lector2= new Scanner (System.in); 
		double denominador;
		System.out.println("Ingresa el denominador ");
		denominador=lector2.nextDouble();
		if (denominador==0) {
			System.out.println("Eror");
		} else { 
			double resultado= numerador/denominador;
			System.out.println("El resultado es " + resultado);
		}
	
	}//FIN DE SPRING

}//FIN CODIGO
