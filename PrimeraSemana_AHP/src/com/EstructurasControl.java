package com;

public class EstructurasControl {

	public static void main(String[] args) {

		// Estructuras de decisi�n IF - valores booleanos

		int x = 9;
//		if (x < 10) { // Condici[on en la que establezco que si se cumple se realice lo siguiente
//			System.out.println("S�, es menor");
//		} else {
//			System.out.println("No, Es mayor");
//
//		}
		String nombre = "Adrian";
		String apellidoP = "Hidalgo";
		String apellidoM = "Paz";
		System.out.println("Los caracteres en mi nombre son: " + nombre.length());
		System.out.println(nombre.length() + apellidoP.length() + apellidoM.length());

		// La suma de caracteres de mi nombre completo

		if (nombre.length() < 8 && nombre.length() > 5) {
			System.out.println("S�, menor");
		} else {
			System.out.println("No, es mayor");
}

		// Condiciones compuestas con operadores l�gicos
		// OR, NOT, DIFERENTE DE, IGUALDAD

		// AND - && - Devuelve un valor true cuando
		// se cumplen todas las condiciones

		if (nombre.length() < 8 && nombre.length() > 5) {
			System.out.println("S�, se cumplen ambas");
		} else {
			System.out.println("No, no se cumplen ambos");
}

		// OR - || - Devuelve un valor true cuando sea al menos una condici�n

		if (nombre.length() < 5 || nombre.length() > 8) {
			System.out.println("S�, uno es cierto");
		} else {
			System.out.println("No, nunguno es cierto");
}

		// NOT - ! - Negamos una condici�n/Cambiar el valor de True a False o viceversa

		if (!(nombre.length() < 5)) {
			System.out.println("S�, es falso");
		} else {
			System.out.println("No, es verdadero");
}

		// DIFFERENTE DE - != - Comparar valores, y si es diferente manda un valor TRUE

		if (x != 5) {
			System.out.println("S�, es diferente");
		} else {
			System.out.println("No, es igual");
}

		//IGUALDAD - == - Compara el valor y si este es igual devuelve un valor de TRUE
		
		if (x == 9) {
			System.out.println("S�, es igual");
		} else {
			System.out.println("No, es diferente");
}
		
		//Estructura if-else concatenado o if else anidado
		//Se refiere a que podeos hacer que se cumplan varias o evaluar varias
		//Anidamos varias condiciones a evaluar
		
		int d = 2;
		
		if (d == 1) {
			System.out.println("Lunes");
		}else if (d == 2) {
			System.out.println("Martes");
		}else if (d == 3) {
			System.out.println("Mi�rcoles");
		}else if (d == 4) {	
			System.out.println("Jueves");
		}else if (d == 5) {		
			System.out.println("Viernes");
		}else {
			System.out.println("Desconocido");
}	
			
			//Estructura de decisi�n SWICH-CASE
			//Puede ser con tipos de dato char, string, int, etc.
			
			int dia = 3;
			switch (dia) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Mi�rcoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			default:
					System.out.println("Desconocido");
}
			
		
			
			
	}
	}
