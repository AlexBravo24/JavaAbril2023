package com;

public class EstructurasControl {

	public static void main(String[] args) {

		// Estructuras de decisión IF - valores booleanos

		int x = 12;
//
//		if (x < 10) { // condición en el que establezco si se cumple
//			// se realice lo siguiente
//			System.out.println("Sí es menor");
//		} else {
//			System.out.println("Es mayor");
//		}

		String nombre = "Alvarocsf";

		// System.out.println(nombre.length());

		// La función .length devuelve el valor entero
		// del String en este caso

//		if (nombre.length()<10) {
//			System.out.println("Si es menor");
//		}else {
//			System.out.println("Es mayor");
//		}

		// Condiciones compuestas con operadores lógicos AND,
		// OR, NOT, DIFEREBTE DE, IGUALDAD

		// AND -&& - Devulve un valor true cuando
		// se cumplan todas las condiciones

//		if (nombre.length()<10 && nombre.length()>5) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}

		// OR - || - Devuelve un valor true cuando se cumple
		// al menos una condición

//		if (nombre.length()<4 || nombre.length()>7) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}

		// NOT - ! - Negamos una condición/Cambiar el valor
		// de true a false y vicebersa

//		if (!(nombre.length()<11)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}

		// DIFERENTE DE - != - Comparar valores, y si es diferente
		// manda un valor true

//		if (x != 13) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}

		// IGUALDAD - == - Compara el valor y si este es igual manda True

//		if (x == 11)
//
//		{
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}

		//Estructura if-else concatenado o if-else anidado
		
		//Anidamos varias condiciones a evaluar 
		
//		int d=7;
//		
//		if (d==1) {
//			System.out.println("Lunes");
//		}else if(d==2) {
//			System.out.println("Martes");
//		}else if(d==3) {
//			System.out.println("Miercoles");
//		}else if(d==4) {
//			System.out.println("Jueves");			
//		}else if(d==5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Desconocido");
//		}
		
		//Estructura de decisión SWITCH-CASE
		//Puede ser con tipos de dato char, String, int, etc
		
		int dia = 1; 
		
		switch (dia) {
		
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
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
		
	} // cierre del main

}// cierre de clase
