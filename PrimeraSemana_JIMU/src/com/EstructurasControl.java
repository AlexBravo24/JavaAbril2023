package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		//ESTRUCTURAS DE DECISIÓN IF-valores boolrsnod
		
		/*int x = 9;
		
		if (x<10) {
			System.out.println("Sí es menor");
		}else {
			System.out.println("Es mayor");
		}
		*/
		
		//Seleccionando varias líneas y presionando 
		//CTRl + 7 se comentan esas líneas seleccionadas
		
		String nombre = "Montero";
		//System.out.println(nombre.length());
		
	
		
		//La función .length devuelve en valor númerico una longitud
		// de dato String o de otro dato que no recuerdo
		
//		if (nombre.length() < 3) {
//			System.out.println("si es menor");
//		}else {
//			System.out.println("Es mayor");
//		}
		
		//Condiciones compuestas con
		//operadores lógicos AND, OR, NOT y
		// Diferente de, Igualdad
		
		//AND - && - Devuelve un valor True cuando cumpla
		//todas las condiciones
		
//		if (nombre.length() < 8 && nombre.length()>4) {
//			System.out.println("si es menor");
//		}else {
//			System.out.println("Es mayor");
//		}
		
		//OR - || - Devuelve un valor true cuando se cumple al 
		//menos una condición
		
//		if (nombre.length() < 6 || nombre.length()>15) {
//			System.out.println("si es menor");
//		}else {
//			System.out.println("Es mayor");
//		}
		
		//NOT - ! - Negamos una condición o cambiar el valor
		//del true en false o viceversa según convenga
//		
//		if (!(nombre.length() < 9)) {
//			System.out.println("si");
//		}else {
//			System.out.println("No");
//		}
		
		//DIFERENTE DE - != - Compara valores y si es diferente
		//manda valor true
		
//		int x =10;
//		if (x != 9) {
//			System.out.println("si");
//		}else {
//			System.out.println("No");
//		}
		
		//IGUALDAD - == - Compara el valor y si este es igual true
		
//		int x =10;
//		if (x == 9) {
//			System.out.println("No iguales");
//		}else {
//			System.out.println("Iguales");
//		}
		
		//Estructura if-else concatenado o if-else anidado
		
		//Anidamos varias condiciones a evaluar
		
//		int d=5;
//		
//		if (d==1) {
//			System.out.println ("Lunes");
//			
//		}else if (d==2) {
//			System.out.println ("Martes");
//
//				}else if (d==3) {
//					System.out.println ("Miercoles");
//				
//
//				}else {
//					System.out.println ("Desconocido");

				//}
		//EStructura de decisión SWITCH-CASE
		//Puede ser con tipos de datos char, string, int, etc.
		
		int dia=9;
		switch (dia) {
		case 1: 
			System.out.println("Lunes");
			break;
		case 2: 
			System.out.println("Martes");
			break;
		case 3: 
			System.out.println("Miércoles");
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
		
		
	}//cierre del main

} //cierre de la clase
