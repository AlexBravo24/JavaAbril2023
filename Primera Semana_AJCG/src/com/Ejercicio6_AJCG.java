package com;

import java.util.Scanner;

public class Ejercicio6_AJCG {

	public static void main(String[] args) {
		Scanner lector= new Scanner (System.in);
		String letra;
		char[] letra2;
		double tamaño;
		double precio;
		double kilos;
		System.out.println("Introduce el tipo de uva:");
		letra=lector.nextLine();
		letra=letra.toLowerCase();
		letra2=letra.toCharArray();
		System.out.println("Introduce el tamaño:");
		tamaño=lector.nextDouble();
		System.out.println("Introduce el precio inical:");
		precio=lector.nextDouble();
		System.out.println("Introduce los kilos:");
		kilos=lector.nextDouble();	
		lector.close();
		char tipo1='a';
		char tipo2='b';
		
		if (letra2[0]==tipo1 && tamaño==1) {
			double resultado= (20+precio)*kilos;
			System.out.println("El total es igual a $"+resultado);
		} else if (letra2[0]==tipo1 && tamaño==2) {
			double resultado= (30+precio)*kilos;
			System.out.println("El total es igual a $"+resultado);
		} else if (letra2[0]==tipo2 && tamaño==1) {
			double resultado= (precio-30)*kilos;
			System.out.println("El total es igual a $"+resultado);
		} else if (letra2[0]==tipo2 && tamaño==2) {
			double resultado= (precio-50)*kilos;
			System.out.println("El total es igual a $"+resultado);
		}
		
      //NO SE COMO DEFINIR LAS LETRAS PARA PODER OCUPARLAS EN EL CODIGO
	}//FIN DE MAIN

}//FIN DE CODIGO
