package com;

import java.util.Scanner;

public class CeteqEje12_EHAG {

	public static void main(String[] args) {
	

		 Scanner tabla = new Scanner(System.in);

// Pedir los datos de la persona
System.out.print("Introduce tu peso en kilogramos: ");
double peso = tabla.nextDouble();
System.out.print("Introduce tu altura en metros: ");
double altura = tabla.nextDouble();

// Calcular el índice de masa corporal
double imc = peso / (altura * altura);

// Mostrar el estado de la persona
System.out.printf("Tu IMC es %.2f\n", imc);
	if (imc < 16) {
    System.out.println("Su estado es:Criterio de ingreso en el hospital");
	}
	else if (imc >= 16 && imc < 17 ) {
    System.out.println("Su estado es:Infrapeso");
	}
	else if (imc >= 17 && imc < 18) {
    System.out.println("Bajo peso");
    } 
	else if (imc >= 18.0 && imc < 25.0) {
      System.out.println("Su estado es:Peso normal(saludable)");
    }
	else if (imc >= 25 && imc < 30) {
	      System.out.println("Su estado es:Sobrepeso(obesidad de grado I");
    }
	else if (imc >= 30 && imc < 35) {
	      System.out.println("Su estado es:Sobrepeso crónico(obesidad de grado II");
    }
	else if (imc >= 35 && imc < 40) {
	      System.out.println("Su estado es:Obesidad premórbida(obesidad de grado III");
    }
	else if (imc > 35) {
	    System.out.println("Su estado es:Obesidad mórbida(obesidad de grado IV");
	}
	}
	}




	
