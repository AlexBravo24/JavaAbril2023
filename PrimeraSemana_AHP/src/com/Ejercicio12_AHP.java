package com;

import java.util.Scanner;

public class Ejercicio12_AHP {
	

	public static void main(String[] args) {
		/*12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
				[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
*/
		
		
		double peso;
		Scanner Input = new Scanner(System.in);
		System.out.println("Introduce el peso en kg: ");
		peso = Input.nextDouble();
		
		double estatura;
		System.out.println("Introduce la altura en m: ");
		estatura = Input.nextDouble();
		
		Input.close();
		
		double IMC = (peso/(2*estatura)) ;
	
		if (IMC<16) {
			System.out.println("Es importante acuda a un médico o al hospital inmediatamente " + IMC);
		}	else if (IMC<=17 && IMC>=16) {
			System.out.println("Infrapeso");
	
		}else if (IMC<= 18 && IMC>17) {
			System.out.println("bajo peso"+ IMC);
		}else if (IMC<= 25 && IMC>18) {
			System.out.println("Peso normal (saludable)"+ IMC);
		}else if (IMC<= 30 && IMC>25) {
			System.out.println("Sobrepeso (Obesidad de grado 1)"+ IMC);
		}else if (IMC<= 35 && IMC>30) {
			System.out.println("Sobrepeso crónico (Obesidad de grado 2)" + IMC);
		} else if (IMC<= 40 && IMC>35) {
			System.out.println("Obesidad premórbida (Obesidad de grado 3)" + IMC);
		}else if (IMC > 40) {
			System.out.println("Obesidad mórbida (Obesidad de grado 4):" + IMC);
		} else {
			System.out.println("Error!");
			
			
			
	}
}
}

