package com;

import java.util.Scanner;

public class Ejercicio12_ESJS {

	public static void main(String[] args) {
////		// Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
////				[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
////				
//		
//		Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben 
////				ser introducidos por teclado por el usuario.
		
		Scanner scanner = new Scanner(System.in);
		
		double peso;
		double altura;
		
		System.out.println("Introduce peso");
		peso = scanner.nextDouble();
		System.out.println("Introduce altura en metros");
		altura = scanner.nextDouble();
		
		double IMC = (peso/(altura*altura));
		
		    if(IMC < 16){
			System.out.println("Tu IMC es de: " + IMC + " criterio de ingreso a hospital");
			}else if(IMC<17)
			{
				System.out.println("Tu IMC es de: " + IMC + " y estas en Infrapeso");
			} 
			else if(peso<18)
		    {
		        System.out.println("Tu IMC es de: " + IMC + " y estas bajo de peso");
		    }
		    else if(peso<=25)
		    {
		        System.out.println("Tu IMC es de: " + IMC + " y estas en peso normal");
		    }
		    else if(peso<30)
		    {
		        System.out.println("Tu IMC es de: " + IMC + " y estas en sobrepeso (obesidad grado 1)");
		    }
		    else if(peso<35)
		    {
		        System.out.println("Tu IMC es de: " + IMC + " y estas en sobrepeso crónico(obesidad grado 2)");
		    }
		    else if(peso<40)
		    {
		        System.out.println("Tu IMC es de: " + IMC + " y estas en obesidad premórbida(obesidad grado 3)");
		    }
		    else
		    {
		        System.out.println("Tu IMC es de: " + IMC + " y estas en obesidad mórbida (obesidad grado 4)");
		    }

	}

}
