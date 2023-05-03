package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
	
		// Estructuras de decision IF - valores booleanos
		
		int x = 12;
		
//		if (x<10) {//Condicion en la que establezco que si se cumple
//			//se realice lo siguiente
//			System.out.println("Si es menor");
//			
//		}else {
//			System.out.println("Es mayor");
//		}
		
		//Ctrl + 7 se seleccionan varias lineas como comentario
		
		String nombre = "Erick";
		
		//System.out.println(nombre.length());
		
		//La funcion .length devuelve el valor entero
		//del string en este caso
		
//		if (nombre.length()<10) {
//			System.out.println("Si es menor");
//		}else {
//			System.out.println("Es mayor");
//		}
		
		//Condiciones compuestas con operadores logicos AND,
		//OR, NOT, DIFERENTE DE, IGUALDAD

		//AND - && - Devuelve un valor true cuando
		//se cumplan todas las condiciones
		
//		if (nombre.length()<10 && nombre.length()>=8) {
//			System.out.println("SI");
//		}else {
//			System.out.println("NO");
//		}
		
		
		//OR - || - Devuelve un valor true cuando se cumple
		//al menos una condicion
		
//		if (nombre.length()<10 || nombre.length()>=8) {
//			System.out.println("SI");
//		}else {
//			System.out.println("NO");
//		}
		
		//NOT - ! - Negamos un acondicion/cambiar el valor
		//de true a false y viceversa
		
//		if (!(nombre.length()<10)) {
//			System.out.println("SI");
//		}else {
//			System.out.println("NO");
//		}
		
		//DIFERENTE DE - != - COMPARAR VALORES, y si es diferente
		//manda un valor true
		
		
//		if (x != 10) {
//			System.out.println("SI");
//		}else {
//			System.out.println("NO");
//		}
		
		//IGUALDAD - == - Compara el valor y si este es igual manda True
		
//		if (x == 12) {
//			System.out.println("SI");
//		}else {
//			System.out.println("NO");
//		}
		
		//Estructura if-else concatenado o if-else anidado
		
		//Anidamos varias condiciones a evaluar 
		
//		int d=5;
//		
//		if(d==1) {
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
		
		//Estructura de decision SWITH-CASE
		// Puede ser de tipos de datoschar, strig, int , etc
		
		int dia = 3;
		
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
		
		
		
	}//cierre del Main

}// Cierre de la clase
