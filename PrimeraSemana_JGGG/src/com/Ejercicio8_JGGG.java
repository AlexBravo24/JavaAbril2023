package com;

import java.util.Scanner;

public class Ejercicio8_JGGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* 8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
			seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado 
			obtenido.
			Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
			Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje: 
			�ERROR: n�mero incorrecto�.
		 */
		int resultado=0;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("dame el resultado de tu dado en numero");
		resultado=entrada.nextInt();
		switch (resultado) {
		case 1:
			System.out.println("el opuesto de UNO es SEIS");
			break;
		case 2:
			System.out.println("el opuesto de DOS es CINCO");
			break;
		case 3:
			System.out.println("El opuesto de TRES es CUATRO");
			break;
		case 4:
			System.out.println("el opuesto de CUATRO es TRES");
			break;
		case 5:
			System.out.println("el opuesto de CINCO es DOS");
			break;
		case 6:
			System.out.println("el opuesto de SEIS es UNO");
			break;
		default:
			System.out.println("�ERROR: n�mero incorrecto�");
		}

	}

}
