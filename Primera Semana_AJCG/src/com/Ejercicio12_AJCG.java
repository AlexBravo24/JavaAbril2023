package com;

import java.util.Scanner;

public class Ejercicio12_AJCG {

	public static void main(String[] args) {
		System.out.println("Introduce tu peso:");
		Scanner lector= new Scanner(System.in);
		int peso;
		peso=lector.nextInt();
		System.out.println("Introduce tu altura: ");
		Scanner lector2= new Scanner (System.in);
		double altura;
		altura=lector2.nextDouble();
		double resultado= peso/Math.pow(altura, 2);
		if (resultado<16) {
			System.out.println("Criterio de ingreso a Hospital");
		} else if (resultado>16 && resultado<17) {
			System.out.println("Infrapeso");
		} else if (resultado==16) {
			System.out.println("Infrapeso");
		} else if (resultado>17 && resultado<18) {
			System.out.println("Bajo peso");
		} else if (resultado==17) { 
			System.out.println("Bajo peso");
		} 		else if (resultado>18 && resultado<25) {
			System.out.println("Peso normal (saludable)");
		} else if (resultado==18) {
			System.out.println("Peso normal (saludable)");
		} else if (resultado>25 && resultado<30) {
			System.out.println("Sobrepeso (obesidad de grado I)");
		} else if (resultado==25) {
			System.out.println("Sobrepeso (Obesidad de grado I)");
		} else if (resultado>30 && resultado<35) {
			System.out.println("Sobrepeso cronico (obesidad de grado II)");
		} else if (resultado==30) {
			System.out.println("Sobrepeso cronico (Obesidad de grado II)");
		} else if (resultado>35 && resultado<40) {
			System.out.println("Obesidad premorbida (obesidad de grado III)");
		} else if (resultado==35) {
			System.out.println("Obesidad premorbida (Obesidad de grado III)");
		} else if (resultado>40 || resultado==40) {
			System.out.println("Obesidad morbida (obesidad de grado IV)");
		}

			


	}

}
