package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
     //Estructuras de decisión IF= Valore booleanos
	int x = 12;
	
//	if (x<10) { //Condición que establece que si se cumple se 
//		//realice lo siguiente
//		System.out.println("Si es menor");
//	}else {
//		System.out.println("Si es mayor");
//}
		
		String nombre = "Victor";
		
		//System.out.println(nombre.length());
//		if (nombre.length()<8) {
//			System.out.println("si es menor");
//		}
//	else {
//		System.out.println("Es mayor");
//		
		//Condiciones compuestas, operadores logicos AND, OR, NOT
		//DIFERENTE DE, IGUALDAD
		
		//AND - && - devuelve un valor true cuando se cumpla
//		if (nombre.length()<11 && nombre.length()<9) {
//			System.out.println("si");
//		}
//	else {
//		System.out.println("no");
		
		//OR - ||- Develve un valor true cuando se cumple
		//una condición 
		
//		if (nombre.length()<11 || nombre.length()<10) {
//			System.out.println("si");
//		}
//	else {
//		System.out.println("no");
//		
		//NOT - Negamos una condición/cambiar el valor de true a false
		
//		if(!(nombre.length()<11)) {
//			System.out.println("si");
//		}
//	else {
//		System.out.println("no");
		
		//DIFERENTE DE - != - comparar valores y si es 
		//diferente manda un valor true
		
//		if(x != 10) {
//			System.out.println("si");
//		}
//	else {
//		System.out.println("no");
		
		//IGUALDAD - == - Compara el valor y si este es =
		//manda true
		
//		if(x == 10) {
//			System.out.println("si");
//		}
//	else {
//		System.out.println("no");		
//	}	
		//Estructura if else concatenado o if else anidado
		//evaluacion de varias condiciones anidadas
		
//		int d=7;
//		
//		if (d==1) {
//			System.out.println("Lunes");
//		}else if (d==2) {
//			System.out.println("martes");
//		}else if (d==3) {
//			System.out.println("miercoles");
//		}else if (d==4) {
//			System.out.println("jueves");
//		}else if (d==5) {
//			System.out.println("viernes");
//		}else if {
//			System.out.println("desconocido");
//		}
//		
		//Estructura de desición SWITCH-CASE
		//puede ser con tipos de datos  char, string, int
		
		int dia = 6;
		switch(dia) {
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
			System.out.println("desconocido");
			break;	
			
		}
		
	}//cierre del main
		
	}//cierre de la clase
	

