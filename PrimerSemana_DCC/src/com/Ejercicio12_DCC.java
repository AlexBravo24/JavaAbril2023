package com;

import java.util.Scanner;

public class Ejercicio12_DCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double peso;
		double estatura;
		double imc;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce tu peso");
		peso = lector.nextDouble();
		System.out.println("Introduce tu estatura");
		estatura = lector.nextDouble();
		
		imc = peso / (estatura * estatura);
		
		
		if(imc < 16) {
			System.out.println("Tu IMC es: " + imc);
			System.out.println("Criterio de riesgo, ingreso al hospital");
		} else if(imc < 17 && imc >= 16) {
			System.out.println("Tu IMC es: " + imc);
			System.out.println("infrapeso");
		} else if(imc < 18 && imc >= 17) {
			System.out.println("Tu IMC es: " + imc);
			System.out.println("bajo peso");
		} else if(imc >= 18 && imc < 25) {
			System.out.println("Tu IMC es: " + imc);
			System.out.println("peso normal");
		} else if(imc >= 25 && imc < 30) {
			System.out.println("Tu IMC es: " + imc);
			System.out.println("sobrepeso - obesidad grado 1");
		} else if(imc >= 30 && imc < 35) {
			System.out.println("Tu IMC es: " + imc);
			System.out.println("sobrepeso cronico - obesidad grado 2");
		} else if(imc >= 35 && imc < 40) {
			System.out.println("Tu IMC es: " + imc);
			System.out.println("obesidad premorbida - obesidad grado 3");
		} else {
			System.out.println("Tu IMC es: " + imc);
			System.out.println("obesida morbida - obesidad grado 4");
		}

	}

}
