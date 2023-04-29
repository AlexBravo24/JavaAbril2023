package com;

import java.util.Scanner;

public class Ejercicio12_VMGF {

	public static void main(String[] args) {
		// IMC
		

		double peso, altura, resultado;
	
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Ingresa tu peso");
		peso=sc.nextLine().charAt(0);
		
		System.out.println("Ingresa tu altura");
		altura=sc.nextLine().charAt(0);
		
		
		resultado = (peso/(altura*2));
		
		if (resultado<=16) {
			System.out.println("ingreso en el hospital");
	    } else	if  ((resultado>=16)&&(resultado<=17))  {
				System.out.println(" infrapeso");
		} else	if  ((resultado>=17)&&(resultado<=18))  {
			    System.out.println(" bajo peso");
		} else	if  ((resultado>=18)&&(resultado<=25))  {
			System.out.println(" peso normal (saludable)");
		} else	if  ((resultado>=25)&&(resultado<=30))  {
			System.out.println(" sobrepeso (obesidad grado 1)");
		} else	if  ((resultado>=30)&&(resultado<=35))  {
			System.out.println(" sobrepeso cronico (obesidad grado 2)");
		} else	if  ((resultado>=35)&&(resultado<=40))  {
			System.out.println(" obesidad premorbida (obesidad grado 3");
		} else	if  (resultado>40)  {
			System.out.println(" obesidad morbida (grado 4)");


	}// else	
		//System.out.println("entrada invalida");
		
		
		

	}

}
