package com;

import java.util.Scanner;

public class Ejercicio12_ACS {

	public static void main(String[] args) {

		//construir un programa que calcule el índice de masa 
		//corporal de una persona (IMC = peso [kg] / altura2 
		//[m]) e indique el estado en el que se encuentra esa 
		//persona en función del valor de IMC 
		Scanner sc = new Scanner(System.in);
		
		double imc;
		double peso;
		double altura;
		
		
		System.out.println("Ingrese peso (kg): ");
		peso = sc.nextDouble();
		sc.nextLine();
		System.out.println("Ingrese altura (m): ");
		altura = sc.nextFloat();
		
		imc = peso / (altura = Math.pow(altura, 2));
		System.out.println(imc);
		
		if (imc<16) {
			System.out.println("criterio de ingreso en hospital");
		}
		else if(imc>=16 && imc<=17){
			System.out.println("infrapeso");
		}
		else if(imc>17 && imc<=1){
			System.out.println("bajo peso");
		}
		else if(imc> 18 && imc<=25){
			System.out.println("peso normal (saludable)");
		}
		else if(imc> 25 && imc<=30 ){
			System.out.println("sobrepeso (obesidad de grado i)");
		}
		else if(imc> 30 && imc<=35 ){
			System.out.println("sobrepeso cronico (obesidad de grado ii)");
		}
		else if(imc> 35 && imc<=40 ){
			System.out.println("obesidad premorbida(obesidad de grado iii)");
		}
		else if(imc> 40){
			System.out.println("obesidad morbida (obesidad de grado iv)");
		}

	}

}
